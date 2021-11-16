package com.zhoujc.dao;

import com.zhoujc.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;

/**
 * @Author zhoujc
 * @Date 2021/11/9
 */
public interface UserMapper {

    @Select("select * from user")
    List<User> getUsers();

}