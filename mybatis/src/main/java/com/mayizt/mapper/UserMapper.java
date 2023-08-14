package com.mayizt.mapper;

import com.mayizt.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user limit 3")
    public List<User> showall();

    public User getbyid(int id);
}
