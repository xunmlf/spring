package com.spring.ba05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
     *
     *     属性：required，是一个Boolean类型的，默认true
     *             required=true：表示引用类型赋值失败，程序报错，并终止执行
     *             required=false：引用类型如果赋值失败，程序正常执行，引用类型是Null
     *
     *     位置：1.在属性定义上面，无需set方法
     *           2.在set方法上面
     *
     *     如果要使用byName方式，需要做的是：
     *        1.在属性定义上面加@Autowired
     *        2.在属性定义上面加@Qualifier(value="bean的id")：表示使用指定名称的bean完成赋值。
     *
     * */
    @Autowired
    @Qualifier("mySchool")
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
