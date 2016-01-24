package com.example.karan92.finalprojectspring15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Karan92 on 4/11/2015.
 */
public class NavigationDrawerItems {

    List<Map<String,?>> navigationDrawerList;

    public List<Map<String, ?>> getItemList() {
        return navigationDrawerList;
    }

    public int getSize(){
        return navigationDrawerList.size();
    }

    public HashMap getItem(int i){
        if (i >=0 && i < navigationDrawerList.size()){
            return (HashMap) navigationDrawerList.get(i);
        } else return null;
    }
    public boolean isSelected;
    public void setSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }

    public NavigationDrawerItems(){
        String title;
        int type;

        navigationDrawerList = new ArrayList<Map<String,?>>();
        title = "";
        type = 2;
        navigationDrawerList.add(createMovie(title, R.drawable.nd_home, type));
        title = "Homepage";
        type = 1;
        navigationDrawerList.add(createMovie(title, R.drawable.nd_home, type));
        title = "Teams";
        type = 1;
        navigationDrawerList.add(createMovie(title, R.drawable.nd_teams, type));
        title = "Venues";
        type = 1;
        navigationDrawerList.add(createMovie(title, R.drawable.nd_vanues, type));
        title = "News Headlines";
        type = 1;
        navigationDrawerList.add(createMovie(title, R.drawable.nd_news, type));
        title = "Photos";
        type = 1;
        navigationDrawerList.add(createMovie(title, R.drawable.nd_vanues, type));
        title = "Videos";
        type = 1;
        navigationDrawerList.add(createMovie(title, R.drawable.nd_pointtable, type));
        title = "About";
        type = 1;
        navigationDrawerList.add(createMovie(title, R.drawable.nd_about, type));
        title = "";
        type = 2;
        navigationDrawerList.add(createMovie(title, R.drawable.nd_about, type));
        title = "";
        type = 4;
        navigationDrawerList.add(createMovie(title, R.drawable.logo, type));

    }


    private HashMap createMovie(String name, int image, int type) {
        HashMap movie = new HashMap();
        movie.put("title",name);
        movie.put("image", image);
        movie.put("type", type);
        return movie;
    }


}

