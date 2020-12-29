package com.zhizxin.adapter.demo;

import com.zhizxin.adapter.raw.LogDbOperateApi;
import com.zhizxin.adapter.raw.LogFileOperate;
import com.zhizxin.adapter.raw.LogFileOperateApi;
import com.zhizxin.adapter.raw.LogModel;
import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangqiu
 * @date 2020/12/27 - 19:40
 */
public class Client {
    public static void main(String[] args) {
        LogModel lm = new LogModel();
        lm.setLogId("002");
        lm.setOperateUser("user");
        lm.setOperateTime("2020-12-27 19:41:30");
        lm.setLogContent("适配模式测试");

        List<LogModel> list = new ArrayList<>();
        list.add(lm);

        LogFileOperateApi logFileApi = new LogFileOperate("");
        LogDbOperateApi api = new Adapter(logFileApi);

        api.createLog(lm);

        List<LogModel> allLog = api.getAllLog();
        System.out.println(allLog);
    }
}
