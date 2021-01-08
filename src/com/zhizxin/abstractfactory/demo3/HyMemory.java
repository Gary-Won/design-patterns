package com.zhizxin.abstractfactory.demo3;

/**
 * @author wangqiu
 * @date 2021/1/6 - 20:20
 */
public class HyMemory implements MemoryApi {
    @Override
    public void cacheData() {
        System.out.println("现在正在使用现代内存");
    }
}
