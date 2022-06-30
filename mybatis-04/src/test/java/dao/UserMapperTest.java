package dao;

import com.zhoujc.dao.UserMapper;
import com.zhoujc.pojo.User;
import com.zhoujc.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Author zhoujc
 * @Date 2021/11/16
 */
public class UserMapperTest {
    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);


//        mapper.deleteUser(3);


        User user = mapper.getUserById(2, "微博");
        System.out.println(user);


//        List<User> users = mapper.getUsers();
//        for (User user : users) {
//            System.out.println(user);
//            sqlSession.close();
//        }
    }
}
