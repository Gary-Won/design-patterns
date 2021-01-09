package com.zhizxin.builder.demo1;

import com.zhizxin.builder.ExportDataModel;
import com.zhizxin.builder.ExportFooterModel;
import com.zhizxin.builder.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

/**
 * @author wangqiu
 * @date 2021/1/9 - 9:43
 */
public class Director {
    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void construct(ExportHeaderModel ehm, Map<String, Collection<ExportDataModel>> dataMap, ExportFooterModel efm){
        this.builder.buildHeader(ehm);
        this.builder.buildBody(dataMap);
        this.builder.buildFooter(efm);
    }

}
