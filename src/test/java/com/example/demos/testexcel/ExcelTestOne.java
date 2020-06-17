package com.example.demos.testexcel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.fastjson.JSON;
import com.example.demos.vo.req.TestOneReq;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import com.example.demos.util.YongCaiListener;

import java.util.ArrayList;
import java.util.List;

@RunWith(JUnit4.class)
@Slf4j
public class ExcelTestOne {
    @Test
    public void testReadOne() {
        String filePath = "C:\\Users\\dingsong\\Desktop\\Test\\demosone.xlsx";
        List<TestOneReq> testOneReqs = new ArrayList<>();
        EasyExcel.read(filePath, TestOneReq.class, new YongCaiListener(testOneReqs)).sheet().doRead();
        testOneReqs.forEach(
                i -> {
                    log.info(JSON.toJSONString(i));
                });
    }
}
