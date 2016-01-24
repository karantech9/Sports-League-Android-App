package com.example.karan92.finalprojectspring15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Karan92 on 4/18/2015.
 */
public class VideoList {
    List<Map<String,?>> venueList;

    public List<Map<String, ?>> getItemList() {
        return venueList;
    }

    public int getSize(){
        return venueList.size();
    }

    public HashMap getItem(int i){
        if (i >=0 && i < venueList.size()){
            return (HashMap) venueList.get(i);
        } else return null;
    }
    public boolean isSelected;
    public void setSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }

    public VideoList(){
        String title;
        String subTitle;
        venueList = new ArrayList<Map<String,?>>();

        title = "Motera, Ahmedabad";
        subTitle = "Home of Rajasthan Rolays";
        venueList.add(item(title,subTitle,R.drawable.venahmedabad));

        title = "Chinnaswamy, Bengaluru";
        subTitle = "Home of Royal Challengers Bangalore";
        venueList.add(item(title,subTitle,R.drawable.venbangalore));

        title = "Chidambaram, Chennai";
        subTitle = "Home of Chennai Super Kings";
        venueList.add(item(title,subTitle,R.drawable.venchennai));

        title = "Ferozeshah Kotla, Delhi";
        subTitle = "Home of Delhi Daredevils";
        venueList.add(item(title,subTitle,R.drawable.vendelhi));

        title = "RGI Stadium, Hyderabad";
        subTitle = "Home of Sunrisers Hyderabad";
        venueList.add(item(title,subTitle,R.drawable.venhydrabad));

        title = "Eden Gardens, Kolkata";
        subTitle = "Home of Kolkata Knight Riders";
        venueList.add(item(title,subTitle,R.drawable.venkolkatta));

        title = "PCA Stadium, Mohali";
        subTitle = "Home of Kings XI Punjab";
        venueList.add(item(title,subTitle,R.drawable.venpunjab));

        title = "Wankhede, Mumbai";
        subTitle = "Home of Mumbai Indians";
        venueList.add(item(title,subTitle,R.drawable.venmumbaiw));

        title = "Brabourne, Mumbai";
        subTitle = "Home of Mumbai Indians";
        venueList.add(item(title,subTitle,R.drawable.venmumbaibb));

        title = "MCA Stadium, Pune";
        subTitle = "Home of Kings XI Punjab";
        venueList.add(item(title,subTitle,R.drawable.venpune));

        title = "Shaheed Veer, Raipur";
        subTitle = "Home of Delhi Dare Devils";
        venueList.add(item(title,subTitle,R.drawable.venraipur));

        title = "ACA-VDCA, Visakhapatnam";
        subTitle = "Home of the Sunrisers Hyderabad";
        venueList.add(item(title,subTitle,R.drawable.venvisakhapatnam));

    }


    private HashMap item(String title,String subTitle, int image) {
        HashMap item = new HashMap();
        item.put("title",title);
        item.put("subTitle",subTitle);
        item.put("image", image);

        return item;
    }
}
