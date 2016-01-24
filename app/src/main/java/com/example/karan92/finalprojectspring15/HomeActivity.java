package com.example.karan92.finalprojectspring15;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

import java.util.HashMap;

public class HomeActivity extends ActionBarActivity implements RecyclerViewFragment.OnListItemSelectedListner, Fragment_Home.OnListItemSelectedListner, Fragment_Venues.OnListItemSelectedListnerVenues,Fragment_Teams.OnListItemSelectedListnerTeam {
    Toolbar mToolbar;
    DrawerLayout mDrawerLayout;
    ActionBarDrawerToggle mDrawerToggle;
    RecyclerView mDrawerList;
    MyDrawerRecyclerViewAdapter myBaseAdapter;
    LinearLayout mDrawer;
    StadiumDetails stadiumDetails;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.android_main2);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setTitle("Home");
        mDrawer = (LinearLayout) findViewById(R.id.drawer);
        mDrawerList = (RecyclerView) findViewById(R.id.drawer_list);
        mDrawerList.setLayoutManager(new LinearLayoutManager(this));
        myBaseAdapter = new MyDrawerRecyclerViewAdapter(this, (new NavigationDrawerItems()).getItemList(), 0);
        mDrawerList.setAdapter(myBaseAdapter);
        myBaseAdapter.SetOnItemClickListener(new MyDrawerRecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                selectItem(position);
            }
            private void selectItem(int position) {
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);
                switch (position) {
                    case 1:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.container, new Fragment_Home())
                                .addToBackStack(null)
                                .commit();
                        break;
                    case 2:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.container, new Fragment_Teams())
                                .addToBackStack(null)
                                .commit();
                        break;
                    case 3:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.container, new Fragment_Venues())
                                .addToBackStack(null)
                                .commit();
                        break;
                    case 4:
                        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.container, new Fragment_News())
                                .addToBackStack(null)
                                .commit();
                        break;
                    case 5:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.container, new Fragment_Photos())
                                .addToBackStack(null)
                                .commit();
                        break;
                    case 6:
                        Intent i = new Intent(getApplicationContext(),VideosActivity.class);
                        startActivity(i);
                        break;
                    default:
                        break;
                }
                mDrawerLayout.closeDrawer(mDrawer);
            }
        });
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, R.string.drawer_open, R.string.drawer_close);
        mDrawerLayout.setDrawerListener(mDrawerToggle);
        mDrawerToggle.syncState();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new Fragment_Home())
                    .commit();
        }


    }

    @Override
    public void onListitemSelected(int position) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);
        switch (position){
            case 1:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, new Fragment_Teams())
                        .addToBackStack(null)
                        .commit();
                break;
            case 2:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, new Fragment_Venues())
                        .addToBackStack(null)
                        .commit();
                break;
            case 3:
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, new Fragment_News())
                        .addToBackStack(null)
                        .commit();
                break;
            case 4:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, new Fragment_Photos())
                        .addToBackStack(null)
                        .commit();
                break;
            case 5:
                Intent i = new Intent(this,VideosActivity.class);
                startActivity(i);
                break;
            case 6:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, new Fragment_About())
                        .addToBackStack(null)
                        .commit();
                break;
            default:
                break;
        }

    }

    @Override
    public void onListTeamSelected(int position) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, Fragment_View_Pager.newInstance(position))
                .addToBackStack(null)
                .commit();
    }

    @Override
    public void onResume() {
        super.onResume();
        // Set title
        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setTitle("Home");

    }
    @Override
    public void onListVenueSelected(int position) {
        stadiumDetails = new StadiumDetails();
        HashMap<String,?> stadium = stadiumDetails.getItem(position);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, Fragment_VenueDetails.newInstance(stadium))
                .addToBackStack(null)
                .commit();
    }


    @Override
    public void onListitemSelected(int position, HashMap<String, ?> player) {
        AlertDialog alertDialog = new AlertDialog.Builder(HomeActivity.this).create(); //Read Update
        alertDialog.setIcon((Integer) player.get("image"));
        alertDialog.setTitle((CharSequence) player.get("title"));
        alertDialog.setMessage((CharSequence) player.get("profile"));

        alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // here you can add functions
            }
        });
        alertDialog.show();  //<-- See This!
    }
}