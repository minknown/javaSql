package com.mayizt.redis;

import cn.hutool.json.JSONUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisApplication.class, args);

        String json="{\"name\":\"linbangmin\",\"age\":\"18\",\"mob\":\"18593161083\"}";
        Student nc=JSONUtil.toBean(json,Student.class);
        System.out.println(nc.toString());

    }

}
