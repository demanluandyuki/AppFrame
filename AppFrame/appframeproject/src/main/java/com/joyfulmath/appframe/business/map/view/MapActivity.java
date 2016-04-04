package com.joyfulmath.appframe.business.map.view;

import android.app.Activity;
import android.widget.TextView;

import com.joyfulmath.appframe.R;
import com.joyfulmath.appframe.business.map.presenter.IMapPresenter;
import com.joyfulmath.appframe.business.map.presenter.MapPresenter;
import com.joyfulmath.publicutils.utils.TraceLog;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
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

    IMapPresenter presenter = null;

    @AfterViews
    void afterView()
    {
        TraceLog.i();
        presenter = new MapPresenter();
    }

    @Click(R.id.btn_load)
    void onLoadClick()
    {
        loadBackground();
    }

    @Click(R.id.btn_post)
    void onPostClick()
    {
        postBackground();
    }

    @Background
    void loadBackground()
    {
        presenter.getTestApi();
    }

    @Background
    void postBackground()
    {
        presenter.postTestApi();
    }
}
