package test;

import com.baizhi.Entrance;
import com.baizhi.dao.StudentDao;
import com.baizhi.entity.Student;
import com.baizhi.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = Entrance.class)
@RunWith(SpringRunner.class)
public class StudentTest {

    @Autowired
    private StudentService studentDao;

    @Test
    public void test1(){
       List<Student> list =  studentDao.getAll();
        for (Student student : list) {
            System.out.println(student);
        }
    }

}
