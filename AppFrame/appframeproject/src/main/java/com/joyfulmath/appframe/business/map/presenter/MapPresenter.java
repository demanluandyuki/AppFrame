package com.joyfulmath.appframe.business.map.presenter;

import com.joyfulmath.appframe.business.map.model.BaiduBean;
import com.joyfulmath.appframe.business.map.model.MapModel;

/**
 * @author deman.lu
 * @version on 2016-03-24 16:05
 */
public class MapPresenter implements IMapPresenter{
    MapModel mapModel;

    public MapPresenter()
    {
        mapModel = new MapModel();
    }

    @Override
    public BaiduBean getTestApi() {
        return mapModel.getAddress();
    }

    @Override
    public BaiduBean postTestApi() {
        return mapModel.postAddress();
    }
}
