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
 * Created by Karan92 on 4/15/2015.
 */
public class TeamListAdapter extends RecyclerView.Adapter<TeamListAdapter.ViewHolder> {

    List<Map<String,?>> mDataset;
    Context mContext;
    OnItemClickListener mItemClickListner;

    public TeamListAdapter(Context context, List<Map<String, ?>> dataset){
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
    public TeamListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        v= LayoutInflater.from(mContext).inflate(R.layout.row_cardview_teams,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(TeamListAdapter.ViewHolder holder, int position) {
        final Map<String,?> item = mDataset.get(position);
        Glide.with(mContext).load((Integer) item.get("image")).into(holder.icon);
        holder.title.setText((String) item.get("title"));
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
            title = (TextView) itemView.findViewById(R.id.teamTitle);
            icon = (ImageView) itemView.findViewById(R.id.teamImg);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mItemClickListner != null) {
                        mItemClickListner.onItemClick(v, getPosition());
                    }
                }
            });

        }
    }
}
