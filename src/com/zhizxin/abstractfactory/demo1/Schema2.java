package com.zhizxin.abstractfactory.demo1;

import com.zhizxin.abstractfactory.raw.AMDCPU;
import com.zhizxin.abstractfactory.raw.CPUApi;
import com.zhizxin.abstractfactory.raw.MSIMainboard;
import com.zhizxin.abstractfactory.raw.MainBoardApi;

/**
 * @author wangqiu
 * @date 2021/1/5 - 23:16
 */
public class Schema2 implements AbstractFactory {
    @Override
    public CPUApi createCPUApi() {
        return new AMDCPU(939);
    }

    @Override
    public MainBoardApi createMainboardApi() {
        return new MSIMainboard(939);
    }
}
