package com.zhizxin.builder.demo1;

import com.zhizxin.builder.ExportDataModel;
import com.zhizxin.builder.ExportFooterModel;
import com.zhizxin.builder.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

/**
 * @author wangqiu
 * @date 2021/1/9 - 9:55
 */
public class TxtBuilder implements Builder {

    private StringBuffer sb = new StringBuffer();

    @Override
    public void buildHeader(ExportHeaderModel ehm) {
        sb.append(ehm.getDepId() + "," + ehm.getExportDate() + "\n");
    }

    @Override
    public void buildBody(Map<String, Collection<ExportDataModel>> mapData) {
        for(String labName: mapData.keySet()){
            sb.append(labName + "\n");
            for(ExportDataModel edm : mapData.get(labName)){
                sb.append(edm.getProductId() + ", " + edm.getMount() + ", " + edm.getPrice() + "\n");
            }
        }
    }

    @Override
    public void buildFooter(ExportFooterModel efm) {
        sb.append(efm.getExportUser());
    }

    public StringBuffer getResult(){
        return sb;
    }
}
