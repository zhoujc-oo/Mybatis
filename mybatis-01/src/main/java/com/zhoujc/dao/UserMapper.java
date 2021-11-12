package com.zhoujc.dao;

import com.zhoujc.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @Author zhoujc
 * @Date 2021/11/9
 */
public interface UserMapper {
    //查询所有用户
    List<User> getUserList();

    //通过ID查询用户
    User getUserById(int id);

    //添加用户
    int addUser(User user);

    int addUser2(Map<String,Object> map);
    //修改用户
    int updateUser(User user);

    //删除一个用户
    int deleteUser(int id);
}
