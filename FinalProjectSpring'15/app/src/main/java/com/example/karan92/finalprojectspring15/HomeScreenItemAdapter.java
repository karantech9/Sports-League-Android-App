package com.example.karan92.finalprojectspring15;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;
import java.util.Map;

/**
 * Created by Karan92 on 4/12/2015.
 */
public class HomeScreenItemAdapter extends RecyclerView.Adapter<HomeScreenItemAdapter.ViewHolder> {

    List<Map<String,?>> mDataset;
    Context mContext;
    OnItemClickListener mItemClickListner;

    public HomeScreenItemAdapter(Context context, List<Map<String, ?>> dataset){
        mDataset = dataset;
        mContext = context;
    }

    public interface OnItemClickListener {
        public void onItemClick(View view, int position);
    }

    public void SetOnItemClickListener(OnItemClickListener mItemClickListner) {
        this.mItemClickListner = mItemClickListner;
    }

    @Override
    public int getItemViewType(int position){
        final Map<String,?> item = mDataset.get(position);
        return (Integer) item.get("type");
    }

    @Override
    public HomeScreenItemAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        if(viewType==1)
            v= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_cardview,parent,false);
        else
            v= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_cardview1,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(HomeScreenItemAdapter.ViewHolder holder, int position) {
        final Map<String,?> item = mDataset.get(position);
        holder.bindItems(item, position);
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView icon;
        public TextView title;

        public ViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.homeItemTitle);
            icon = (ImageView) itemView.findViewById(R.id.homeItemImage);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mItemClickListner != null) {
                        mItemClickListner.onItemClick(v, getPosition());
                    }
                }
            });

        }

        public void bindItems(Map<String,?> item, int position){
            title.setText((String) item.get("title"));
            Glide.with(mContext).load((Integer) item.get("image")).into(icon);
        }

    }
}

