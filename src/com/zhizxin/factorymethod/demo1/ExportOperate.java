package com.zhizxin.factorymethod.demo1;

/**
 * @author wangqiu
 * @date 2021/1/1 - 10:44
 */
public abstract class ExportOperate {
    protected abstract  ExportFileApi factoryMethod();

    public boolean export(String data){
        ExportFileApi api = factoryMethod();
        return api.export(data);
    }
}
