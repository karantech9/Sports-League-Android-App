package com.example.karan92.finalprojectspring15;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;

import jp.wasabeef.recyclerview.animators.FadeInAnimator;
import jp.wasabeef.recyclerview.animators.adapters.AlphaInAnimationAdapter;
import jp.wasabeef.recyclerview.animators.adapters.ScaleInAnimationAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_Teams extends Fragment {

    RecyclerView mRecyclerView;
    LinearLayoutManager mLayoutManager;
    TeamListAdapter teamListAdapter;
    OnListItemSelectedListnerTeam mListner;


    public Fragment_Teams() {
        // Required empty public constructor
    }

    public interface OnListItemSelectedListnerTeam{
        public void onListTeamSelected(int position);
    }

    @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);
        try{
            mListner =(OnListItemSelectedListnerTeam) activity;
        } catch (ClassCastException e)
        {
            throw new ClassCastException(activity.toString()+"must implement OnfragmentInteractionListener");
        }
    }

    @Override
    public void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setHasOptionsMenu(false);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView;
//        ((ActionBarActivity) getActivity()).getSupportActionBar().setTitle("Teams");
        rootView = inflater.inflate(R.layout.fragment_venues, container, false);
        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.cardList);
        mRecyclerView.setItemAnimator(new FadeInAnimator());

        //        GetHomeItemAsync setUpHomeItems = new GetHomeItemAsync(getActivity(),mRecyclerView,mLayoutManager);
//        setUpHomeItems.execute();
        teamListAdapter = new TeamListAdapter(getActivity(),(new IPLTeamList().getItemList()));
        AlphaInAnimationAdapter alphaAdapter = new AlphaInAnimationAdapter(teamListAdapter);
        ScaleInAnimationAdapter scaleAdapter = new ScaleInAnimationAdapter(alphaAdapter);
        scaleAdapter.setFirstOnly(false);
        scaleAdapter.setInterpolator(new OvershootInterpolator());
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        scaleAdapter.setDuration(700);
        mRecyclerView.setAdapter(scaleAdapter);
        setRetainInstance(true);
        teamListAdapter.SetOnItemClickListener(new TeamListAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                mListner.onListTeamSelected(position);

            }
        });
        return rootView;
    }
    @Override
    public void onResume() {
        super.onResume();
        ((ActionBarActivity)getActivity()).getSupportActionBar().setTitle("Teams");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ((ActionBarActivity) getActivity()).getSupportActionBar().setTitle("Home");
    }
}


