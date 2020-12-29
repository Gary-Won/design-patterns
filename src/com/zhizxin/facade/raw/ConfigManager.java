package com.zhizxin.facade.raw;

/**
 * @author wangqiu
 * @date 2020/12/27 - 11:32
 */
public class ConfigManager {
    private static ConfigManager manager = null;
    private static ConfigModel cm = null;

    private ConfigManager(){}

    public static ConfigManager getInstance(){
        if(manager == null){
            manager = new ConfigManager();
            cm = new ConfigModel();
        }
        return manager;
    }

    public ConfigModel getConfigData(){
        return cm;
    }
}
