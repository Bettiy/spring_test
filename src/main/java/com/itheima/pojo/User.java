package com.itheima.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 在编译阶段会根据注解自动生成对应方法；Data包含get/set/hashCode/equals/toString等
 */
@Data
//@Slf4j   //日志功能注解
@Table(name = "tb_user")
public class User {

    @Id //标志是主键
    @KeySql(useGeneratedKeys = true)//主键回填
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
