package com.mayizt;

import com.mayizt.mapper.JmMapper;
import com.mayizt.mapper.UserMapper;
import com.mayizt.pojo.Jm;
import com.mayizt.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
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

        //第二个表

        //获取代理
        JmMapper umtwo=ss.getMapper(JmMapper.class);

        List<Jm> jm=umtwo.selectAll();
        System.out.println(jm);
        Jm jmt=umtwo.selectByid(3);
        System.out.println(jmt);

        //关闭
        ss.close();


    }
}