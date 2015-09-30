package com.example.dinesh.backgroundservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Class which is used to receive broadcast and process as needed
 */
public class BroadCastReceiver extends BroadcastReceiver {
    public static final String TAG = BroadCastReceiver.class.getSimpleName();



    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onReceive This is broadcast Receiver");
    }
}
