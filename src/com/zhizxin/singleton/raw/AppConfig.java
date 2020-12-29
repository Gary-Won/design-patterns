package com.zhizxin.singleton.raw;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author wangqiu
 * @date 2020/12/27 - 22:43
 */
public class AppConfig {
    private String parameterA;
    private String parameterB;

    public AppConfig(){
        readConfig();
    }

    public String getParameterA(){
        return parameterA;
    }

    public String getParameterB(){
        return parameterB;
    }

    private void readConfig(){
        Properties p = new Properties();
        InputStream in = null;
        in = AppConfig.class.getResourceAsStream("AppConfig.properties");
        try {
            p.load(in);
            this.parameterA = p.getProperty("paramA");
            this.parameterB = p.getProperty("paramB");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
