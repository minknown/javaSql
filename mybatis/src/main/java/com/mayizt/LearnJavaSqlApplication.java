package com.mayizt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mayizt.mapper")
public class LearnJavaSqlApplication {

    public static void main(String[] args) {
        System.out.println("HELLO!");
        SpringApplication.run(LearnJavaSqlApplication.class, args);
    }

}
