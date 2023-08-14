package com.mayizt;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mayizt.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 用户：Administrator
 * 描述：接口
 */

public interface UserMapper extends BaseMapper<User> {
    @Select("select * from user where name='linbangmin'")
    public List<User> getall();


}
