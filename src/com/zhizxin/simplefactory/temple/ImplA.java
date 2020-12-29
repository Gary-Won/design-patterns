package com.zhizxin.simplefactory.temple;

/**
 * @author wangqiu
 * @date 2020/12/26 - 21:54
 */
public class ImplA implements Api {
    @Override
    public void operation(String s) {
        System.out.println("ImplA s == " + s);
    }
}
