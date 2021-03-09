package org.example;

import com.powernode.ba03.School;
import com.powernode.ba03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myText03 {

    @Test
    public void text01(){

        String config = "ba03/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student myStudent = (Student) ac.getBean("my");
        System.out.println("student对象="+myStudent);
    }

}
