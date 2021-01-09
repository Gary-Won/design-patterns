package com.zhizxin.builder.demo2;

/**
 * @author wangqiu
 * @date 2021/1/9 - 16:32
 */
public class ConcreteBuilder {
    private String contractId;
    private String personName;
    private String companyName;
    private long beginDate;
    private long endDate;
    private String otherData;

    public ConcreteBuilder(String contractId, long beginDate, long endDate){
        this.contractId = contractId;
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public ConcreteBuilder setPersonName(String personName){
        this.personName = personName;
        return this;
    }

    public ConcreteBuilder setCompanyName(String companyName){
        this.companyName = companyName;
        return this;
    }

    public ConcreteBuilder setOtherData(String otherData){
        this.otherData = otherData;
        return this;
    }

    public InsuranceContract build(){
        return new InsuranceContract(this);
    }

    public InsuranceContract build2(){
        if(contractId == null || contractId.trim().length() == 0){
            throw new IllegalArgumentException("合同编号不能为空");
        }

        boolean signPerson = personName !=null && personName.trim().length() >0;
        boolean signCompany = companyName != null && companyName.trim().length() >0;
        if(signPerson && signPerson){
            throw new IllegalArgumentException("一份保险合同不能同时与人和公司签订");
        }

        if(signPerson==false && signPerson==false){
            throw new IllegalArgumentException("一份保险合同不能没有签订对象");
        }

        if(beginDate <=0){
            throw new IllegalArgumentException("保险合同必须有开始生效的日期");
        }
        if(endDate <=0){
            throw new IllegalArgumentException("保险合同必须有失效的日期");
        }

        if(endDate <=beginDate){
            throw new IllegalArgumentException("保险失效的日期必须大于保险生效的日期");
        }

        return new InsuranceContract(this);
    }

    public String getContractId() {
        return contractId;
    }

    public String getPersonName() {
        return personName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public long getBeginDate() {
        return beginDate;
    }

    public long getEndDate() {
        return endDate;
    }

    public String getOtherData() {
        return otherData;
    }
}
