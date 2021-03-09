package org.example;

import com.powernode.ba01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class myTexty {

    @Test
    public void text01(){

        String config = "ba01/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student myStudent = (Student) ac.getBean("myStudent");
         Date myDate= (Date) ac.getBean("Date");
        System.out.println("student对象="+myStudent);
        System.out.println("当前时间:"+myDate);
    }
}
