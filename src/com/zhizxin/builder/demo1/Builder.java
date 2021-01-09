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
public interface Builder {
    public void buildHeader(ExportHeaderModel ehm);
    public void buildBody(Map<String, Collection<ExportDataModel>> mapData);
    public void buildFooter(ExportFooterModel efm);
}
