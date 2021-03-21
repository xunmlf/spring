package com.ning.ba01;


/**
 * 目标对象
 */
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name, Integer age) {
        //给doSome增加一个功能，在方法执行之前，输出方法执行时间。
        System.out.println("=====目标方法执行=====");
    }
}
