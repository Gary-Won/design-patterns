package com.zhizxin.abstractfactory.demo4;

/**
 * @author wangqiu
 * @date 2021/1/8 - 21:18
 */
public class RdbDAOFactory extends DAOFactory {
    @Override
    public OrderMainDAO createOrderMainDAO() {
        return new RdbMainDAOImpl();
    }

    @Override
    public OrderDetailDAO createOrderDetailDAO() {
        return new RdbDetailDAOImpl();
    }
}
