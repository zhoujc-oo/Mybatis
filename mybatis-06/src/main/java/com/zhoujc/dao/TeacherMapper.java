package com.zhoujc.dao;

import com.zhoujc.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author zhoujc
 * @Date 2021/11/16
 */
public interface TeacherMapper {


    Teacher getTeacher(@Param("tid") int id);


    Teacher getTeacher2(@Param("tid") int id);

    List<Teacher> getTeacher();
}
