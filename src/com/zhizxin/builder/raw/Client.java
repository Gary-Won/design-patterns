package com.zhizxin.builder.raw;

import com.zhizxin.builder.ExportDataModel;
import com.zhizxin.builder.ExportFooterModel;
import com.zhizxin.builder.ExportHeaderModel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wangqiu
 * @date 2021/1/9 - 8:08
 */
public class Client {
    public static void main(String[] args) {
        ExportHeaderModel ehm = new ExportHeaderModel();
        ehm.setDepId("一分公司");
        ehm.setExportDate("2021-1-9");
        Map<String, Collection<ExportDataModel>> mapData = new HashMap<String, Collection<ExportDataModel>>();
        Collection<ExportDataModel> col = new ArrayList<>();

        ExportDataModel edm1 = new ExportDataModel();
        edm1.setProductId("产品001号");
        edm1.setMount(100);
        edm1.setPrice(80);

        ExportDataModel edm2 = new ExportDataModel();
        edm2.setProductId("产品002号");
        edm2.setMount(90);
        edm2.setPrice(70);

        ExportDataModel edm3 = new ExportDataModel();
        edm3.setProductId("产品003号");
        edm3.setMount(80);
        edm3.setPrice(60);

        col.add(edm1);
        col.add(edm2);
        col.add(edm3);
        mapData.put("销售记录表", col);

        ExportFooterModel efm = new ExportFooterModel();
        efm.setExportUser("张三");

//        ExportToTxt.export(ehm, mapData, efm);

        ExportToXml.export(ehm, mapData, efm);

    }
}
