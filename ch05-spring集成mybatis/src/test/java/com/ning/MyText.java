package com.ning;

import com.ning.Dao.StudentDao;
import com.ning.domain.Student;
import com.ning.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyText {

    @Test
    public void text01(){
        String config = "applicationContext.xml";
        ApplicationContext act = new ClassPathXmlApplicationContext(config);
        String name[] = act.getBeanDefinitionNames();
        for (String na :name) {
            System.out.println("容器中对象名称:"+na+"\t"+act.getBean(na));
        }
    }

    @Test
    public void text02(){
        String config = "applicationContext.xml";
        ApplicationContext act = new ClassPathXmlApplicationContext(config);
        /**获取spring容器中的dao对象  名字为接口名小写*/
        StudentDao dao = (StudentDao) act.getBean("studentDao");
        Student student = new Student();
        student.setId(1007);
        student.setName("诸葛亮");
        student.setEmail("zg@qq.com");
        student.setAge(45);
        int num =  dao.insertStudent(student);
        System.out.println("num="+num);
    }

    @Test
    public void textServiceInsert(){
        String config = "applicationContext.xml";
        ApplicationContext act = new ClassPathXmlApplicationContext(config);
        /**获取spring容器中的dao对象  名字为接口名小写*/
        StudentService studentService = (StudentService) act.getBean("studentService");
        Student student = new Student();
        student.setId(1009);
        student.setName("典韦");
        student.setEmail("Dw@qq.com");
        student.setAge(47);
        int num = studentService.addStudent(student);
        System.out.println("num="+num);
    }

    @Test
    public void textServiceSelect(){
        String config = "applicationContext.xml";
        ApplicationContext act = new ClassPathXmlApplicationContext(config);
        /**获取spring容器中的dao对象  名字为接口名小写*/
        StudentService studentService = (StudentService) act.getBean("studentService");
        List<Student> studentList = studentService.queryStudents();
        for (Student st : studentList) {
            System.out.println(st);
        }
    }
}
