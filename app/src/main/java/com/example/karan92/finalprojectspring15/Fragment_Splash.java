package com.example.karan92.finalprojectspring15;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_Splash extends Fragment {


    private static String TAG = MainActivity.class.getName();
    private static long SLEEP_TIME = 1;    // Sleep for some time

    public Fragment_Splash() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_splash, container, false);

        // Start timer and launch another activity
        IntentLauncher launcher = new IntentLauncher();
        launcher.start();
        return rootView;
    }


    private class IntentLauncher extends Thread {
        @Override
        /**
         * Sleep for some time and than start new activity.
         */
        public void run() {
            try {
                // Sleeping
                Thread.sleep(SLEEP_TIME*1000);
            } catch (Exception e) {
                Log.e(TAG, e.getMessage());
            }

            Intent i = new Intent(getActivity(),HomeActivity.class);
            startActivity(i);
            getActivity().finish()
            ;

        }
    }




}
