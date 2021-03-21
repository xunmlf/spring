package com.ning.ba04;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Date;


/**
 * @author XUN~MLF
 */


/**

 */

@Aspect
public class MyAspect {


    /**
     * 最终通知方法的定义格式
     *   1.public
     *   2、没有返回值
     *   3、方法名称自定义
     *   4、方法没有参数，如果有就是JoinPoint
     */


    /**
     * @After :最终通知
     *     value:切入点表达式
     *     位置：在方法的上面
     *      特点：总是会执行
     *            在目标方法之后执行
     */
    @After(value = "execution(* *..SomeServiceImpl.doFinally(..))")
    public void myAfter() {
        System.out.println("执行最终通知：总是会执行");
    }

}
