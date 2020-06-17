package com.example.demos.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demos.dao.TestOneDao;
import com.example.demos.entity.TestOneEntity;
import com.example.demos.service.TestOneService;
import org.springframework.stereotype.Service;

@Service
public class TestOneServiceImpl extends ServiceImpl<TestOneDao, TestOneEntity> implements TestOneService {
}
