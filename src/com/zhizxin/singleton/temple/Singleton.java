package com.zhizxin.singleton.temple;

/**
 * @author wangqiu
 * @date 2020/12/27 - 23:23
 * @desc 懒汉式单例模式
 */
public class Singleton {
    private static Singleton uniqueInstance = null;
    private String singletonData;
    private Singleton(){}

    public static synchronized Singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public void singletonOperation(){

    }

    public String getSingletonData(){
        return singletonData;
    }
}
