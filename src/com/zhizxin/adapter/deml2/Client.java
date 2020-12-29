package com.zhizxin.adapter.deml2;

import com.zhizxin.adapter.raw.LogDbOperateApi;
import com.zhizxin.adapter.raw.LogFileOperate;
import com.zhizxin.adapter.raw.LogFileOperateApi;
import com.zhizxin.adapter.raw.LogModel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangqiu
 * @date 2020/12/27 - 21:06
 */
public class Client {
    public static void main(String[] args) {
        LogModel lm = new LogModel();
        lm.setLogId("003");
        lm.setOperateUser("tiny");
        lm.setOperateTime("2020-12-27 21:07:30");
        lm.setLogContent("这个是双向适配器");

        List<LogModel> alist = new ArrayList<>();
        alist.add(lm);

        LogFileOperateApi fileLogApi = new LogFileOperate("");
        LogDbOperateApi dbLogApi = new LogDbOperate();

        LogFileOperateApi adapterFileLogApi = new TwoDirectAdapter(fileLogApi, dbLogApi);
        LogDbOperateApi adapterDbLogApi = new TwoDirectAdapter(fileLogApi, dbLogApi);

        adapterDbLogApi.createLog(lm);

        List<LogModel> list = adapterDbLogApi.getAllLog();
        System.out.println("alllog = " + list);

        adapterFileLogApi.writeLogFile(alist);
        adapterFileLogApi.readLogFile();
    }
}
