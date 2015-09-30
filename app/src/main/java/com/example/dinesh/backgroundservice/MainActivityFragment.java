package com.example.dinesh.backgroundservice;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    public static final String TAG = MainActivityFragment.class.getSimpleName();

    public MainActivityFragment() {
        Log.d(TAG, "MainActivityFragment Constructor");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView Fragment");
//        Intent intent = new Intent(getContext(), AlarmSetter.class);
//        getActivity().startService(intent);
        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}
