package com.zhizxin.abstractfactory.demo4;

/**
 * @author wangqiu
 * @date 2021/1/8 - 21:12
 */
public class RdbMainDAOImpl implements OrderMainDAO {
    @Override
    public void saveOrderMain() {
        System.out.println("now in RdbMainDAOImpl saveOrderMain");
    }
}
