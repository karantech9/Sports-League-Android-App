package com.example.karan92.finalprojectspring15;

import android.app.Activity;
import android.os.AsyncTask;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;
import java.util.Map;

/**
 * Created by Karan92 on 4/12/2015.
 */
public class GetHomeItemAsync extends AsyncTask<Void,Void,List<Map<String,?>>> {
    Activity activity;
    RecyclerView mRecyclerView;
    LinearLayoutManager mLayoutManager;
    HomeScreenItemAdapter homeScreenItemAdapter;

    public GetHomeItemAsync(Activity activity, RecyclerView recyclerView, LinearLayoutManager layoutManager)
    {
        this.activity = activity;
        mRecyclerView =recyclerView;
        mLayoutManager = layoutManager;
    }
    @Override
    protected List<Map<String, ?>> doInBackground(Void... params) {
        List<Map<String,?>> items = new HomeScreenItems().getItemList();
        return items;
    }

    @Override
    protected void onPostExecute(List<Map<String,?>> items) {
        homeScreenItemAdapter = new HomeScreenItemAdapter(activity,(new HomeScreenItems().getItemList()));
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(homeScreenItemAdapter);
     }
}
