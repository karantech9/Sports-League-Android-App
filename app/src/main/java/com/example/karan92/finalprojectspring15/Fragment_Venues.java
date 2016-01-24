package com.example.karan92.finalprojectspring15;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
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
public class Fragment_Venues extends Fragment {
    RecyclerView mRecyclerView;
    LinearLayoutManager mLayoutManager;
    VenueListAdapter venueListAdapter;
    OnListItemSelectedListnerVenues mListner;


    public Fragment_Venues() {
        // Required empty public constructor
    }

    public interface OnListItemSelectedListnerVenues{
        public void onListVenueSelected(int position);
    }

    @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);
        try{
            mListner =(OnListItemSelectedListnerVenues) activity;
        } catch (ClassCastException e)
        {
            throw new ClassCastException(activity.toString()+"must implement OnfragmentInteractionListener");
        }
    }

    @Override
    public void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView;
        rootView = inflater.inflate(R.layout.fragment_venues, container, false);
        ((ActionBarActivity) getActivity()).getSupportActionBar().setTitle("Venues");
        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.cardList);
        mLayoutManager = new LinearLayoutManager(getActivity());

        mRecyclerView.setItemAnimator(new FadeInAnimator());

        venueListAdapter = new VenueListAdapter(getActivity(),(new VenueList().getItemList()));
        AlphaInAnimationAdapter alphaAdapter = new AlphaInAnimationAdapter(venueListAdapter);
        ScaleInAnimationAdapter scaleAdapter = new ScaleInAnimationAdapter(alphaAdapter);
        scaleAdapter.setFirstOnly(false);
        scaleAdapter.setInterpolator(new OvershootInterpolator());
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(mLayoutManager);
        scaleAdapter.setDuration(700);
        mRecyclerView.setAdapter(scaleAdapter);
        setRetainInstance(true);
        venueListAdapter.SetOnItemClickListener(new VenueListAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                mListner.onListVenueSelected(position);
            }
        });
        return rootView;
    }
    @Override
    public void onResume() {
        super.onResume();
        ((ActionBarActivity)getActivity()).getSupportActionBar().setTitle("Venues");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ((ActionBarActivity) getActivity()).getSupportActionBar().setTitle("Home");
    }

}
