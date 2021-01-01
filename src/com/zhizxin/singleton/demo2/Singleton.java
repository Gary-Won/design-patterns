package com.zhizxin.singleton.demo2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangqiu
 * @date 2020/12/29 - 22:43
 * @desc 缓存实现单例
 */
public class Singleton {
    private final static String DEFAULT_KEY = "one";

    private static Map<String, Singleton> map = new HashMap<String,Singleton>();

    private Singleton(){}

    public static Singleton getInstance(){
        Singleton instance = map.get(DEFAULT_KEY);
        if(null == instance){
            instance = new Singleton();
            map.put(DEFAULT_KEY, instance);
        }
        return  instance;
    }

}
