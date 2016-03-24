package com.joyfulmath.appframe.business.map.view;

import android.app.Activity;
import android.widget.TextView;

import com.joyfulmath.appframe.R;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

/**
 * @author deman.lu
 * @version on 2016-03-23 17:41
 */
@EActivity(R.layout.activity_map)
public class MapActivity extends Activity {

    @ViewById(R.id.tv_show)
    TextView    mTvShow;

    @AfterViews
    void afterview()
    {

    }
}
