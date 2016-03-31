package com.joyfulmath.appframe;

import android.app.Application;

import com.joyfulmath.publicutils.ImageUtils.ImageLoadManger;

/**
 * Created by deman on 2016/3/30.
 */
public class App extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        ImageLoadManger.getsInstance().initManager(this.getApplicationContext());
    }
}
