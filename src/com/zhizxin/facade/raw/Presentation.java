package com.zhizxin.facade.raw;

/**
 * @author wangqiu
 * @date 2020/12/27 - 11:36
 */
public class Presentation {
    public void generate(){
        ConfigModel cm = ConfigManager.getInstance().getConfigData();
        if(cm.isNeedGenPresentation()){
            System.out.println("正在生成表现成代码文件");
        }
    }
}
