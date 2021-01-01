package com.zhizxin.singleton.demo3;

/**
 * @author wangqiu
 * @date 2020/12/29 - 22:50
 * @desc 双重检查加锁懒汉式单例
 */
public class Singleton2 {
    private volatile static Singleton2 instance = null;
    private Singleton2(){}
    public static Singleton2 getInstance(){
        if(null == instance){
            synchronized (Singleton.class){
                if(null == instance){
                    instance = new Singleton2();
                }
            }
        }

        return instance;
    }
}
