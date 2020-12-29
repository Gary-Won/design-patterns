package com.zhizxin.adapter.raw;

import java.util.List;

/**
 * @author wangqiu
 * @date 2020/12/27 - 16:09
 */
public interface LogFileOperateApi {
    public List<LogModel> readLogFile();

    public void writeLogFile(List<LogModel> list);
}
