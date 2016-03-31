package com.joyfulmath.appframe.business.recycleview.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by deman on 2016/3/31.
 */
public class DataModel implements IDataModel {
    List<String> mTitleList = null;
    List<String> mPaths = null;

    @Override
    public String getPath(int position) {

        if (position >= mPaths.size()) {
            throw new RuntimeException("position is out of index:" + position);
        }
        return mPaths.get(position);
    }

    @Override
    public String getTitle(int position) {
        if (position >= mTitleList.size()) {
            throw new RuntimeException("position is out of index:" + position);
        }
        return mTitleList.get(position);
    }

    @Override
    public void initData() {
        mPaths = new ArrayList<>();
        mTitleList = new ArrayList<>();
        mTitleList.add("A");
        mTitleList.add("B");
        mTitleList.add("C");
        mTitleList.add("D");
        mPaths.add("http://images.cnblogs.com/cnblogs_com/deman/807907/o_1.jpg");
        mPaths.add("http://images.cnblogs.com/cnblogs_com/deman/807907/o_2.jpg");
        mPaths.add("http://images.cnblogs.com/cnblogs_com/deman/807907/o_3.jpg");
        mPaths.add("http://images.cnblogs.com/cnblogs_com/deman/807907/o_4.jpg");
    }

    @Override
    public int length() {
        return mPaths.size();
    }
}