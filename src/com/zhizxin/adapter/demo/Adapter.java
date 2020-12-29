package com.zhizxin.adapter.demo;

import com.zhizxin.adapter.raw.LogDbOperateApi;
import com.zhizxin.adapter.raw.LogFileOperateApi;
import com.zhizxin.adapter.raw.LogModel;
import java.util.List;

/**
 * @author wangqiu
 * @date 2020/12/27 - 19:33
 */
public class Adapter implements LogDbOperateApi {
    private LogFileOperateApi adaptee;
    public Adapter(LogFileOperateApi adaptee){
        this.adaptee = adaptee;
    }
    @Override
    public void createLog(LogModel lm) {

        List<LogModel> list = adaptee.readLogFile();
        list.add(lm);
        adaptee.writeLogFile(list);
    }

    @Override
    public void updateLog(LogModel lm) {
        List<LogModel> list = adaptee.readLogFile();
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getLogId().equals(lm.getLogId())){
                list.set(i, lm);
                break;
            }
        }

        adaptee.writeLogFile(list);
    }

    @Override
    public void removeLog(LogModel lm) {
        List<LogModel> list = adaptee.readLogFile();
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getLogId().equals(lm.getLogId())){
                list.remove(i);
                break;
            }
        }

        adaptee.writeLogFile(list);
    }

    @Override
    public List<LogModel> getAllLog() {
        List<LogModel> list = adaptee.readLogFile();
        return list;
    }
}
