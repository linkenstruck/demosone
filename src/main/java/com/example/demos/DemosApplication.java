package com.example.demos;

//import org.springframework.boot.test.context.SpringBootTest;
//以下两个为junit4测试配置相关导入包
//import org.junit.runner.RunWith;
//import org.springframework.test.context.junit4.SpringRunner;
import com.example.demos.common.WebMvcConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author dingsong
 */ //@SpringBootTest
//以下注解作用为防止service,dao等自动注入失败，junit4需要，junit5测试不需要
//@RunWith(SpringRunner.class)
@SpringBootApplication
@MapperScan({"mapper","com.example.demos.dao"})
@EnableWebMvc
public class DemosApplication{

    public static void main(String[] args) {
        //Spring应用启动起来
        SpringApplication.run(DemosApplication.class, args);
    }
}
