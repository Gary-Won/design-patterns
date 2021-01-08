package com.zhizxin.abstractfactory.raw;

/**
 * @author wangqiu
 * @date 2021/1/5 - 22:53
 */
public class IntelCPU implements CPUApi {
    private int pins = 0;

    public IntelCPU(int pins){
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("now in Intel CPU, pins=" + pins);
    }
}
