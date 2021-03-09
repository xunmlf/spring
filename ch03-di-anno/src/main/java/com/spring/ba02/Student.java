package com.spring.ba02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author XUN~MLF
 */

@Component("muStudent")
public class Student {


    /**
     * @Value：简单类型的属性赋值
     *    属性： value  是string类型，表示简单类型的属性赋值
     *    位置：1.放在属性定义的上面，无需set方法，推荐使用
     *         2.在set方法的上面
     */

    @Value( value ="展昭")
    private String name;
    @Value(value="29")
    private Integer age;

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
