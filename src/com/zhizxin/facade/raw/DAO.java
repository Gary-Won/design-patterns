package com.zhizxin.facade.raw;

/**
 * @author wangqiu
 * @date 2020/12/27 - 11:38
 */
public class DAO {
    public void generate(){
        ConfigModel cm = ConfigManager.getInstance().getConfigData();
        if(cm.isNeedGenDAO()){
            System.out.println("正在生成数据层代码");
        }
    }
}
