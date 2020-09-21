package com.itheima.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class HelloController {

    @Autowired
    private DataSource dataSource;

    @Value("${itcast.url}")
    private String itcastUrl;
    @Value("${baidu.url}")
    private String BaiduUrl;

    @GetMapping("hello")
    public String hello(){
        System.out.println(dataSource);
        System.out.println(itcastUrl);
        System.out.println(BaiduUrl);
        return "Hello springboot";
    }
}
