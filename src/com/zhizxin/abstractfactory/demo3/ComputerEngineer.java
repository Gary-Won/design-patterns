package com.zhizxin.abstractfactory.demo3;

import com.zhizxin.abstractfactory.demo2.AbstractFactory;
import com.zhizxin.abstractfactory.raw.CPUApi;
import com.zhizxin.abstractfactory.raw.MainBoardApi;

/**
 * @author wangqiu
 * @date 2021/1/6 - 20:23
 */
public class ComputerEngineer {
    private CPUApi cpu = null;
    private MainBoardApi mainboard = null;
    private MemoryApi memory = null;

    public void makeComputer(AbstractFactory schema){
        prepareHardwares(schema);
    }

    private void prepareHardwares(AbstractFactory schema){
        this.cpu = (CPUApi) schema.createProduct(1);
        this.mainboard = (MainBoardApi) schema.createProduct(2);
        this.memory = (MemoryApi) schema.createProduct(3);

        this.cpu.calculate();
        this.mainboard.installCPU();
        if(null != memory){
            this.memory.cacheData();
        }
    }
}
