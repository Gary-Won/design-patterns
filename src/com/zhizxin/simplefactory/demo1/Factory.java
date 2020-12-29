package com.zhizxin.simplefactory.demo1;

import com.zhizxin.simplefactory.temple.Api;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author wangqiu
 * @date 2020/12/27 - 8:38
 */
public class Factory {
    public static Api createApi(){
        Properties p = new Properties();
        InputStream in = null;
        //1.使用getResouceAsStream获取配置文件，配置文件在当前目录下
       // in = Factory.class.getResourceAsStream("FactoryTest.properties");
        //2.使用classloader获取配置文件,配置文件（编译后）在classes目录下，开始时直接放在src目录下
            in = Factory.class.getClassLoader().getResourceAsStream("com/zhizxin/simplefactory/demo1/FactoryTest.properties");
        try {
            p.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Api api = null;
        try {
            api = (Api) Class.forName(p.getProperty("ImplClass")).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return api;

        //使用ResourceBundle获取配置文件
//        ResourceBundle rb = ResourceBundle.getBundle("FactoryTest");
//        Api api = null;
//        try {
//            api = (Api)Class.forName(rb.getString("ImplClass")).newInstance();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return api;
    }
}
