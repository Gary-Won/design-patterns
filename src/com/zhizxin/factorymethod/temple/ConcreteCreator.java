package com.zhizxin.factorymethod.temple;

/**
 * @author wangqiu
 * @date 2021/1/1 - 10:31
 */
public class ConcreteCreator extends Creator {
    @Override
    protected Product factoryMethod() {
        return new ConcreteProduct();
    }
}
