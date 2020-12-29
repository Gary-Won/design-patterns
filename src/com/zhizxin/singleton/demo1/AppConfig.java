package com.zhizxin.singleton.demo1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author wangqiu
 * @date 2020/12/27 - 23:36
 */
public class AppConfig {
    private static AppConfig instance = new AppConfig();

    private AppConfig(){
        readConfig();
    }

    public static AppConfig getInstance(){
        return instance;
    }

    private String paramA;
    private String paramB;

    public String getParamterA(){
        return paramA;
    }

    public String getParameterB(){
        return paramB;
    }

    private void readConfig(){
        Properties p = new Properties();
        InputStream is = null;
        is = AppConfig.class.getResourceAsStream("AppConfig.properties");
        try {
            p.load(is);
            paramA = p.getProperty("paramA");
            paramB = p.getProperty("paramB");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
