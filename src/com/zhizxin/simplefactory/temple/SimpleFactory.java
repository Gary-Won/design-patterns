package com.zhizxin.simplefactory.temple;

import java.util.concurrent.locks.Condition;

/**
 * @author wangqiu
 * @date 2020/12/26 - 21:55
 */
public class SimpleFactory {

    private SimpleFactory(){}

    public static Api createApi(int condition){
        if(condition == 1){
            return new ImplA();
        }else{
            return new ImplB();
        }
    }
}
