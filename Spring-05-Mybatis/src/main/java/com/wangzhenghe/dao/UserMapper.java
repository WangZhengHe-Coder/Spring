package com.wangzhenghe.dao;

import com.wangzhenghe.pojo.User;

import java.util.List;

public interface UserMapper {

    //查询所有用户
    public List<User> getUserList();

}
