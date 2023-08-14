package com.mayizt.redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.Set;
import java.util.concurrent.TimeUnit;


@SpringBootTest
class RedisApplicationTests {
    @Autowired
    private StringRedisTemplate redisTemplate;
    @Test
    void contextLoads() {

        System.out.println("hellot");


        redisTemplate.opsForValue().set("qqc","83881278",10, TimeUnit.SECONDS);


    }

}
