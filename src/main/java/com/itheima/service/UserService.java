package com.itheima.service;

import com.itheima.pojo.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    //查询ById
    public User findById(long id){
        return new User();
    }

    //新增保存用户
    @Transactional
    public void save(User user){
        System.out.println("新增用户...");
    }

}
