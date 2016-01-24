package com.example.karan92.finalprojectspring15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Karan92 on 4/15/2015.
 */
public class IPLTeamList {

    List<Map<String,?>> iplTeamList;

    public List<Map<String, ?>> getItemList() {
        return iplTeamList;
    }

    public int getSize(){
        return iplTeamList.size();
    }

    public HashMap getItem(int i){
        if (i >=0 && i < iplTeamList.size()){
            return (HashMap) iplTeamList.get(i);
        } else return null;
    }
    public boolean isSelected;
    public void setSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }

    public IPLTeamList(){
        String title;
        String subTitle;
        iplTeamList = new ArrayList<Map<String,?>>();

        title = "Chennai Super Kings";
        iplTeamList.add(item(title,R.drawable.team_csk));

        title = "Delhi Daredevils";
        iplTeamList.add(item(title,R.drawable.team_dd));

        title = "Kings XI Punjab";
        iplTeamList.add(item(title,R.drawable.team_kings));

        title = "Kolkata Knight Riders";
        iplTeamList.add(item(title,R.drawable.team_kkr));

        title = "Mumbai Indians";
        iplTeamList.add(item(title,R.drawable.team_mi));

        title = "Rajasthan Royals";
        iplTeamList.add(item(title,R.drawable.team_rr));

        title = "Royal Challengers";
        iplTeamList.add(item(title,R.drawable.team_rcb));

        title = "Sunrisers Hydrabad";
        iplTeamList.add(item(title,R.drawable.team_srh));

    }
    private HashMap item(String title, int image) {
        HashMap item = new HashMap();
        item.put("title",title);
        item.put("image", image);
        return item;
    }
}
