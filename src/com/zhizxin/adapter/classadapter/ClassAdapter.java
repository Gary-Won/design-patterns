package com.zhizxin.adapter.classadapter;

import com.zhizxin.adapter.raw.LogDbOperateApi;
import com.zhizxin.adapter.raw.LogFileOperate;
import com.zhizxin.adapter.raw.LogModel;

import java.util.List;

/**
 * @author wangqiu
 * @date 2020/12/27 - 22:19
 */
public class ClassAdapter extends LogFileOperate implements LogDbOperateApi {

    public ClassAdapter(String logFilePathName){
        super(logFilePathName);
    }
    @Override
    public void createLog(LogModel lm) {
        List<LogModel> list = this.readLogFile();
        list.add(lm);
        this.writeLogFile(list);
    }

    @Override
    public void updateLog(LogModel lm) {
        List<LogModel> list = this.readLogFile();
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getLogId().equals(lm.getLogId())){
                list.set(i, lm);
                break;
            }
        }

        this.writeLogFile(list);
    }

    @Override
    public void removeLog(LogModel lm) {
        List<LogModel> list = this.readLogFile();
        list.remove(lm);
        this.writeLogFile(list);
    }

    @Override
    public List<LogModel> getAllLog() {
        return this.readLogFile();
    }
}
