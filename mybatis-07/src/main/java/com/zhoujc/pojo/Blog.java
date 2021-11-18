package com.zhoujc.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @Author zhoujc
 * @Date 2021/11/17
 */
@Data
public class Blog {
    private int id;
    private String title;
    private String author;
    private Date createTime;
    private int views;

}
