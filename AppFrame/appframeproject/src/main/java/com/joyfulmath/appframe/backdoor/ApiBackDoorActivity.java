package com.joyfulmath.appframe.backdoor;

import android.app.Activity;
import android.widget.TextView;

import com.joyfulmath.appframe.R;
import com.joyfulmath.publicutils.utils.DevUtils;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

/**
 * @author deman.lu
 * @version on 2016-04-07 14:13
 */
@EActivity(R.layout.activity_backdoor)
public class ApiBackDoorActivity extends Activity {

    @ViewById(R.id.tv_channel)
    TextView mTvChannel;

    @ViewById(R.id.tv_build_time)
    TextView mTvBuildTime;

    @AfterViews
    void initViews()
    {
        mTvChannel.setText("Channel:"+ DevUtils.getVersionName());
        mTvBuildTime.setText("BuildTime:"+DevUtils.BuildTime);
    }

}
