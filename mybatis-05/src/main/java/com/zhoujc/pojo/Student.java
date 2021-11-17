package com.zhoujc.pojo;

import lombok.Data;

import java.awt.*;

/**
 * @Author zhoujc
 * @Date 2021/11/16
 */
@Data
public class Student {

    private int id;
    private String name;
    private Teacher teacher;

}