package com.example.demos.util;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @author dingsong
 */
@Slf4j
public class YongCaiListener<T> extends AnalysisEventListener<T> {

    List<T> resultList;

    public YongCaiListener(List<T> resultList) {
        this.resultList = resultList;
    }

    /**
     * 这个每一条数据解析都会来调用
     *
     * @param data    one row value. Is is same as {@link AnalysisContext#readRowHolder()}
     * @param context
     */
    @Override
    public void invoke(T data, AnalysisContext context) {
        //log.debug("解析到一条数据:{}", JSON.toJSONString(data));
        resultList.add(data);
    }

    /**
     * 所有数据解析完成了 都会来调用
     *
     * @param context
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        log.debug("所有数据解析完成！");
    }


}
