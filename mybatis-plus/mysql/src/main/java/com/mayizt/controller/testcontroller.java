package com.mayizt.controller;

import com.mayizt.UserMapper;
import com.mayizt.model.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户：Administrator
 * 描述：
 */
@Controller

public class testcontroller {
    @Resource
    private UserMapper userMapper;

    @RequestMapping("/index")
    @ResponseBody
    public Object contextLoads() {
        System.out.println("测jiek...");
        //查出
        List<User> users = userMapper.selectList(null);
        return users;
    }
}
