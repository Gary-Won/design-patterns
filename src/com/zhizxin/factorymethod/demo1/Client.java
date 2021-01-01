package com.zhizxin.factorymethod.demo1;

/**
 * @author wangqiu
 * @date 2021/1/1 - 10:49
 */
public class Client {
    public static void main(String[] args) {
        ExportOperate operate = new ExportDBFileOperate();
        operate.export("测试数据");
    }
}
