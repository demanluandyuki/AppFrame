package com.joyfulmath.appframe.business.map.model;

import com.joyfulmath.publiclibrary.utils.TraceLog;

/**
 * @author deman.lu
 * @version on 2016-03-24 15:34
 */
public class MapModel {

    public String getAddress()
    {
        String address = MapApi.getInstance().getIpAddress("116.247.112.179");
        TraceLog.i(address);
        return address;
    }
}
