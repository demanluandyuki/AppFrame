package com.joyfulmath.appframe.business.recycleview.model;


/**
 * Created by deman on 2016/3/31.
 */
public interface IDataModel {
    String getPath(int position);
    String getTitle(int position);
    void initData();
    int length();
}
