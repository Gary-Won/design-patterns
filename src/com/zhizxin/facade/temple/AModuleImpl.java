package com.zhizxin.facade.temple;

/**
 * @author wangqiu
 * @date 2020/12/27 - 12:31
 */
public class AModuleImpl implements AModuleApi {
    @Override
    public void testA() {
        System.out.println("在A模块中操作testA");
    }
}
