package com.zhizxin.abstractfactory.temple;

/**
 * @author wangqiu
 * @date 2021/1/5 - 23:30
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory af = new ConcreteFactory1();
        af.createProductA();
        af.createProductB();
    }
}
