package com.zhizxin.abstractfactory.demo4;

/**
 * @author wangqiu
 * @date 2021/1/8 - 21:19
 */
public class XmlDAOFactory extends DAOFactory {
    @Override
    public OrderMainDAO createOrderMainDAO() {
        return new XmlMainDAOImpl();
    }

    @Override
    public OrderDetailDAO createOrderDetailDAO() {
        return new XmlDetailDAOImpl();
    }
}
