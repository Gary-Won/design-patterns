package com.zhizxin.abstractfactory.temple;

/**
 * @author wangqiu
 * @date 2021/1/5 - 23:29
 */
public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductAA();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductBB();
    }
}
