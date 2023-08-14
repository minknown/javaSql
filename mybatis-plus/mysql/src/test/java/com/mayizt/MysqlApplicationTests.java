package com.mayizt;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mayizt.model.User;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest

class MysqlApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Test
    void contextLoads() {
            System.out.println("您好，这是mybaits-plus的测试...");
            //所有查出
            List<User> users = userMapper.selectList(null);
            System.out.println(users);
            System.out.println("---------------");
            //条件查询
            QueryWrapper<User> objectQueryWrapper = new QueryWrapper<>();
            objectQueryWrapper.like("name","jie");
            List<User> userstwo = userMapper.selectList(objectQueryWrapper);
            System.out.println(userstwo);
            System.out.println("---------------");
            //映射查询
        Integer integer = userMapper.selectCount(null);

            System.out.println("总数："+integer);
        List<User> getall = userMapper.getall();
        System.out.println(getall);

    }

}
