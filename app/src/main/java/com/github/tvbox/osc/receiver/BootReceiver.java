package com.github.tvbox.osc.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.blankj.utilcode.util.LogUtils;


public class BootReceiver extends BroadcastReceiver {
    private final String TAG = "BootReceiver";
    @Override
    public void onReceive(Context context, Intent intent) {
        LogUtils.v(TAG,"show action ==>"+intent.getAction());
    }
}
