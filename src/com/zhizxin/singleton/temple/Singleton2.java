package com.zhizxin.singleton.temple;

/**
 * @author wangqiu
 * @date 2020/12/27 - 23:30
 * @desc 饿汉式单例模式
 */
public class Singleton2 {
    private static Singleton2 uniqueInstance = new Singleton2();
    private String singletonData;
    private Singleton2(){}
    public static Singleton2 getInstance(){
        return uniqueInstance;
    }

    public void singletonOperation(){}
    public String getSingletonData(){
        return singletonData;
    }
}
