package com.zhoujc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

/**
 * @Author zhoujc
 * @Date 2021/11/9
 */
@Data
@AllArgsConstructor
public class User {

    private int id;
    private String name;
    private String pwd;

}
