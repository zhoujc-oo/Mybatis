package com.zhoujc.utils;
import org.junit.Test;
import java.util.UUID;

/**
 * @Author zhoujc
 * @Date 2021/11/17
 */
@SuppressWarnings("all")
public class IDutils {

    public static String getId() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    @Test
    public void test() {
        System.out.println(IDutils.getId());
        System.out.println(IDutils.getId());
        System.out.println(IDutils.getId());
    }
}
