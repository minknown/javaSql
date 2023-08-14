package com.mayizt.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 用户：Administrator
 * 描述：用户类
 */
@Data
@TableName("user")

public class User {
    @TableId
    private Long id;
    private String name;
    private String password;
}
