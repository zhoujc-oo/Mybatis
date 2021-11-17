package com.zhoujc.dao;

import com.zhoujc.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Author zhoujc
 * @Date 2021/11/16
 */
public interface TeacherMapper {

    @Select("select * from Teacher where id = #{id}")
    Teacher getTeacher( @Param("tid") int id);
}
