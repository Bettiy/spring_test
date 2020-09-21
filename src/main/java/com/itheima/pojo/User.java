package com.itheima.pojo;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

/**
 * 在编译阶段会根据注解自动生成对应方法；Data包含get/set/hashCode/equals/toString等
 */
@Data
@Slf4j   //日志功能注解
public class User {

    private Long id;
    private String user_name;
    private String password;
    private String name;
    private Integer age;
    private Integer sex;
    private Date birthday;
    private String note;
    private Date created;
    private Date updated;
}
