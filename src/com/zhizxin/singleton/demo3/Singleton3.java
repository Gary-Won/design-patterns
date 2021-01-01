package com.zhizxin.singleton.demo3;

/**
 * @author wangqiu
 * @date 2020/12/31 - 6:07
 * @desc lazy initialization holder class
 */
public class Singleton3 {
    public static class SingletonHolder{
        private static  Singleton3 instance = new Singleton3();
    }

    private Singleton3(){

    }

    public static Singleton3 getInstance(){
        return SingletonHolder.instance;
    }
}
