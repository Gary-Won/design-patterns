package com.zhizxin.simplefactory.temple;

/**
 * @author wangqiu
 * @date 2020/12/26 - 21:55
 */
public class ImplB implements Api {
    @Override
    public void operation(String s) {
        System.out.println("ImplB s == " + s);
    }
}
