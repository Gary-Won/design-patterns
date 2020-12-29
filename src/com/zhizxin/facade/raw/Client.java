package com.zhizxin.facade.raw;

/**
 * @author wangqiu
 * @date 2020/12/27 - 11:42
 */
public class Client {
    public static void main(String[] args) {
        new Presentation().generate();
        new Business().generate();
        new DAO().generate();
    }
}
