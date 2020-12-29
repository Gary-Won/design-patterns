package com.zhizxin.singleton.raw;

/**
 * @author wangqiu
 * @date 2020/12/27 - 22:53
 */
public class Client {
    public static void main(String[] args) {
        AppConfig config = new AppConfig();
        String paramA = config.getParameterA();
        String paramB = config.getParameterB();

        System.out.println("paramA=" + paramA +", paramB=" + paramB);
    }
}
