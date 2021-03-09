package org.example;

import com.spring.ba04.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class myText04 {
    @Test
    public void text01(){
        String config = "ApplicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //从容器中获取对象
       Student st = (Student) ac.getBean("myStudent");
        System.out.println("student=="+st);
    }
}
