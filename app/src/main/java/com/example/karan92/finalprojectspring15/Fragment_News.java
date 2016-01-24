package com.example.karan92.finalprojectspring15;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import se.emilsjolander.flipview.FlipView;
import se.emilsjolander.flipview.OverFlipMode;



/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_News extends Fragment {

    private FlipView mFlipView;
    private FlipAdapter mAdapter;
    private NewsList newsDetails;
    private static int pos;


    public Fragment_News() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override
    public void onPause() {
        super.onPause();
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v;
        v = inflater.inflate(R.layout.fragment_news, container, false);
        mFlipView = (FlipView) v.findViewById(R.id.flip_view);
        mAdapter = new FlipAdapter(getActivity(),(new NewsList().newsList));
        mFlipView.setAdapter(mAdapter);
        mFlipView.peakNext(false);
        mFlipView.setOverFlipMode(OverFlipMode.RUBBER_BAND);
        return v;
    }

    @Override
    public void onResume() {
        super.onResume();
        ((ActionBarActivity)getActivity()).getSupportActionBar().setTitle("News");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ((ActionBarActivity) getActivity()).getSupportActionBar().setTitle("Home");
    }

}
