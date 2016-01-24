package com.example.karan92.finalprojectspring15;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_News_Details extends Fragment {
    private static String ARG_POS = "news";
    private HashMap<String, ?> news;


    public Fragment_News_Details() {
        // Required empty public constructor
    }

    public static Fragment_News_Details newInstance(HashMap<String, ?> news){
        Fragment_News_Details fragment = new Fragment_News_Details();
        Bundle args = new Bundle();
        args.putSerializable(ARG_POS, news);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v;
        v = inflater.inflate(R.layout.fragment_news_details, container, false);
        Toast.makeText(getActivity(),"Scroll down to read Article",Toast.LENGTH_SHORT).show();
        TextView text = (TextView) v.findViewById(R.id.text);
        TextView details = (TextView) v.findViewById(R.id.details);
        TextView place = (TextView) v.findViewById(R.id.place);
        TextView date = (TextView) v.findViewById(R.id.date);
        ImageButton img = (ImageButton) v.findViewById(R.id.image);
        news = (HashMap<String, ?>) getArguments().getSerializable(ARG_POS);
        HashMap hm = news;
        Set set = hm.entrySet();
        // Get an iterator
        Iterator i = set.iterator();
        // Display elements
        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            if(me.getKey()=="title")
            {
                text.setText((CharSequence) me.getValue());
            }
            if(me.getKey()=="image")
            {
                img.setImageResource((Integer) me.getValue());
            }
            if(me.getKey()=="details")
            {
                details.setText((CharSequence) me.getValue());
            }
            if(me.getKey()=="place")
            {
                place.setText((CharSequence) me.getValue());
            }
            if(me.getKey()=="date")
            {
                date.setText((CharSequence) me.getValue());
            }
        }

        return v;

    }


}
