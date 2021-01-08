package com.zhizxin.abstractfactory.demo4;

/**
 * @author wangqiu
 * @date 2021/1/8 - 21:19
 */
public class Client {
    public static void main(String[] args) {
        DAOFactory factory = new RdbDAOFactory();
        OrderMainDAO mainDAO = factory.createOrderMainDAO();
        OrderDetailDAO detailDAO = factory.createOrderDetailDAO();

        mainDAO.saveOrderMain();
        detailDAO.saveOrderDetail();
    }
}
