package com.zhizxin.builder.raw;

import com.zhizxin.builder.ExportDataModel;
import com.zhizxin.builder.ExportFooterModel;
import com.zhizxin.builder.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

/**
 * @author wangqiu
 * @date 2021/1/9 - 7:47
 */
public class ExportToXml {
    public static void export(ExportHeaderModel ehm, Map<String, Collection<ExportDataModel>> mapData, ExportFooterModel efm){
        StringBuffer sb = new StringBuffer();
        sb.append("<?xml version='1.0' encoding='gb2312'?>\n");
        sb.append("<Report>\n");
        sb.append("  <Header>\n");
        sb.append("    <DepId>" + ehm.getDepId() + "</DepId>\n");
        sb.append("    <ExportDate>" + ehm.getExportDate() + "</ExportDate>\n");
        sb.append("  </Header>\n");

        sb.append("  <Body>\n");
        for(String sblName : mapData.keySet()){
            sb.append("    <Datas TableName=\"" +sblName +"\">\n");
            for(ExportDataModel edm : mapData.get(sblName)){
                sb.append("      <Data>\n");
                sb.append("        <ProductId>" + edm.getProductId() + "</ProductId>\n");
                sb.append("        <Mount>" + edm.getMount() + "</Mount>\n");
                sb.append("        <Price>" + edm.getPrice() + "</Price>\n");
                sb.append("      </Data>\n");
            }
            sb.append("    </Datas>\n");
        }
        sb.append("  </Body>\n");

        sb.append("  <Footer>\n");
        sb.append("  <ExportUser>" + efm.getExportUser() + "</ExportUser>\n");
        sb.append("</Footer>\n");

        System.out.println("输出xml的内容： "+"\n" + sb);
    }
}
