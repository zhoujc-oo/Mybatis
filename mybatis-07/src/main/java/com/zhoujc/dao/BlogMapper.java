package com.zhoujc.dao;

import com.zhoujc.pojo.Blog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @Author zhoujc
 * @Date 2021/11/17
 */
public interface BlogMapper {

    int addBlog(Blog blog);

    List<Blog> queryBlogIF(Map map);

    List<Blog> queryBlogChoose(Map map);

    int  updateBlog(Map map);

    List<Blog> queryBlogForeach(Map map);
}
