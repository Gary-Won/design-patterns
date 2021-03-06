package com.zhizxin.abstractfactory.demo2;

import com.zhizxin.abstractfactory.raw.GAMainboard;
import com.zhizxin.abstractfactory.raw.IntelCPU;

/**
 * @author wangqiu
 * @date 2021/1/6 - 20:13
 */
public class Schema1 implements AbstractFactory {
    @Override
    public Object createProduct(int type) {
        Object obj = null;
        if(1 == type){
            obj = new IntelCPU(1156);
        }else if(2 == type){
            obj = new GAMainboard(1156);
        }
        return obj;
    }
}
