import com.zhoujc.dao.BlogMapper;
import com.zhoujc.pojo.Blog;
import com.zhoujc.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 动态SQL
 * 什么是动态SQL：动态SQL就是指根据不同的条件生成不同的SQL语句
 * 动态 SQL 元素和 JSTL 或基于类似 XML 的文本处理器相似。在 MyBatis 之前的版本中，有很多元素需要花时间了解。MyBatis 3 大大精简了元素种类，现在只需学习原来一半的元素便可。MyBatis 采用功能强大的基于 OGNL 的表达式来淘汰其它大部分元素。
 * 动态SQL就是在拼接SQL语句，我们只要保证SQL的正确性，按照SQL的格式，去排列组合就可以了
 * if
 * choose (when, otherwise)
 * trim (where, set)
 * foreach
 *
 * @Author zhoujc
 * @Date 2021/11/17
 */
public class MyTest {


    //IF
    @Test
    public void queryBlogIF() {
        SqlSession session = MybatisUtils.getSqlSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);

        HashMap map = new HashMap();
        map.put("title", "spring就是这么简单");
//        map.put("author", "狂神说");
        List<Blog> blogs = mapper.queryBlogIF(map);

        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        session.close();
    }

//    //按id进行修改trim (where,set)
//    @Test
//    public void queryBlogIF() {
//        SqlSession session = MybatisUtils.getSqlSession();
//        BlogMapper mapper = session.getMapper(BlogMapper.class);
//
//        HashMap map = new HashMap();
//        map.put("title", "java这么简单");
//        map.put("author", "狂神说");
//        map.put("id", "24678");
//        mapper.updateBlog(map);
//        session.close();
//    }

    //choose (when, otherwise)
    // switch式查询
    @Test
    public void queryBlogChoose() {
        SqlSession session = MybatisUtils.getSqlSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);

        HashMap map = new HashMap();
//        map.put("title","spring就是这么简单");
        map.put("author", "狂神说");
        List<Blog> blogs = mapper.queryBlogChoose(map);

        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        session.close();
    }

    //根据ID查询多个用户
    @Test
    public void queryBlogForeach(){
        SqlSession session = MybatisUtils.getSqlSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        HashMap map = new HashMap();

        ArrayList<Integer> ids = new ArrayList<Integer>();
        ids.add(24678);
        ids.add(325665);

        map.put("ids",ids);
        List<Blog> blogs = mapper.queryBlogForeach(map);
        for (Blog blog : blogs){
            System.out.println(blog);
        }
    }


//    @Test
//    public void updateBlog() {
//        SqlSession session = MybatisUtils.getSqlSession();
//        BlogMapper mapper = session.getMapper(BlogMapper.class);
//
//        HashMap map = new HashMap();
//        map.put("title","spring就是这么简单哈哈");
//        map.put("author","狂神说");
//        map.put("id","24678");
//        mapper.updateBlog(map);
//
//
//        session.close();
//    }

}
