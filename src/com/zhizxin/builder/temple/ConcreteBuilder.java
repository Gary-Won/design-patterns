package com.zhizxin.builder.temple;

/**
 * @author wangqiu
 * @date 2021/1/9 - 9:29
 */
public class ConcreteBuilder implements Builder {

    private Product resultProduct;

    public Product getResult(){
        return resultProduct;
    }

    @Override
    public void buildPart() {

    }
}
