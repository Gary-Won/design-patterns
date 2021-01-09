package com.zhizxin.builder.demo1;

import com.zhizxin.builder.ExportDataModel;
import com.zhizxin.builder.ExportFooterModel;
import com.zhizxin.builder.ExportHeaderModel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wangqiu
 * @date 2021/1/9 - 10:20
 */
public class Client {
    public static void main(String[] args) {

        Map<String, Collection<ExportDataModel>> mapData = new HashMap<>();
        Collection<ExportDataModel> col = new ArrayList<>();

        ExportHeaderModel ehm = new ExportHeaderModel();
        ehm.setDepId("科技有限公司");
        ehm.setExportDate("2021-01-09");

        ExportDataModel edm1 = new ExportDataModel();
        edm1.setProductId("产品1");
        edm1.setMount(1000);
        edm1.setPrice(80);

        ExportDataModel edm2 = new ExportDataModel();
        edm2.setProductId("产品2");
        edm2.setMount(1010);
        edm2.setPrice(70);

        ExportDataModel edm3 = new ExportDataModel();
        edm3.setProductId("产品3");
        edm3.setMount(1020);
        edm3.setPrice(60);

        col.add(edm1);
        col.add(edm2);
        col.add(edm3);

        mapData.put("仓库库存", col);

        ExportFooterModel efm = new ExportFooterModel();
        efm.setExportUser("李四");

        TxtBuilder txtBuilder = new TxtBuilder();
        Director director = new Director(txtBuilder);
        director.construct(ehm, mapData, efm);
        System.out.println("输出为txt文本：\n" + txtBuilder.getResult());
        System.out.println("==============================================================");
        XmlBuilder xmlBuilder = new XmlBuilder();
        Director director1 = new Director(xmlBuilder);
        director1.construct(ehm, mapData, efm);
        System.out.println("输出为xml文本：\n" + xmlBuilder.getReport());
    }
}
