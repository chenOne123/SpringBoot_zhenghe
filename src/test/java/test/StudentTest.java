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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest(classes = Entrance.class)
@RunWith(SpringRunner.class)
public class StudentTest {

    @Autowired
    private StudentService studentService;
    @Autowired
    private StudentDao studentDao;

    @Test
    public void test1(){
       Map map = studentService.getAll(2,2);
        System.out.println(map);
    }

    @Test
    public void test2(){
        int s = studentDao.getCount();
        System.out.println(s);
    }

}
