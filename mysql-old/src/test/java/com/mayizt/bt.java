package com.mayizt;

import com.mayizt.mapper.UserMapper;
import com.mayizt.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class bt {
    @Test
    public void Test() throws IOException {
        System.out.println("Hello world!");
        String resource = "mybaits-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //获得SESSION对象
        SqlSession ss=sqlSessionFactory.openSession();

        //获取代理
        UserMapper um=ss.getMapper(UserMapper.class);


        //查询
        List<User> users=um.selectAll();
        System.out.println(users);
        User user=um.selectByid(3);
        System.out.println(user);
        //关闭
        ss.close();



    }

}
