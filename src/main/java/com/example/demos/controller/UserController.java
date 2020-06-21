package com.example.demos.controller;

import com.example.demos.common.ResponseBean;
import com.example.demos.common.StatusCode;
import com.example.demos.entity.UserEntity;
import com.example.demos.service.UserService;
import com.example.demos.vo.res.LoginRes;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

@Api(tags = "用户测试")
@RestController
@RequestMapping("/dataUser")
public class UserController {
    @Resource
    UserService userService;

    @ApiOperation("用户登录测试")
    @PostMapping(value = "/userLogin")
    public ResponseBean userLogin(@RequestParam(value = "account") String account
            ,@RequestParam(value = "password") String password) throws Exception{
        UserEntity user = userService.login(account);

        if(user == null || !password.equalsIgnoreCase(user.getPassword())  ){
            return new ResponseBean(StatusCode.OK_FAIL_LOGIN, null);
        }
        LoginRes loginRes = new LoginRes();
        BeanUtils.copyProperties(user,loginRes);


        return new ResponseBean(StatusCode.OK, loginRes);
    }
}
