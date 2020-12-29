package com.zhizxin.simplefactory.demo1;

import com.zhizxin.simplefactory.temple.Api;

/**
 * @author wangqiu
 * @date 2020/12/27 - 9:40
 */
public class ImplC implements Api {

    @Override
    public void operation(String s) {
        System.out.println("ImplC s == " + s);
    }

}
