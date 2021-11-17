import com.zhoujc.dao.StudentMapper;
import com.zhoujc.dao.TeacherMapper;
import com.zhoujc.pojo.Student;
import com.zhoujc.pojo.Teacher;
import com.zhoujc.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Author zhoujc
 * @Date 2021/11/16
 */
public class MyTest {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);

        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);

        sqlSession.close();
    }

    @Test
    public void testStudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> studentsList = mapper.getStudent();
        for (Student student : studentsList){
            System.out.println(student);
        }
        sqlSession.close();
    }

    @Test
    public void testStudent2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> studentsList = mapper.getStudent2();
        for (Student student : studentsList){
            System.out.println(student);
        }
        sqlSession.close();
    }
}
