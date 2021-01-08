package com.zhizxin.abstractfactory.raw;

/**
 * @author wangqiu
 * @date 2021/1/5 - 22:59
 */
public class CPUFactory {
    public static CPUApi createCPUApi(int type){
        CPUApi cpu = null;
        if(1 == type){
            cpu = new IntelCPU(1156);
        }else if(2 == type){
            cpu = new AMDCPU(939);
        }
        return cpu;
    }
}
