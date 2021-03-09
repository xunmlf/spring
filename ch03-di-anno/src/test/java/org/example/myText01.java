package org.example;

import com.spring.ba01.student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myText01 {
    @Test
    public void text01(){
        String config = "ApplicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //从容器中获取对象
       student st = (student) ac.getBean("myStudent");
        System.out.println("student=="+st);
    }
}
