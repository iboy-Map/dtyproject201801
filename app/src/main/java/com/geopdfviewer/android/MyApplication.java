package com.geopdfviewer.android;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePal;

/**
 * 静态应用类
 * 用于获取应用的全局context
 *
 */
public class MyApplication extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        LitePal.initialize(context);
    }

    public static Context getContext(){
        return context;
    }
}
