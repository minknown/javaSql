package com.mayizt.mapper;
import com.mayizt.pojo.User;
import java.util.List;

public interface UserMapper {
    List<User> selectAll();
    User selectByid(int id);
}
