package com.zhizxin.factorymethod.demo1;

/**
 * @author wangqiu
 * @date 2021/1/1 - 10:46
 */
public class ExportTxtFileOperate extends ExportOperate {
    @Override
    protected ExportFileApi factoryMethod() {
        return new ExportTxtFile();
    }
}
