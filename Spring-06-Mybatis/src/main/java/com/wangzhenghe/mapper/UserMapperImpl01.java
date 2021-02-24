package com.wangzhenghe.mapper;

import com.wangzhenghe.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl01 extends SqlSessionDaoSupport implements UserMapper {
    public List<User> getAllUser() {
        return getSqlSession().getMapper(UserMapper.class).getAllUser();
    }
}
