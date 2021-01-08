package com.zhizxin.abstractfactory.demo3;

import com.zhizxin.abstractfactory.demo2.AbstractFactory;
import com.zhizxin.abstractfactory.raw.GAMainboard;
import com.zhizxin.abstractfactory.raw.IntelCPU;

/**
 * @author wangqiu
 * @date 2021/1/6 - 20:21
 */
public class Schema3 implements AbstractFactory {
    @Override
    public Object createProduct(int type) {
        Object obj = null;
        if(1 == type){
            obj = new IntelCPU(1156);
        }else if(2 == type){
            obj = new GAMainboard(1156);
        }else if(3 == type){
            obj = new HyMemory();
        }
        return obj;
    }
}
