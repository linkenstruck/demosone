package com.example.demos.testdao;

import com.example.demos.dao.UserDao;
import com.example.demos.entity.UserEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
/**
 * 以下注释为junit4所需包
 */
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



//@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUserDao{
    @Autowired
    UserDao dao;

    @Test
    public void test00Insert() throws Exception{
        UserEntity e = new UserEntity();
        e.setId(5);
        e.setAccount("1210805334");
        e.setPassword("dddsssdsd");
        e.setName("嘻嘻");
        e.setBirth(LocalDate.now());
        e.setCreateTime(LocalDateTime.now());
        e.setSex(0);
        dao.insert(e);
    }


    @Test
    public void test00Delete() throws Exception{
        dao.delete(5);
    }

    @Test
    public void test00Select() throws Exception{
        UserEntity user = dao.select("birth",2020-01-21);
        System.out.println(user);
    }

    @Test
    public void test00SelectByDate() throws Exception{
        UserEntity user = dao.selectByDate("20200122");
        System.out.println(user);
    }

    @Test
    public void test00Update() throws Exception{
        Map<String,Object> map=new HashMap<>();
        map.put("name", "张三");
        map.put("password", "123456");
        dao.update(1, map);
    }

    @Test
    public void test00SelectAll() throws Exception{
        List<UserEntity> users = dao.selectAll("id");
        for (UserEntity user:users) {
            System.out.println(user);
        }

    }
}
