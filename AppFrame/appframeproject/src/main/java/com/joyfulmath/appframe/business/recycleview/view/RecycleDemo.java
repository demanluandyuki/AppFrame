package com.joyfulmath.appframe.business.recycleview.view;

import android.app.Activity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import com.joyfulmath.appframe.R;
import com.joyfulmath.appframe.business.recycleview.presenter.IRecyclePresenter;
import com.joyfulmath.appframe.business.recycleview.presenter.RecycleAdapter;
import com.joyfulmath.appframe.business.recycleview.presenter.RecyclePresenter;
import com.joyfulmath.publiclibrary.utils.TraceLog;

/**
 * Created by deman on 2016/3/30.
 */
@EActivity(R.layout.activity_recycle_demo)
public class RecycleDemo extends Activity implements IRecycleView{

    @ViewById(R.id.rv_demo)
    RecyclerView mRvDemo;
    IRecyclePresenter recyclePresenter = null;
    @AfterViews
    void initViews()
    {
        TraceLog.i();
        recyclePresenter = new RecyclePresenter();
        mRvDemo.setLayoutManager(new LinearLayoutManager(this));
        mRvDemo.setAdapter(new RecycleAdapter(this,recyclePresenter));
    }

}
