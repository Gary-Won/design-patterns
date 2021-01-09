package com.zhizxin.builder.demo1;

import com.zhizxin.builder.ExportDataModel;
import com.zhizxin.builder.ExportFooterModel;
import com.zhizxin.builder.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

/**
 * @author wangqiu
 * @date 2021/1/9 - 10:04
 */
public class XmlBuilder implements Builder {

    private StringBuffer sb = new StringBuffer();

    @Override
    public void buildHeader(ExportHeaderModel ehm) {
        sb.append("<Report>\n");
        sb.append("  <Header>\n");
        sb.append("    <DepId>" + ehm.getDepId() + "</DepId>\n");
        sb.append("    <ExportDate>" + ehm.getExportDate() + "</ExportDate>\n");
        sb.append("  </Header>\n");
    }

    @Override
    public void buildBody(Map<String, Collection<ExportDataModel>> mapData) {
        sb.append("  <Body>\n");
        for(String tabName: mapData.keySet()){
            sb.append("    <Datas= \"" + tabName + "\">\n");
            for(ExportDataModel edm: mapData.get(tabName)){
                sb.append("      <Data>\n");
                sb.append("        <ProductId>" + edm.getProductId() + "</ProductId>\n");
                sb.append("        <Mount>" + edm.getMount() + "</Mount>\n");
                sb.append("        <Price>" + edm.getPrice() + "</Price>\n");
                sb.append("      <Data>\n");
            }
            sb.append("    <Datas>\n");
        }
        sb.append("  </Body>\n");
    }

    @Override
    public void buildFooter(ExportFooterModel efm) {
        sb.append("  <Footer>" + efm.getExportUser() + "</Footer>\n");
        sb.append("</Report>\n");
    }

    public StringBuffer getReport(){
        return sb;
    }
}
