package com.powernode.ba03;

/**
 * @author XUN~MLF
 */
public class Student {
    private String name;
    private int age;

    /**声明一个引用类型*/
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
