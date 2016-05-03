package com.joyfulmath.appframe;

import android.app.Activity;
import android.widget.TextView;

import com.joyfulmath.appframe.backdoor.ApiBackDoorActivity_;
import com.joyfulmath.appframe.business.map.view.MapActivity_;
import com.joyfulmath.appframe.business.recycleview.view.RecycleDemo_;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.LongClick;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
public class MainActivity extends Activity {



    @Click(R.id.tv_map)
    void onMapClick()
    {
        MapActivity_.intent(this).start();
    }

    @Click(R.id.tv_picasso)
    void onRecycleClick()
    {
        RecycleDemo_.intent(this).start();
    }

    @LongClick(R.id.tv_main)
    void onLongClick()
    {
        ApiBackDoorActivity_.intent(this).start();
    }
}
