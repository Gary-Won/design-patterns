package com.zhizxin.factorymethod.demo1;

/**
 * @author wangqiu
 * @date 2021/1/1 - 10:43
 */
public class ExportDBFile implements ExportFileApi {
    @Override
    public boolean export(String data) {
        System.out.println("导出数据" + data + "数据库文件");
        return true;
    }
}
