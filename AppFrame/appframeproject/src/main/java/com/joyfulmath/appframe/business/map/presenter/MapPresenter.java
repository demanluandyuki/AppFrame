package com.joyfulmath.appframe.business.map.presenter;

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
    public String load() {
        return mapModel.getAddress();
    }
}
