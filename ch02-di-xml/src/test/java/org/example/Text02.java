package org.example;

import com.powernode.ba02.Student;
import com.powernode.ba02.School;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class Text02 {

    @Test
    public void text01(){

        String config = "ba02/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student myStudent = (Student) ac.getBean("myStudent");
        System.out.println("student对象="+myStudent);
    }

    @Test
    public void text(){
        System.out.println("测试~~~~~");
        Student student = new Student();
        student.setAge(11);
        student.setName("lisi");

        School school = new School();
        school.setName("动力节点");
        school.setAddress("北京");
        student.setSchool(school);
        System.out.println("student=="+student);
    }
}
