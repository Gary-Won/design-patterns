package com.zhizxin.abstractfactory.demo1;

import com.zhizxin.abstractfactory.raw.CPUApi;
import com.zhizxin.abstractfactory.raw.MainBoardApi;

/**
 * @author wangqiu
 * @date 2021/1/5 - 23:13
 */
public interface AbstractFactory {
    CPUApi createCPUApi();
    MainBoardApi createMainboardApi();
}
