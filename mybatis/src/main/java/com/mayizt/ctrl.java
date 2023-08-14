package com.mayizt;

import com.mayizt.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody

public class ctrl {
    @Autowired
    private UserMapper xxx;
    @GetMapping
    public String aaa(){
        System.out.println(xxx.showall());

        return "THIS IS MY PAGE.<br>"+xxx.getbyid(3).toString();
    }
}
