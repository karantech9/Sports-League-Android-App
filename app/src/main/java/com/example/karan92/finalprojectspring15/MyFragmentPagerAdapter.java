package com.example.karan92.finalprojectspring15;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.Locale;

/**
 * Created by Karan92 on 2/17/2015.
 */
public class MyFragmentPagerAdapter extends FragmentStatePagerAdapter {


    public MyFragmentPagerAdapter(FragmentManager fm){
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        return RecyclerViewFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return 8;
    }

    @Override
    public CharSequence getPageTitle(int position){
        Locale l = Locale.getDefault();
        String name;

        switch (position){
            case 0:
                name = "Chennai Super Kings";
                break;
            case 1:
                name = "Delhi Daredevils";
                break;
            case 2:
                name = "Kings XI Punjab";
                break;
            case 3:
                name = "Kolkata Knight Riders";
                break;
            case 4:
                name = "Mumbai Indians";
                break;
            case 5:
                name = "Rajasthan Royals";
                break;
            case 6:
                name = "Royal Challengers";
                break;
            case 7:
                name = "Sunrisers Hydrabad";
                break;
            default:
                name = "";
                break;
        }
        return name.toUpperCase(l);
    }
}
