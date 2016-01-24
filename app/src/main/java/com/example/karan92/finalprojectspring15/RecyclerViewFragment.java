package com.example.karan92.finalprojectspring15;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;

import java.util.HashMap;

import jp.wasabeef.recyclerview.animators.FadeInAnimator;
import jp.wasabeef.recyclerview.animators.SlideInRightAnimator;
import jp.wasabeef.recyclerview.animators.adapters.AlphaInAnimationAdapter;
import jp.wasabeef.recyclerview.animators.adapters.ScaleInAnimationAdapter;
import jp.wasabeef.recyclerview.animators.adapters.SlideInLeftAnimationAdapter;
import jp.wasabeef.recyclerview.animators.adapters.SlideInRightAnimationAdapter;


/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 */
public class RecyclerViewFragment extends Fragment {
    private static String ARG_SECTION_NUMBER = "section_number";

    private CSKTeamDetails cskteam;
    private KKRTeamDetails kkrteam;
    private DDTeamDetails ddteam;
    private MITeamDetails miteam;
    private RCBTeamDetails rcbteam;
    private PKXITeamDetails pkxiteam;
    private RRTeamDetails rrteam;
    private SRHTeamDetails srhteam;
    private RecyclerView mRecyclerView;
    private MyRecyclerViewAdapter myRecyclerViewAdapter;
    private OnListItemSelectedListner mListner;
    private LayoutManager mLayoutManager;
    private Menu menusave;
    public interface OnListItemSelectedListner{
        public void onListitemSelected(int position, HashMap<String, ?> player);
    }

