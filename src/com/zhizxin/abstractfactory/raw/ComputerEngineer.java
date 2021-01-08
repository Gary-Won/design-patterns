package com.zhizxin.abstractfactory.raw;

/**
 * @author wangqiu
 * @date 2021/1/5 - 23:03
 */
public class ComputerEngineer {
    private CPUApi cpu = null;

    private MainBoardApi mainboard = null;

    public void makeComputer(int cpuType, int mainboardType){
        preparedHardwares(cpuType, mainboardType);
    }

    private void preparedHardwares(int cpuType, int mainboardType){
        this.cpu = CPUFactory.createCPUApi(cpuType);
        this.mainboard = MainboardFactory.createMainboardApi(mainboardType);
        this.cpu.calculate();
        this.mainboard.installCPU();
    }
}
