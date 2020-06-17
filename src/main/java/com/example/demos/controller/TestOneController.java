package com.example.demos.controller;

import com.alibaba.excel.EasyExcel;
import com.example.demos.common.ResponseBean;
import com.example.demos.common.StatusCode;
import com.example.demos.entity.TestOneEntity;
import com.example.demos.service.TestOneService;
import com.example.demos.vo.req.TestOneReq;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.example.demos.util.YongCaiListener;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.*;

/**
 * @author dingsong
 */
@Api(tags = "测试1")
@RestController
@RequestMapping("/dataTestOne")
public class TestOneController {
    @Resource
    TestOneService testOneService;

    @ApiOperation("导入测试1文档")
    @PostMapping(value = "/importTestOne")
    public ResponseBean importTestOne(@RequestPart MultipartFile file) {
        List<TestOneReq> testOneReqs = new ArrayList<>();
        try {
            EasyExcel.read(file.getInputStream(), TestOneReq.class, new YongCaiListener<>(testOneReqs)).sheet().doRead();
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<TestOneEntity> testOneEntities = new ArrayList<>();
        for(TestOneReq testOneReq:testOneReqs){
            TestOneEntity testOneEntity = new TestOneEntity();
            BeanUtils.copyProperties(testOneReq,testOneEntity);
            testOneEntities.add(testOneEntity);
        }

        testOneService.saveBatch(testOneEntities);
        return new ResponseBean(StatusCode.OK, null);
    }
}
