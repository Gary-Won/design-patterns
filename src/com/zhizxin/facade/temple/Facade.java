package com.zhizxin.facade.temple;

/**
 * @author wangqiu
 * @date 2020/12/27 - 12:33
 */
public class Facade {

    private Facade(){}
    public static void test(){
        AModuleApi a = new AModuleImpl();
        a.testA();

        BModuleApi b = new BModuleImpl();
        b.testB();

        CModuleApi c = new CModuleImpl();
        c.testC();
    }
}
