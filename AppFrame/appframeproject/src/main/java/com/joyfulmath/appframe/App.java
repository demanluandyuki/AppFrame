package com.joyfulmath.appframe;

import android.app.Application;

import com.joyfulmath.publicutils.ImageUtils.ImageLoadManger;
import com.joyfulmath.publicutils.utils.DevUtils;

/**
 * Created by deman on 2016/3/30.
 */
public class App extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        initApp();
    }

    private void initApp() {
        ImageLoadManger.getsInstance().initManager(this.getApplicationContext());
        DevUtils.init();
    }
}
