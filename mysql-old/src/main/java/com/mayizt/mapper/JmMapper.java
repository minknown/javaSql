package com.mayizt.mapper;

import com.mayizt.pojo.Jm;
import org.apache.ibatis.annotations.Select;


import java.util.List;

public interface JmMapper {

    /*@Select("select * from user where id in(2,3)")*/
    List<Jm> selectAll();
    Jm selectByid(int id);
}
