package com.zhizxin.abstractfactory.demo4;

/**
 * @author wangqiu
 * @date 2021/1/8 - 21:14
 */
public class RdbDetailDAOImpl implements OrderDetailDAO {
    @Override
    public void saveOrderDetail() {
        System.out.println("now in RdbDetailDAOImpl saveOrderDetail");
    }
}
