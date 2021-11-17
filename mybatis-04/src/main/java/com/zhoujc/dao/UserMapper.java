package com.zhoujc.dao;

import com.zhoujc.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.HashMap;
import java.util.List;

/**
 * @Author zhoujc
 * @Date 2021/11/9
 */
public interface UserMapper {

    @Select("select * from user")
    List<User> getUsers();

    @Select("select * from user where id = #{id} and name = #{name}")
    User getUserById(@Param("id") int id,@Param("name") String  name);

    @Insert("insert into user(id,name,pwd) values (#{id},#{name},#{pwd})")
    int addUser(User user);

    @Update("update user set name=#{name},pwd=#{pwd} where id = #{id}")
    int updateUser(User user);

    @Delete("delete from user where id = #{uid}")
    int deleteUser(@Param("uid") int id);

}