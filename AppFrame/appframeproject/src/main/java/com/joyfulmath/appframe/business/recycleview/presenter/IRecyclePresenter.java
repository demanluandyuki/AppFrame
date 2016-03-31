package com.joyfulmath.appframe.business.recycleview.presenter;

/**
 * Created by deman on 2016/3/30.
 */
public interface IRecyclePresenter {
    String getTitle(int position);

    String getPath(int position);

    int length();

}
