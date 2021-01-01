package com.zhizxin.factorymethod.demo1;

/**
 * @author wangqiu
 * @date 2021/1/1 - 10:48
 */
public class ExportDBFileOperate extends ExportOperate {
    @Override
    protected ExportFileApi factoryMethod() {
        return new ExportDBFile();
    }
}
