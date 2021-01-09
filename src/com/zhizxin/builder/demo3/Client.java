package com.zhizxin.builder.demo3;

/**
 * @author wangqiu
 * @date 2021/1/9 - 17:10
 */
public class Client {
    public static void main(String[] args) {
        InsuranceContract.ConcreteBuilder builder = new InsuranceContract.ConcreteBuilder("0002",12345L,67890L);
        InsuranceContract contract = builder.setPersonName("张三").setOtherData("test").build2();

        contract.someOperation();
    }
}
