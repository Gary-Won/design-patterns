package com.zhizxin.abstractfactory.demo4;

/**
 * @author wangqiu
 * @date 2021/1/8 - 21:05
 */
public abstract class DAOFactory {
    public abstract OrderMainDAO createOrderMainDAO();
    public abstract OrderDetailDAO createOrderDetailDAO();
}
