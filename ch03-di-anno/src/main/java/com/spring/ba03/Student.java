package com.spring.ba03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author XUN~MLF
 */

@Component("myStudent")
public class Student {
    @Value("李四")
    private String name;
    @Value("22")
    private int age;

    /**
     * 声明一个引用类型
     *@Autowired:spring框架   提供注解，实现引用类型的赋值
     *
     *  @Autowired： 默认使用的是byType自动注入
     *     位置：1.在属性定义上面，无需set方法
     *           2.在set方法上面
     *
     *
     * */
    @Autowired
    private School school;



    public Student() {
        System.out.println("无参构造方法~~~");
    }

    public Student(String name, int age, School school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }


    public void setSchool(School school) {
        this.school = school;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
