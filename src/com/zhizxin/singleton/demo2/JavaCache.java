package com.zhizxin.singleton.demo2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangqiu
 * @date 2020/12/29 - 22:38
 * @desc java缓存思想
 */
public class JavaCache {
    private Map<String, Object> map = new HashMap<>();

    public Object getValue(String key){
        Object obj = map.get(key);
        if(null == obj){
            obj = key + ",value";
            map.put(key,obj);
        }
        return obj;
    }
}
