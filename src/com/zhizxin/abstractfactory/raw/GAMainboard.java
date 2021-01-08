package com.zhizxin.abstractfactory.raw;

/**
 * @author wangqiu
 * @date 2021/1/5 - 22:57
 */
public class GAMainboard implements MainBoardApi {
    private int cpuHoles = 0;

    public GAMainboard(int cpuHoles){
        this.cpuHoles = cpuHoles;
    }
    @Override
    public void installCPU() {
        System.out.println("now in GAMainboard, cpuHoles="+cpuHoles);
    }
}
