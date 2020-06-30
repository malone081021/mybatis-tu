package com.malone.base.mybatis.tu;

import com.malone.base.mybatis.tu.mapper.UserMapper;
import com.malone.base.mybatis.tu.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * 照抄官网的例子，调试使用
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String property = "sun.misc.ProxyGenerator.saveGeneratedFiles";
        System.getProperties().setProperty(property, "true");
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 打开Session，内部创建Executor
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        // 执行Mapper方法
        User user = userMapper.getUser();
        System.out.println(user);
    }
}
