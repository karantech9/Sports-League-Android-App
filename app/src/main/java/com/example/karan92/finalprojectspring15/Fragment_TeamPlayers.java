package com.example.karan92.finalprojectspring15;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.HashMap;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_TeamPlayers extends Fragment {
    private static String ARG_PLAYER = "player";

    public Fragment_TeamPlayers() {
        // Required empty public constructor
    }
    public static Fragment_TeamPlayers newInstance(HashMap<String, ?> player){
        Fragment_TeamPlayers fragment = new Fragment_TeamPlayers();
        Bundle args = new Bundle();
        args.putSerializable(ARG_PLAYER, player);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_team_players, container, false);
    }
    @Override
    public void onResume() {
        super.onResume();
        ((ActionBarActivity)getActivity()).getSupportActionBar().setTitle("Squad");
    }


}
