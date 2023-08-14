package com.mayizt.redis;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.annotation.sql.DataSourceDefinition;

/**
 * 用户：Administrator
 * 描述：学生
 */
@Data
@AllArgsConstructor
public class Student {
    private String name;
    private String age;
    private String mob;
}
