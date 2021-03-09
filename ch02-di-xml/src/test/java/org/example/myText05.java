package org.example;

import com.powernode.ba05.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myText05 {

    @Test
    public void text01(){

        String config = "ba05/total.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student myStudent = (Student) ac.getBean("myStudent2");
        System.out.println("student对象="+myStudent);
    }

}
