package com.zhizxin.builder.raw;

import com.zhizxin.builder.ExportDataModel;
import com.zhizxin.builder.ExportFooterModel;
import com.zhizxin.builder.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

/**
 * @author wangqiu
 * @date 2021/1/9 - 7:28
 */
public class ExportToTxt {
    public static void export(ExportHeaderModel ehm, Map<String, Collection<ExportDataModel>> mapData, ExportFooterModel efm){
        StringBuffer sb = new StringBuffer();
        sb.append(ehm.getDepId() + "," + ehm.getExportDate() + "\n");

        for(String tblName : mapData.keySet()){
            sb.append(tblName+"\n");
            for(ExportDataModel dem : mapData.get(tblName)){
                sb.append(dem.getProductId() + "," + dem.getMount() + "," + dem.getPrice() +"\n");
            }
        }

        sb.append(efm.getExportUser());

        System.out.println("输出文本文件的内容： "+"\n" + sb);
    }
}
