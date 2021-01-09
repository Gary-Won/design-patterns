package com.zhizxin.builder.temple;

/**
 * @author wangqiu
 * @date 2021/1/9 - 9:27
 */
public class Director {
    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void construct(){
        builder.buildPart();
    }
}
