package com.zhizxin.adapter.temple;

/**
 * @author wangqiu
 * @date 2020/12/27 - 19:19
 */
public class Client {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request();
    }
}
