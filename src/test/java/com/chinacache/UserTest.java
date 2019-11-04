package com.chinacache;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;

import java.io.InputStream;

public class UserTest {
    SqlSession sqlSession = null;

    @Before
    public void init() {
        String resource = "mybatis-config.xml";
        InputStream is = getClass().getClassLoader().getResourceAsStream(resource);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        sqlSession = factory.openSession();
    }

    @org.junit.Test
    public void testGetUser() {
        String stmt = "com.chinacache.UserMapper.getUser";
        User user = sqlSession.selectOne(stmt, 1);
        System.out.println(user);
        sqlSession.close();
    }
}