package com.example.dinesh.backgroundservice;

import android.app.IntentService;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;

public class AlarmSetter extends IntentService {
    public static final String TAG = AlarmSetter.class.getSimpleName();


    public AlarmSetter() {
        super("Hello World");
        Log.d(TAG, "AlarmSetter ");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate of alarm setter intent service");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d(TAG, "onHandleIntent ");
        synchronized (intent) {
            while (true) {
                try {
                    Thread.sleep(10000);
                    Intent localIntent = new Intent(Constants.BROADCAST_ACTION).putExtra(Constants.EXTENDED_DATA_STATUS, 108);
                    LocalBroadcastManager.getInstance(this).sendBroadcast(localIntent);
                    Log.d(TAG, "onHandleIntent I hope this will keep on executing");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
