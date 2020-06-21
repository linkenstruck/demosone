package com.example.demos.dao;

import com.example.demos.entity.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.Date;


@Repository
public interface UserDao extends TemplateDao<UserEntity>{
    UserEntity selectByDate(@Param("birth") String birth)throws SQLException;
//  UserEntity selectOne(@Param("account")String account,@Param("password")String password)throws SQLException;
}
