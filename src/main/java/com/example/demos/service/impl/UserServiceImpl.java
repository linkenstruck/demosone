package com.example.demos.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demos.dao.TestOneDao;
import com.example.demos.dao.UserDao;
import com.example.demos.entity.TestOneEntity;
import com.example.demos.entity.UserEntity;
import com.example.demos.service.UserService;
import com.example.demos.vo.res.LoginRes;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.validation.constraints.NotNull;

@Service
public class UserServiceImpl  implements UserService {
    @Resource
    UserDao userDao;

    @Override
    public UserEntity login(@NotNull String account) throws Exception {
        UserEntity user = userDao.select("account",account);
        return user;
    }
}
