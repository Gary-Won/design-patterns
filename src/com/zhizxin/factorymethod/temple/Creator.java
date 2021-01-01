package com.zhizxin.factorymethod.temple;

/**
 * @author wangqiu
 * @date 2021/1/1 - 10:30
 */
public abstract class Creator {
    protected abstract  Product factoryMethod();
    public void  someOperation(){
        Product product = factoryMethod();
    }
}
