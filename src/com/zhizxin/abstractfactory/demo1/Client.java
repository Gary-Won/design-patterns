package com.zhizxin.abstractfactory.demo1;

/**
 * @author wangqiu
 * @date 2021/1/5 - 23:17
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new Schema2();
        ComputerEngineer ce = new ComputerEngineer();
        ce.makeComputer(factory);
    }
}
