package com.zhizxin.adapter.raw;

import java.io.Serializable;

/**
 * @author wangqiu
 * @date 2020/12/27 - 16:04
 */
public class LogModel implements Serializable {
    private String logId;
    private String operateUser;
    private String operateTime;

    private String logContent;

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public String getOperateUser() {
        return operateUser;
    }

    public void setOperateUser(String operateUser) {
        this.operateUser = operateUser;
    }

    public String getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

    public String getLogContent() {
        return logContent;
    }

    public void setLogContent(String logContent) {
        this.logContent = logContent;
    }

    public String toString(){
        return "logId = " + logId + ",operateUser = " + operateUser + ", operateTime = " + operateTime + ", logContent = " + logContent;
    }
}
