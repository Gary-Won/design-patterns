package com.zhizxin.singleton.demo4;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangqiu
 * @date 2021/1/1 - 9:21
 */
public class OneExtend {
    private final static String DEFAULT_PREKEY = "Cache";
    private static Map<String, OneExtend> map = new HashMap<String, OneExtend>();
    private static int num = 1;

    private final static int NUM_MAX = 3;
    private OneExtend(){}

    public static OneExtend getInstance(){
        String key = DEFAULT_PREKEY + num;
        OneExtend oneExtend = map.get(key);
        if(null == oneExtend){
            oneExtend = new OneExtend();
            map.put(key, oneExtend);
        }

        num++;
        if(num>NUM_MAX){
            num = 1;
        }

        return oneExtend;
    }

    public static void main(String[] args) {
        OneExtend t1 = getInstance();
        OneExtend t2 = getInstance();
        OneExtend t3 = getInstance();
        OneExtend t4 = getInstance();
        OneExtend t5 = getInstance();
        OneExtend t6 = getInstance();

        System.out.println("t1==" + t1);
        System.out.println("t1==" + t2);
        System.out.println("t1==" + t3);
        System.out.println("t1==" + t4);
        System.out.println("t1==" + t5);
        System.out.println("t1==" + t6);
    }
}
