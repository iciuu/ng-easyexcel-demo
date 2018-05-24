package com.ng.easyexcel.ngeasyexcel.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ExcelListener extends AnalysisEventListener {

    private List<Object> datas = new ArrayList<>();

    @Override
    public void invoke(Object o, AnalysisContext analysisContext) {
        System.out.println(analysisContext.getCurrentRowNum());
        System.out.println(o);
        datas.add(o);

    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        datas.clear();
    }

    private void doSomething(Object o){
        // bulabula
    }
}
