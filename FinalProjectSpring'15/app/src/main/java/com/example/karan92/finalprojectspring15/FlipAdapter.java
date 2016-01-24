package com.example.karan92.finalprojectspring15;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

public class FlipAdapter extends BaseAdapter  {

    public interface Callback{
        public void onPageClicked(int position);
    }

    private final Context context;
    private final List<Map<String,?>> newsList;
    private Callback callback;


    public FlipAdapter(Context context, List<Map<String,?>> newsList)
    {
        this.context = context;
        this.newsList = newsList;
    }

    public void setCallback(Callback callback) {
        this.callback = callback;
    }


    @Override
    public int getCount() {
        return newsList.size();    }

    @Override
    public Object getItem(int position) {
        return newsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if(convertView == null){
            holder = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.page, parent, false);

            holder.text = (TextView) convertView.findViewById(R.id.text);
            holder.textDetails = (TextView) convertView.findViewById(R.id.details);
            holder.img_buttorn = (ImageButton) convertView.findViewById(R.id.image);
            holder.place = (TextView) convertView.findViewById(R.id.place);
            holder.date = (TextView) convertView.findViewById(R.id.date);

            convertView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(callback != null){
                        callback.onPageClicked(position);
                    }
                }
            });

            holder.img_buttorn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(callback != null){
                        callback.onPageClicked(position);
                    }
                }
            });

            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }

        Map<String,?> entry = newsList.get(position);
        holder.text.setText((String) entry.get("title"));
        holder.textDetails.setText((String) entry.get("details"));
        holder.place.setText((String) entry.get("place"));
        holder.date.setText((String) entry.get("date"));
        holder.img_buttorn.setImageResource((Integer) entry.get("image"));

        //  Glide.with(context).load((Integer) entry.get("image")).(img_button);

        return convertView;
    }

    static class ViewHolder{
        TextView text;
        ImageButton img_buttorn;
        TextView textDetails;
        TextView date;
        TextView place;
    }

}
