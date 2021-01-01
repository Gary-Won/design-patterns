package com.zhizxin.factorymethod.demo1;

/**
 * @author wangqiu
 * @date 2021/1/1 - 10:41
 */
public class ExportTxtFile implements ExportFileApi {
    @Override
    public boolean export(String data) {
        System.out.println("导出数据" + data + "到文本文件");
        return true;
    }
}
