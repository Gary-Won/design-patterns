package com.zhizxin.adapter.deml2;

import com.zhizxin.adapter.raw.LogDbOperateApi;
import com.zhizxin.adapter.raw.LogFileOperateApi;
import com.zhizxin.adapter.raw.LogModel;

import java.util.List;

/**
 * @author wangqiu
 * @date 2020/12/27 - 20:58
 */
public class TwoDirectAdapter implements LogDbOperateApi, LogFileOperateApi {
    private LogFileOperateApi fileLog;
    private LogDbOperateApi dbLog;

    public TwoDirectAdapter(LogFileOperateApi fileLog, LogDbOperateApi dbLog){
        this.fileLog = fileLog;
        this.dbLog = dbLog;
    }
    @Override
    public void createLog(LogModel lm) {
        List<LogModel> list = fileLog.readLogFile();
        list.add(lm);
        fileLog.writeLogFile(list);
    }

    @Override
    public void updateLog(LogModel lm) {
        List<LogModel> list = fileLog.readLogFile();
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getLogId().equals(lm.getLogId())){
                list.set(i, lm);
            }
        }

        fileLog.writeLogFile(list);
    }

    @Override
    public void removeLog(LogModel lm) {
        List<LogModel> list = fileLog.readLogFile();
        list.remove(lm);
        fileLog.writeLogFile(list);
    }

    @Override
    public List<LogModel> getAllLog() {
        return fileLog.readLogFile();
    }

    @Override
    public List<LogModel> readLogFile() {
        return dbLog.getAllLog();
    }

    @Override
    public void writeLogFile(List<LogModel> list) {
        for(LogModel lm: list){
            dbLog.createLog(lm);
        }
    }
}
