package com.example.karan92.finalprojectspring15;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

/**
 * Created by Karan92 on 2/11/2015.
 */
public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {

    List<Map<String,?>> mDataset;
    Context mContext;
    OnItemClickListener mItemClickListner;
    int mOption;

    public MyRecyclerViewAdapter(Context context, List<Map<String, ?>> myDataset, int mOption){
        mContext = context;
        mDataset = myDataset;
        this.mOption = mOption;
    }
    public Object getItem(int position) {
        return mDataset.get(position);
    }

    public interface OnItemClickListener {
        public void onItemClick(View view, int position);
    }

    public void SetOnItemClickListener(OnItemClickListener mItemClickListner) {
        this.mItemClickListner = mItemClickListner;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView playerImg;
        public TextView title;
        public TextView role;
        public TextView bats;
        public TextView bowls;
        public TextView nationality;
        public ViewHolder(View v){
            super(v);
            title = (TextView) v.findViewById(R.id.title);
            playerImg = (ImageView) v.findViewById(R.id.playerImg);
            role = (TextView) v.findViewById(R.id.roletext);
            bats = (TextView) v.findViewById(R.id.batstext);
            bowls = (TextView) v.findViewById(R.id.bowltext);
            nationality = (TextView) v.findViewById(R.id.nationalitytext);

            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(mItemClickListner != null){
                        mItemClickListner.onItemClick(v, getPosition());
                    }
                }
            });

        }

        public void bindMovieData(Map<String,?> movie){
            title.setText((String) movie.get("title"));
            playerImg.setImageResource((Integer) movie.get("image"));
            role.setText((String) movie.get("role"));
            bats.setText((String) movie.get("bats"));
            bowls.setText((String) movie.get("bowls"));
            nationality.setText((String) movie.get("nationality"));
        }
    }



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        v= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_cardview_team,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyRecyclerViewAdapter.ViewHolder holder, final int position) {
        final Map<String,?> movie = mDataset.get(position);
        holder.bindMovieData(movie);
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }


}
