package com.itheima.controller;


import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.sql.DataSource;

@RestController
public class HelloController {

    @Resource
    private DataSource dataSource;

    @Value("${itcast.url}")
    private String itcastUrl;
    @Value("${baidu.url}")
    private String BaiduUrl;

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable("id") long id) {
        return userService.findById(id);
    }

    @GetMapping("/hello")
    public String hello() {
        System.out.println(dataSource);
        System.out.println(itcastUrl);
        System.out.println(BaiduUrl);
        return "Hello springboot";
    }
}
