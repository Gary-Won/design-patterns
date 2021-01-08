package com.zhizxin.abstractfactory.raw;

/**
 * @author wangqiu
 * @date 2021/1/5 - 22:55
 */
public class AMDCPU implements CPUApi {
    private int pins = 0;

    public AMDCPU(int pins){
        this.pins = pins;
    }
    @Override
    public void calculate() {
        System.out.println("now in AMD CPU, pins="+pins);
    }
}
