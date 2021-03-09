package com.powernode.ba02;

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

    public void setSchool(School school) {
        System.out.println("setSchool="+school);
        this.school = school;
    }

    public void setEmail(String email){
        System.out.println("setEmail="+email);
    }

    public void setName(String name) {

        System.out.println("setName="+name);
        this.name = name;
    }

    public void setAge(int age) {
        System.out.println("setAge="+age);
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
