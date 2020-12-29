package com.zhizxin.adapter.raw;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangqiu
 * @date 2020/12/27 - 16:55
 */
public class Client {
    public static void main(String[] args) {
        LogModel lm = new LogModel();
        lm.setLogId("001");
        lm.setOperateUser("admin");
        lm.setOperateTime("2020-12-27 16:57:30");
        lm.setLogContent("这是一个测试");

        List<LogModel> list = new ArrayList<>();
        list.add(lm);

        LogFileOperateApi api = new LogFileOperate("");
        api.writeLogFile(list);

        List<LogModel> readLog = api.readLogFile();
        System.out.println("readLog = " + readLog);
    }
}
