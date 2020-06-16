package com.example.demos.controller;


/**import org.springframework.stereotype.Controller;
 * import org.springframework.web.bind.annotation.ResponseBody;
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 @Controller
@ResponseBody**/
//以下注解效果包含上面两个注解
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
}
