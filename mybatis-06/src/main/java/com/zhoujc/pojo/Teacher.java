package com.zhoujc.pojo;

import lombok.Data;

import java.util.List;

/**
 * @Author zhoujc
 * @Date 2021/11/16
 */

@Data
public class Teacher {
    private int id;
    private String name;
    private List<Student> students;


}
