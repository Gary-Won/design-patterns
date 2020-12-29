package com.zhizxin.adapter.temple;

/**
 * @author wangqiu
 * @date 2020/12/27 - 19:02
 */
public class Adapter implements Target{
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
