package com.example.karan92.finalprojectspring15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Karan92 on 4/11/2015.
 */
public class HomeScreenItems {
    List<Map<String,?>> homeScreenItem;

    public List<Map<String, ?>> getItemList() {
        return homeScreenItem;
    }

    public int getSize(){
        return homeScreenItem.size();
    }

    public HashMap getItem(int i){
        if (i >=0 && i < homeScreenItem.size()){
            return (HashMap) homeScreenItem.get(i);
        } else return null;
    }
    public boolean isSelected;
    public void setSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }

    public HomeScreenItems(){
        String title;
        int type;
        homeScreenItem = new ArrayList<Map<String,?>>();
        title = "";
        type = 2;
        homeScreenItem.add(item(title, R.drawable.trophy,type));
        title = "Teams";
        type = 1;
        homeScreenItem.add(item(title, R.drawable.team,type));
        title = "Venues";
        type = 1;
        homeScreenItem.add(item(title, R.drawable.venue,type));
        title = "News Headlines";
        type = 1;
        homeScreenItem.add(item(title, R.drawable.news,type));
        title = "Photos";
        type = 1;
        homeScreenItem.add(item(title, R.drawable.ipl_home1,type));
        title = "Videos";
        type = 1;
        homeScreenItem.add(item(title, R.drawable.video,type));
        title = "About";
        type = 1;
        homeScreenItem.add(item(title, R.drawable.about,type));

    }


    private HashMap item(String name, int image, int type) {
        HashMap item = new HashMap();
        item.put("title",name);
        item.put("image", image);
        item.put("type",type);
        return item;
    }
}
