package com.zhizxin.adapter.deml2;

import com.zhizxin.adapter.raw.LogDbOperateApi;
import com.zhizxin.adapter.raw.LogModel;

import java.util.List;

/**
 * @author wangqiu
 * @date 2020/12/27 - 20:56
 */
public class LogDbOperate implements LogDbOperateApi {
    @Override
    public void createLog(LogModel lm) {
        System.out.println("now in LogDbOperate createLog, lm = " + lm);
    }

    @Override
    public void updateLog(LogModel lm) {
        System.out.println("now in LogDbOperate updateLog, lm = " + lm);
    }

    @Override
    public void removeLog(LogModel lm) {
        System.out.println("now in LogDbOperate removeLog, lm = " + lm);
    }

    @Override
    public List<LogModel> getAllLog() {
        System.out.println("now in LogDbOperate getAllLog");
        return null;
    }
}
