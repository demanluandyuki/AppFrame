package com.joyfulmath.appframe.business.recycleview.presenter;

import com.joyfulmath.appframe.business.recycleview.model.DataModel;
import com.joyfulmath.appframe.business.recycleview.model.IDataModel;

/**
 * Created by deman on 2016/3/31.
 */
public class RecyclePresenter implements IRecyclePresenter{
    IDataModel model;

    public RecyclePresenter()
    {
        model = new DataModel();
        model.initData();
    }

    @Override
    public String getTitle(int position) {
        return model.getTitle(position);
    }

    @Override
    public String getPath(int position) {
        return model.getPath(position);
    }

    @Override
    public int length() {
        return model.length();
    }
}
