package com.joyfulmath.appframe.business.map.model;

import com.joyfulmath.publiclibrary.base.ApiInit;
import com.joyfulmath.publiclibrary.utils.TraceLog;

import java.util.LinkedHashMap;

/**
 * @author deman.lu
 * @version on 2016-03-24 15:37
 */
public class MapApi extends ApiInit{

    public static String hostUrl = null;
    private static MapApi sInstance = null;

    /**
     * 初次使用时调用此方法获取实例
     *
     * @return
     */
    public synchronized static MapApi getInstance() {

        if (sInstance == null) {
            sInstance = new MapApi();
                hostUrl = "http://api.map.baidu.com";
        }
        return sInstance;
    }

    public BaiduBean getIpAddress(String ip)
    {
        String methodUrl = String.format("/location/ip");
        LinkedHashMap<String,String> map = new LinkedHashMap<>();
        map.put("ip",ip);
        map.put("ak",Config.BAIDU_AK);
        map.put("coor","bd09ll");
//        String sn = SnCal.getSn(map,methodUrl);
//        TraceLog.i(sn);
//        map.put("sn",sn);
        return get(BaiduBean.class,hostUrl,methodUrl,map,null);
    }
}
