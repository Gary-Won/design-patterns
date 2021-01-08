package com.zhizxin.abstractfactory.raw;

/**
 * @author wangqiu
 * @date 2021/1/5 - 23:06
 */
public class Client {
    public static void main(String[] args) {
        ComputerEngineer ce = new ComputerEngineer();
        ce.makeComputer(1,2);
    }
}
