package com.zhizxin.builder.demo2;

/**
 * @author wangqiu
 * @date 2021/1/9 - 16:29
 */
public class InsuranceContract {
    private String contractId;
    private String personName;
    private String companyName;
    private long beginDate;
    private long endDate;
    private String otherData;

    public InsuranceContract(ConcreteBuilder builder) {
        this.contractId = builder.getContractId();
        this.personName = builder.getPersonName();
        this.companyName = builder.getCompanyName();
        this.beginDate = builder.getBeginDate();
        this.endDate = builder.getEndDate();
        this.otherData = builder.getOtherData();
    }

    public void someOperation(){
        System.out.println("now in Insurance contract someOperation==" + this.contractId);
    }
}
