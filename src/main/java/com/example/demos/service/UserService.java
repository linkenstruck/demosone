package com.example.demos.service;

import com.example.demos.entity.UserEntity;
import com.example.demos.vo.res.LoginRes;

/**
 * @author dingsong
 */
public interface UserService {
    public UserEntity login(String account) throws Exception;
}
