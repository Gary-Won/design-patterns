package com.zhizxin.singleton.demo3;

/**
 * @author wangqiu
 * @date 2020/12/29 - 22:47
 * @desc 懒汉式实现线程安全
 */
public class Singleton {
    private static Singleton instance = null;
    private Singleton(){}
    public static synchronized Singleton getInstance(){
        if(null == instance){
            instance = new Singleton();
        }
        return instance;
    }
}
