package com.zhizxin.simplefactory.demo1;

import com.zhizxin.simplefactory.temple.Api;

/**
 * @author wangqiu
 * @date 2020/12/27 - 9:36
 */
public class Client {
    public static void main(String[] args) {
        Api api = Factory.createApi();
        api.operation("测试以下");
    }
}
