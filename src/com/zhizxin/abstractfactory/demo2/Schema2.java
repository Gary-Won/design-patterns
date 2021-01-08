package com.zhizxin.abstractfactory.demo2;

import com.zhizxin.abstractfactory.raw.AMDCPU;
import com.zhizxin.abstractfactory.raw.MSIMainboard;

/**
 * @author wangqiu
 * @date 2021/1/6 - 20:14
 */
public class Schema2 implements AbstractFactory {
    @Override
    public Object createProduct(int type) {
        Object obj = null;
        if(1 == type){
            obj = new AMDCPU(939);
        }else if(2 == type){
            obj = new MSIMainboard(939);
        }
        return obj;
    }
}
