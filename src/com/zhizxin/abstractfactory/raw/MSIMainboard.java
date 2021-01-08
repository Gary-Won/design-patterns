package com.zhizxin.abstractfactory.raw;

import sun.applet.Main;

/**
 * @author wangqiu
 * @date 2021/1/5 - 22:58
 */
public class MSIMainboard implements MainBoardApi {
    private int cpuHoles = 0;

    public MSIMainboard(int cpuHoles){
        this.cpuHoles = cpuHoles;
    }
    @Override
    public void installCPU() {
        System.out.println("now in MSIMainboard, cpuHoles="+cpuHoles);
    }
}
