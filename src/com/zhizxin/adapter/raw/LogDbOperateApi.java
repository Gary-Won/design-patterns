package com.zhizxin.adapter.raw;

import java.util.List;

/**
 * @author wangqiu
 * @date 2020/12/27 - 17:43
 */
public interface LogDbOperateApi {
    public void createLog(LogModel lm);
    public void updateLog(LogModel lm);
    public void removeLog(LogModel lm);
    public List<LogModel> getAllLog();
}
