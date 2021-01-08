package com.zhizxin.abstractfactory.temple;

/**
 * @author wangqiu
 * @date 2021/1/5 - 23:29
 */
public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB();
    }
}
