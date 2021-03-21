package com.ning.ba03;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Date;

/**
 * @author XUN~MLF
 */


/**
 * @author XUN~MLF
 * @Aspect :是aspectj框架中的注解
 * 作用：表示当前类是切面类。
 * 切面类：是用来给业务方法增加功能的类，在这个类中有切面的功能代码。
 * 位置：在类定义上面。
 */

@Aspect
public class MyAspect {

    /**
     * 环绕通知方法的定义格式
     *   1.public
     *   2、必须有一个返回值
     *   3、方法名称自定义
     *   4、方法有参数，固定参数 ProceedingJoinPoint
     */

    /**
     * @Around : 环绕通知
     * 属性：value：切入点表达式
     * 特点：
     * 1、他是功能最强的通知
     * 2.在目标方法前后都能增强功能
     * 3、控制目标方法是否被调用执行，
     * 4、修改原来的目标方法的执行结果。影响最后的调节结果
     * 环绕通知，等同于jdk动态代理，InvocationHandler接口
     * 参数：ProceedingJoinPoint 就等同于Method
     * 作用：执行目标方法的
     * 返回值：就是目标方法的执行结构，可以修改
     */
    @Around(value = "execution(* *..SomeServiceImpl.doFirst(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {

        //获取参数值：
        String name = "";
        Object[] arr = pjp.getArgs();
        if (arr != null && arr.length > 1) {
            Object arg = arr[0];
            name = (String) arg;
        }
        //实现环绕通知
        Object result = null;
        System.out.println("在目标方法之前提示时间====" + new Date());
        //1.目标方法的调用
        //method.invoke()
        if ("张三".equals(name)) {
            //符合条件
            result = pjp.proceed();
        }
        System.out.println("在目标方法之后提交事务=======");

        //修改目标方法的执行结果，影响方法最后的调用结果
        if (result != null) {
            result = "hello";
        }
        return result;
    }
}
