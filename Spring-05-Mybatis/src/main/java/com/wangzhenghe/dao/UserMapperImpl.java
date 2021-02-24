package com.wangzhenghe.dao;

import com.wangzhenghe.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper {
    //在原来，我们所有的操作，都使用sqlSession来执行，现在都使用SqlSessionTemplate
    private SqlSessionTemplate sqlsession;

    public void setSqlsession(SqlSessionTemplate sqlsession) {
        this.sqlsession = sqlsession;
    }

    public List<User> getUserList() {
        return sqlsession.getMapper(UserMapper.class).getUserList();
    }
}
