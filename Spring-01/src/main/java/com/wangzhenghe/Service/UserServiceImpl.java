package com.wangzhenghe.Service;

import com.wangzhenghe.Dao.UserDao;
import com.wangzhenghe.Dao.UserDaoImpl;
import com.wangzhenghe.Dao.UserMysqlDaoImpl;

public class UserServiceImpl implements UserService {

//    private UserDao userDao = new UserDaoImpl();

    private UserDao userDao = new UserMysqlDaoImpl();

    public void getUser() {
        userDao.getUser();
    }
}
