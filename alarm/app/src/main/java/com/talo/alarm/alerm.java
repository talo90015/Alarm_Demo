package com.talo.alarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.widget.Toast;
public class alerm extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "鬧鐘 !", Toast.LENGTH_SHORT).show();
        Vibrator vibrator = (Vibrator)context.getSystemService(context.VIBRATOR_SERVICE);
        vibrator.vibrate(10000);
    }
}
