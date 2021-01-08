package com.zhizxin.abstractfactory.demo1;

import com.zhizxin.abstractfactory.raw.CPUApi;
import com.zhizxin.abstractfactory.raw.MainBoardApi;
import sun.applet.Main;

/**
 * @author wangqiu
 * @date 2021/1/5 - 23:18
 */
public class ComputerEngineer {
    private CPUApi cpu = null;
    private MainBoardApi mainboard = null;

    public void makeComputer(AbstractFactory factory){
        preparedHardwares(factory);
    }

    private void preparedHardwares(AbstractFactory factory){
        this.cpu = factory.createCPUApi();
        this.mainboard = factory.createMainboardApi();

        this.cpu.calculate();
        this.mainboard.installCPU();
    }
}
