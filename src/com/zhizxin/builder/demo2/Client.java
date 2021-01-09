package com.zhizxin.builder.demo2;

/**
 * @author wangqiu
 * @date 2021/1/9 - 16:47
 */
public class Client {
    public static void main(String[] args) {
        ConcreteBuilder builder = new ConcreteBuilder("0001",12345L, 456789L);
        InsuranceContract contract = builder.setPersonName("张三").setOtherData("test").build();
        contract.someOperation();
    }
}
