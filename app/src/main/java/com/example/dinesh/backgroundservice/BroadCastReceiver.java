package com.example.dinesh.backgroundservice;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

/**
 * Class which is used to receive broadcast and process as needed
 */
public class BroadCastReceiver extends BroadcastReceiver {
    public static final String TAG = BroadCastReceiver.class.getSimpleName();
    Context appContext;

    public BroadCastReceiver(Context context) {
        super();
        this.appContext = context;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onReceive This is broadcast Receiver");
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this.appContext).setSmallIcon(R.mipmap.ic_launcher).setContentTitle("You got a message").setContentText("This is the message");
        NotificationManager notificationManager = (NotificationManager) appContext.getSystemService(this.appContext.NOTIFICATION_SERVICE);
        notificationManager.notify(1, mBuilder.build());
    }
}
