package com.joyfulmath.appframe.business.map.model;

import com.joyfulmath.publiclibrary.json.JsonUtils;
import com.joyfulmath.publicutils.utils.TraceLog;

/**
 * @author deman.lu
 * @version on 2016-03-24 15:34
 */
public class MapModel {

    public BaiduBean getAddress()
    {
        BaiduBean address = MapApi.getInstance().getIpAddress("116.247.112.179");
        TraceLog.i(JsonUtils.toJSONString(address));
        return address;
    }

    public BaiduBean postAddress()
    {
        BaiduBean address = MapApi.getInstance().postIpAddress("116.247.112.179");
        TraceLog.i(JsonUtils.toJSONString(address));
        return address;
    }
}
