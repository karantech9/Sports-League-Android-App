package com.example.karan92.finalprojectspring15;

import android.content.Context;
import android.graphics.Color;
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
 * Created by Karan92 on 3/7/2015.
 */
public class MyDrawerRecyclerViewAdapter extends RecyclerView.Adapter<MyDrawerRecyclerViewAdapter.ViewHolder> {

    List<Map<String,?>> mDataset;
    Context mContext;
    int mOption;
    OnItemClickListener mItemClickListner;
    int mCurrentPosition;

    public MyDrawerRecyclerViewAdapter(Context context, List<Map<String, ?>> dataset, int option){
        mDataset = dataset;
        mContext = context;
        mOption = option;
    }

    public interface OnItemClickListener {
        public void onItemClick(View view, int position);
    }

    public void SetOnItemClickListener(OnItemClickListener mItemClickListner) {
        this.mItemClickListner = mItemClickListner;
    }

    public Object getItem(int position) {
        return mDataset.get(position);
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView icon;
        public TextView title;
        public TextView divider;
        public View vView;
        int vViewtype;

        public ViewHolder(View v, int viewType){
            super(v);
            vView = v;
            vViewtype = viewType;
            title = (TextView) v.findViewById(R.id.title);
            icon = (ImageView) v.findViewById(R.id.icon);
            divider = (TextView) v.findViewById(R.id.divider);

            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(mItemClickListner != null){
                        mItemClickListner.onItemClick(v, getPosition());
                    }
                    mCurrentPosition = getPosition();
                    notifyDataSetChanged();
                }
            });

        }

        public void bindMovieData(Map<String,?> movie, int position){
            if(position == 7)
                vView.setEnabled(false);
            else if(position == mCurrentPosition)
                vView.setBackgroundColor(Color.LTGRAY);
            else
                vView.setBackgroundColor(0x00000000);
            title.setText((String) movie.get("title"));
            Glide.with(mContext).load((Integer) movie.get("image")).into(icon);
            divider.setText("");
        }
    }

    @Override
    public int getItemViewType(int position){
        final Map<String,?> movie = mDataset.get(position);
        return (Integer) movie.get("type");
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = null;
        if(viewType==1)
            v= LayoutInflater.from(parent.getContext()).inflate(R.layout.nd_image,parent,false);
        if(viewType==2)
            v= LayoutInflater.from(parent.getContext()).inflate(R.layout.nd_divider,parent,false);
        if(viewType==3)
            v= LayoutInflater.from(parent.getContext()).inflate(R.layout.nd_text,parent,false);
        if(viewType==4)
            v= LayoutInflater.from(parent.getContext()).inflate(R.layout.nd_bottomimage,parent,false);

        ViewHolder vh = new ViewHolder(v,viewType);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {

        final Map<String,?> movie = mDataset.get(i);
        viewHolder.bindMovieData(movie, i);
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
