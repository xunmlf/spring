package com.ning;

import com.ning.domain.Student;
import com.ning.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Text {

    @Test
    public void Text01(){
        String config = "applicationContext.xml";
        ApplicationContext act = new ClassPathXmlApplicationContext(config);
        StudentService service = (StudentService) act.getBean("studentService");
        List<Student> students =  service.studentServiceSelect();
        for (Student stu : students) {
            System.out.println(stu);
        }

    }
}
