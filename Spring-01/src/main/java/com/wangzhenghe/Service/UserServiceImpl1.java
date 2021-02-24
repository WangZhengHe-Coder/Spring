package com.wangzhenghe.Service;

import com.wangzhenghe.Dao.UserDao;

public class UserServiceImpl1 implements UserService {

    private UserDao userDao;

    public UserServiceImpl1(UserDao userDao){
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
