package com.zhizxin.abstractfactory.demo1;

import com.zhizxin.abstractfactory.raw.CPUApi;
import com.zhizxin.abstractfactory.raw.GAMainboard;
import com.zhizxin.abstractfactory.raw.IntelCPU;
import com.zhizxin.abstractfactory.raw.MainBoardApi;

/**
 * @author wangqiu
 * @date 2021/1/5 - 23:15
 */
public class Schema1 implements AbstractFactory {
    @Override
    public CPUApi createCPUApi() {
        return new IntelCPU(1156);
    }

    @Override
    public MainBoardApi createMainboardApi() {
        return new GAMainboard(1156);
    }
}
