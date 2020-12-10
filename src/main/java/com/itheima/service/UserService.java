package com.itheima.service;

import com.itheima.mapper.UserMapper;
import com.itheima.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserMapper mapper;

    //查询ById
    public User findById(long id){
        return mapper.selectByPrimaryKey(id);
    }

    //新增保存用户
    @Transactional
    public void save(User user){
        mapper.insertSelective(user);//选择性新增，如果里面有属性为空，则那个不会插入数据
    }

}
