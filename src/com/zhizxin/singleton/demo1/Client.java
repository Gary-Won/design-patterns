package com.zhizxin.singleton.demo1;

/**
 * @author wangqiu
 * @date 2020/12/27 - 23:47
 */
public class Client {
    public static void main(String[] args) {
        AppConfig config = AppConfig.getInstance();
        String paramA = config.getParamterA();
        String paramB = config.getParameterB();

        System.out.println("paramA=" + paramA + ", paramB=" + paramB);
    }
}
