package com.ning;

import com.ning.domain.Student;
import com.ning.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class tt {
    public static void main(String[] args) {
        String config = "spring.xml";
        ApplicationContext act = new ClassPathXmlApplicationContext(config);
        StudentService service = (StudentService) act.getBean("studentService");
        List<Student> students =  service.studentServiceSelect();
        for (Student stu : students) {
            System.out.println(stu);
        }
    }
}
