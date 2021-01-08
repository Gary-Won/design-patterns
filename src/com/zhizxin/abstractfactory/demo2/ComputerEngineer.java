package com.zhizxin.abstractfactory.demo2;

import com.zhizxin.abstractfactory.raw.CPUApi;
import com.zhizxin.abstractfactory.raw.MainBoardApi;

/**
 * @author wangqiu
 * @date 2021/1/6 - 20:16
 */
public class ComputerEngineer {
    private CPUApi cpu = null;
    private MainBoardApi mainboard = null;

    public void makeComputer(AbstractFactory schema){
        prepareHardwares(schema);
    }

    private void prepareHardwares(AbstractFactory schema){
        this.cpu = (CPUApi) schema.createProduct(1);
        this.mainboard = (MainBoardApi) schema.createProduct(2);
    }
}
