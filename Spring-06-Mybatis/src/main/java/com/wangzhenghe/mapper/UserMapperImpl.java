package com.wangzhenghe.mapper;

import com.wangzhenghe.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper {

    private SqlSessionTemplate sqlsession;

    public void setSqlsession(SqlSessionTemplate sqlsession) {
        this.sqlsession = sqlsession;
    }

    public List<User> getAllUser() {
        return sqlsession.getMapper(UserMapper.class).getAllUser();
    }
}
