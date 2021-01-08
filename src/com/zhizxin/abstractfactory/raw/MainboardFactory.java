package com.zhizxin.abstractfactory.raw;

/**
 * @author wangqiu
 * @date 2021/1/5 - 23:01
 */
public class MainboardFactory {
    public static MainBoardApi createMainboardApi(int type){
        MainBoardApi mainboard = null;
        if(1 == type){
            mainboard = new GAMainboard(1156);
        }else if(2 == type){
            mainboard = new MSIMainboard(939);
        }
        return mainboard;
    }
}
