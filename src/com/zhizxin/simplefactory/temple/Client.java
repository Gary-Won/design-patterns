package com.zhizxin.simplefactory.temple;

/**
 * @author wangqiu
 * @date 2020/12/26 - 21:57
 */
public class Client {
    public static void main(String[] args) {
        Api api = SimpleFactory.createApi(1);
        api.operation("haha");

        Api api2 = SimpleFactory.createApi(2);
        api2.operation("aaaa");
    }
}
