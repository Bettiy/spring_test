package com.itheima;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//@MapperScan：扫描mybatis所有的业务mapper接口所在的包路径
//@MapperScan("com.itheima.mapper")
@MapperScan("com.itheima.mapper")//通用mapper  tk包开头
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
