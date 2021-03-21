package com.ning.ba03;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name, Integer age) {
        //给doSome增加一个功能，在方法执行之前，输出方法执行时间。
        System.out.println("=====执行doSome目标方法执行=====");
    }

    @Override
    public String doOther(String name, Integer age) {

        //给doOther增加一个功能，在方法执行之前，输出方法执行时间。
        System.out.println("=====doOther目标方法执行=====");
        return "abcd";
    }

    @Override
    public String doFirst(String name, Integer age) {
        System.out.println("======业务方法doFirst()=======");

        return "doFirst";
    }
}
