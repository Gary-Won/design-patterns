package com.zhizxin.adapter.raw;

import java.io.*;
import java.util.List;

/**
 * @author wangqiu
 * @date 2020/12/27 - 16:15
 */
public class LogFileOperate implements LogFileOperateApi {
    private String logFilePathName = "AdapterLog.log";

    public LogFileOperate(String logFilePathName){
        if(logFilePathName != null && logFilePathName.trim().length() >0){
            this.logFilePathName = logFilePathName;
        }
    }
    @Override
    public List<LogModel> readLogFile() {
        List<LogModel> list = null;
        ObjectInputStream oin = null;
        File f = new File(logFilePathName);
        if(f.exists()){
            try {
                oin = new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)));
                list = (List<LogModel>) oin.readObject();
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                try {
                    oin.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }

    @Override
    public void writeLogFile(List<LogModel> list) {
        File f = new File(logFilePathName);
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f)));
            oos.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
