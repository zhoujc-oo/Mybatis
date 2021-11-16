package com.zhoujc.dao;

import com.zhoujc.pojo.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author zhoujc
 * @Date 2021/11/9
 */
public interface UserMapper {

    //通过ID查询用户
    User getUserById(int id);

    List<User> getUserByRowBounds();

    List<User> getUserByLimit(HashMap<String, Integer> map);
}