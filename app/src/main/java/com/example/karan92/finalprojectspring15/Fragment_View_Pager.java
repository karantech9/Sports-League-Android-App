package com.example.karan92.finalprojectspring15;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_View_Pager extends Fragment {
    private MyFragmentPagerAdapter myPagerAdapter;
    private ViewPager mViewPager;
    private static String ARG_SECTION_NUMBER = "section_number";

    public Fragment_View_Pager() {
        // Required empty public constructor
    }


    public static Fragment_View_Pager newInstance(int position){
        Fragment_View_Pager fragment = new Fragment_View_Pager();
        Bundle args = new Bundle();
        args.putSerializable(ARG_SECTION_NUMBER, position);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v;
        v = inflater.inflate(R.layout.fragment_view__pager, container, false);

        myPagerAdapter = new MyFragmentPagerAdapter(getActivity().getSupportFragmentManager());
        mViewPager = (ViewPager) v.findViewById(R.id.pager);
        //customizeViewPager();
        mViewPager.setAdapter(myPagerAdapter);

        mViewPager.setCurrentItem((Integer) getArguments().getSerializable(ARG_SECTION_NUMBER));

        return v;
    }

    @Override
    public void onResume() {
        super.onResume();
        ((ActionBarActivity)getActivity()).getSupportActionBar().setTitle("Squad");
    }

}