    @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);
        try{
            mListner =(OnListItemSelectedListner) activity;
        } catch (ClassCastException e)
        {
            throw new ClassCastException(activity.toString()+"must implement OnfragmentInteractionListener");
        }
    }

    @Override
    public void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setHasOptionsMenu(true);
        cskteam = new CSKTeamDetails();
        kkrteam = new KKRTeamDetails();
        ddteam = new DDTeamDetails();
        srhteam = new SRHTeamDetails();
        rcbteam = new RCBTeamDetails();
        pkxiteam = new PKXITeamDetails();
        miteam = new MITeamDetails();
        rrteam = new RRTeamDetails();
    }

    public static RecyclerViewFragment newInstance(int sectionNumber) {
        RecyclerViewFragment fragment = new RecyclerViewFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public RecyclerViewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView;
        int option = getArguments().getInt(ARG_SECTION_NUMBER);
        switch(option){
            case 0:
                rootView = inflater.inflate(R.layout.fragment_recycler_view, container, false);
                mRecyclerView = (RecyclerView) rootView.findViewById(R.id.cardList);
                mLayoutManager = new LinearLayoutManager(getActivity());
                mRecyclerView.setHasFixedSize(true);
                mRecyclerView.setLayoutManager(mLayoutManager);
                myRecyclerViewAdapter = new MyRecyclerViewAdapter(getActivity(),cskteam.getItemList(),0);
                AlphaInAnimationAdapter alphaAdapter = new AlphaInAnimationAdapter(myRecyclerViewAdapter);
                SlideInLeftAnimationAdapter slideInAdapter = new SlideInLeftAnimationAdapter(alphaAdapter);
                slideInAdapter.setFirstOnly(false);
                slideInAdapter.setInterpolator(new OvershootInterpolator());
                slideInAdapter.setDuration(800);
                mRecyclerView.setAdapter(slideInAdapter);
                break;
            case 1:
                rootView = inflater.inflate(R.layout.fragment_recycler_view, container, false);
                mRecyclerView = (RecyclerView) rootView.findViewById(R.id.cardList);
                mLayoutManager = new LinearLayoutManager(getActivity());
                mRecyclerView.setHasFixedSize(true);
                mRecyclerView.setLayoutManager(mLayoutManager);
                myRecyclerViewAdapter = new MyRecyclerViewAdapter(getActivity(),ddteam.getItemList(),0);
                AlphaInAnimationAdapter alphaAdapter1 = new AlphaInAnimationAdapter(myRecyclerViewAdapter);
                ScaleInAnimationAdapter scaleAdapter1 = new ScaleInAnimationAdapter(alphaAdapter1);
                scaleAdapter1.setFirstOnly(false);
                scaleAdapter1.setInterpolator(new OvershootInterpolator());
                scaleAdapter1.setDuration(800);
                mRecyclerView.setAdapter(scaleAdapter1);

                break;
            case 2:
                rootView = inflater.inflate(R.layout.fragment_recycler_view, container, false);
                mRecyclerView = (RecyclerView) rootView.findViewById(R.id.cardList);
                mRecyclerView.setItemAnimator(new SlideInRightAnimator());
                mLayoutManager = new LinearLayoutManager(getActivity());
                mRecyclerView.setHasFixedSize(true);
                mRecyclerView.setLayoutManager(mLayoutManager);
                myRecyclerViewAdapter = new MyRecyclerViewAdapter(getActivity(),pkxiteam.getItemList(),0);
                AlphaInAnimationAdapter alphaAdapter2 = new AlphaInAnimationAdapter(myRecyclerViewAdapter);
                ScaleInAnimationAdapter scaleAdapter2 = new ScaleInAnimationAdapter(alphaAdapter2);
                scaleAdapter2.setFirstOnly(false);
                scaleAdapter2.setInterpolator(new OvershootInterpolator());
                scaleAdapter2.setDuration(800);
                mRecyclerView.setAdapter(scaleAdapter2);

                break;
            case 3:
                rootView = inflater.inflate(R.layout.fragment_recycler_view, container, false);
                mRecyclerView = (RecyclerView) rootView.findViewById(R.id.cardList);
                mRecyclerView.setItemAnimator(new FadeInAnimator());
                mLayoutManager = new LinearLayoutManager(getActivity());
                mRecyclerView.setHasFixedSize(true);
                mRecyclerView.setLayoutManager(mLayoutManager);
                myRecyclerViewAdapter = new MyRecyclerViewAdapter(getActivity(),kkrteam.getItemList(),0);
                AlphaInAnimationAdapter alphaAdapter3 = new AlphaInAnimationAdapter(myRecyclerViewAdapter);
                ScaleInAnimationAdapter scaleAdapter3 = new ScaleInAnimationAdapter(alphaAdapter3);
                scaleAdapter3.setFirstOnly(false);
                scaleAdapter3.setInterpolator(new OvershootInterpolator());
                scaleAdapter3.setDuration(800);
                mRecyclerView.setAdapter(scaleAdapter3);

                break;
            case 4:
                rootView = inflater.inflate(R.layout.fragment_recycler_view, container, false);
                mRecyclerView = (RecyclerView) rootView.findViewById(R.id.cardList);
                mRecyclerView.setItemAnimator(new FadeInAnimator());
                mLayoutManager = new LinearLayoutManager(getActivity());
                mRecyclerView.setHasFixedSize(true);
                mRecyclerView.setLayoutManager(mLayoutManager);
                myRecyclerViewAdapter = new MyRecyclerViewAdapter(getActivity(),miteam.getItemList(),0);
                AlphaInAnimationAdapter alphaAdapter4 = new AlphaInAnimationAdapter(myRecyclerViewAdapter);
                ScaleInAnimationAdapter scaleAdapter4 = new ScaleInAnimationAdapter(alphaAdapter4);
                scaleAdapter4.setFirstOnly(false);
                scaleAdapter4.setInterpolator(new OvershootInterpolator());
                scaleAdapter4.setDuration(800);
                mRecyclerView.setAdapter(scaleAdapter4);

                break;
            case 5:
                rootView = inflater.inflate(R.layout.fragment_recycler_view, container, false);
                mRecyclerView = (RecyclerView) rootView.findViewById(R.id.cardList);
                mRecyclerView.setItemAnimator(new FadeInAnimator());
                mLayoutManager = new LinearLayoutManager(getActivity());
                mRecyclerView.setHasFixedSize(true);
                mRecyclerView.setLayoutManager(mLayoutManager);
                myRecyclerViewAdapter = new MyRecyclerViewAdapter(getActivity(),rrteam.getItemList(),0);
                AlphaInAnimationAdapter alphaAdapter5 = new AlphaInAnimationAdapter(myRecyclerViewAdapter);
                ScaleInAnimationAdapter scaleAdapter5 = new ScaleInAnimationAdapter(alphaAdapter5);
                scaleAdapter5.setFirstOnly(false);
                scaleAdapter5.setInterpolator(new OvershootInterpolator());
                scaleAdapter5.setDuration(800);
                mRecyclerView.setAdapter(scaleAdapter5);

                break;
            case 6:
                rootView = inflater.inflate(R.layout.fragment_recycler_view, container, false);
                mRecyclerView = (RecyclerView) rootView.findViewById(R.id.cardList);
                mRecyclerView.setItemAnimator(new FadeInAnimator());
                mLayoutManager = new LinearLayoutManager(getActivity());
                mRecyclerView.setHasFixedSize(true);
                mRecyclerView.setLayoutManager(mLayoutManager);
                myRecyclerViewAdapter = new MyRecyclerViewAdapter(getActivity(),rcbteam.getItemList(),0);
                AlphaInAnimationAdapter alphaAdapter6 = new AlphaInAnimationAdapter(myRecyclerViewAdapter);
                ScaleInAnimationAdapter scaleAdapter6 = new ScaleInAnimationAdapter(alphaAdapter6);
                scaleAdapter6.setFirstOnly(false);
                scaleAdapter6.setInterpolator(new OvershootInterpolator());
                scaleAdapter6.setDuration(800);
                mRecyclerView.setAdapter(scaleAdapter6);

                break;
            case 7:
                rootView = inflater.inflate(R.layout.fragment_recycler_view, container, false);
                mRecyclerView = (RecyclerView) rootView.findViewById(R.id.cardList);
                mLayoutManager = new LinearLayoutManager(getActivity());
                mRecyclerView.setHasFixedSize(true);
                mRecyclerView.setLayoutManager(mLayoutManager);
                myRecyclerViewAdapter = new MyRecyclerViewAdapter(getActivity(),srhteam.getItemList(),0);
                AlphaInAnimationAdapter alphaAdapter7 = new AlphaInAnimationAdapter(myRecyclerViewAdapter);
                SlideInRightAnimationAdapter slideAdapter7 = new SlideInRightAnimationAdapter(alphaAdapter7);
                slideAdapter7.setFirstOnly(false);
                slideAdapter7.setInterpolator(new OvershootInterpolator());
                slideAdapter7.setDuration(800);
                mRecyclerView.setAdapter(slideAdapter7);

                break;
            default:
                rootView = inflater.inflate(R.layout.fragment_recycler_view, container, false);
                mRecyclerView = (RecyclerView) rootView.findViewById(R.id.cardList);
                mLayoutManager = new LinearLayoutManager(getActivity());
                mRecyclerView.setHasFixedSize(true);
                mRecyclerView.setLayoutManager(mLayoutManager);
                myRecyclerViewAdapter = new MyRecyclerViewAdapter(getActivity(),cskteam.getItemList(),0);
                AlphaInAnimationAdapter alphaAdapter8 = new AlphaInAnimationAdapter(myRecyclerViewAdapter);
                ScaleInAnimationAdapter scaleAdapter8 = new ScaleInAnimationAdapter(alphaAdapter8);
                scaleAdapter8.setFirstOnly(false);
                scaleAdapter8.setInterpolator(new OvershootInterpolator());
                scaleAdapter8.setDuration(800);
                mRecyclerView.setAdapter(scaleAdapter8);

                break;
        }

        setRetainInstance(true);

        myRecyclerViewAdapter.SetOnItemClickListener(new MyRecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                int option = getArguments().getInt(ARG_SECTION_NUMBER);
                HashMap<String,?> playerDetail = null;
                switch (option)
                {
                    case 0:
                        playerDetail = (HashMap<String,?>) cskteam.getItem(position);
                        break;
                    case 1:
                        playerDetail = (HashMap<String,?>) ddteam.getItem(position);
                        break;
                    case 2:
                        playerDetail = (HashMap<String,?>) pkxiteam.getItem(position);
                        break;
                    case 3:
                        playerDetail = (HashMap<String,?>) kkrteam.getItem(position);
                        break;
                    case 4:
                        playerDetail = (HashMap<String,?>) miteam.getItem(position);
                        break;
                    case 5:
                        playerDetail = (HashMap<String,?>) rrteam.getItem(position);
                        break;
                    case 6:
                        playerDetail = (HashMap<String,?>) rcbteam.getItem(position);
                        break;
                    case 7:
                        playerDetail = (HashMap<String,?>) srhteam.getItem(position);
                        break;
                }
                mListner.onListitemSelected(position,playerDetail);
            }
        });

        return rootView;
    }
}
