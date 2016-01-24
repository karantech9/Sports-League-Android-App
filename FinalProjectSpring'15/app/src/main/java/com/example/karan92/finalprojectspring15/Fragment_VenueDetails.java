package com.example.karan92.finalprojectspring15;


import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_VenueDetails extends Fragment {


    private GoogleMap googleMap;
    private static View view;
    private CameraPosition cp;
    private HashMap<String, ?> stadium;
    private static String ARG_POS = "stadium";
    public static double latitude = 0;
    public static double longitude = 0;
    public static String title = null;


    public static Fragment_VenueDetails newInstance(HashMap<String, ?> stadium){
        Fragment_VenueDetails fragment = new Fragment_VenueDetails();
        Bundle args = new Bundle();
        args.putSerializable(ARG_POS, stadium);
        fragment.setArguments(args);
        return fragment;
    }

     public Fragment_VenueDetails() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       // Inflate the layout for this fragment
        if (view != null) {
            ViewGroup parent = (ViewGroup) view.getParent();
            if (parent != null)
                parent.removeView(view);
        }
        try {
            view = inflater.inflate(R.layout.fragment_venue_details, container, false);
            setRetainInstance(true);
        } catch (InflateException e) {
        /* map is already there, just return view as it is */
        }
        ((ActionBarActivity) getActivity()).getSupportActionBar().setTitle("Venue Details");

        ImageView image = (ImageView) view.findViewById(R.id.venueImg);
        TextView location = (TextView)view.findViewById(R.id.venueLocationText);
        TextView capacity = (TextView)view.findViewById(R.id.venueCapacityText);
        TextView ends = (TextView)view.findViewById(R.id.venueEndsText);
        TextView about = (TextView)view.findViewById(R.id.venurAboutText);
        TextView title = (TextView)view.findViewById(R.id.venueTitle);
        final ScrollView mainScrollView = (ScrollView) view.findViewById(R.id.scroll);
        ImageView transparentImageView = (ImageView) view.findViewById(R.id.transparent_image);

        transparentImageView.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getAction();
                switch (action) {
                    case MotionEvent.ACTION_DOWN:
                        // Disallow ScrollView to intercept touch events.
                        mainScrollView.requestDisallowInterceptTouchEvent(true);
                        // Disable touch on transparent view
                        return false;

                    case MotionEvent.ACTION_UP:
                        // Allow ScrollView to intercept touch events.
                        mainScrollView.requestDisallowInterceptTouchEvent(false);
                        return true;

                    case MotionEvent.ACTION_MOVE:
                        mainScrollView.requestDisallowInterceptTouchEvent(true);
                        return false;

                    default:
                        return true;
                }
            }
        });

        stadium = (HashMap<String, ?>) getArguments().getSerializable(ARG_POS);
        HashMap hm = stadium;
        Set set = hm.entrySet();
        // Get an iterator
        Iterator i = set.iterator();
        // Display elements
        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            if(me.getKey()=="location")
            {
                location.setText((CharSequence) me.getValue());
            }
            if(me.getKey()=="seatingCapacity")
            {
                capacity.setText((CharSequence) me.getValue());
            }
            if(me.getKey()=="end1")
            {
                ends.setText((CharSequence) me.getValue());
            }
            if(me.getKey()=="about")
            {
                about.setText((CharSequence) me.getValue());
            }
            if(me.getKey()=="image")
            {
                image.setImageResource((Integer) me.getValue());
            }
            if(me.getKey()=="latitude")
            {
                latitude = (Double) me.getValue();
            }
            if(me.getKey()=="longitude")
            {
                longitude = (Double) me.getValue();
            }
            if(me.getKey()=="title")
            {
                title.setText((CharSequence) me.getValue());
            }
        }
        getMap();
         // Restoring the markers on configuration changes
        return view;
    }

    public void getMap()
    {
        LatLng StadiumLocation = new LatLng(latitude, longitude);
        try {
            if (googleMap == null) {
                googleMap = ((MapFragment) getActivity().getFragmentManager().findFragmentById(R.id.map)).getMap();
            }
            googleMap.clear();
            googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(latitude, longitude), 15));
            Marker TP = googleMap.addMarker(new MarkerOptions().
                    position(StadiumLocation).title(title));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig)
    {
        super.onConfigurationChanged(newConfig);
        getMap();
    }
}