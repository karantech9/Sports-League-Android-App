package com.example.karan92.finalprojectspring15;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_TeamDetails extends Fragment {

    private HashMap<String, ?> team;
    private static String ARG_POS = "team";
//    private static AdapterForViewPagerFragments mViewPagerAdapter;
//    private static ViewPager mViewPager;
//    private static Kingdoms kingdom;
//    private static String previousKingdomId;
//    private static String previousKingdomName;
//    private static QuestBackgroundTask mQuestBackgroundTask;
    private static List<android.support.v4.app.Fragment> requiredFragments;
    private Toolbar mToolbar;
    private ProgressBar mProgressBar;

    public Fragment_TeamDetails() {
        // Required empty public constructor
    }

    public static Fragment_TeamDetails newInstance(HashMap<String, ?> team){
        Fragment_TeamDetails fragment = new Fragment_TeamDetails();
        Bundle args = new Bundle();
        args.putSerializable(ARG_POS, team);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v;
        v = inflater.inflate(R.layout.fragment_team_details, container, false);
        List<android.support.v4.app.Fragment> fList = new ArrayList<android.support.v4.app.Fragment>();
        //Load Kingdom Fragment first
//        fList.add(KingdomViewPagerFragment.newInstance(kingdom));
//
//        for(Kingdoms.Quest quest: kingdom.getQuests()){
//            //Load quest fragment thereafter
//            fList.add(QuestViewPagerFragment.newInstance(quest));
//
//        }

        requiredFragments = fList;
        return v;
    }


}
