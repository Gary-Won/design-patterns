package com.zhizxin.abstractfactory.demo3;

import com.zhizxin.abstractfactory.demo2.AbstractFactory;

import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author wangqiu
 * @date 2021/1/6 - 20:27
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory af = new Schema3();
        ComputerEngineer ce = new ComputerEngineer();
        ce.makeComputer(af);
    }
}
