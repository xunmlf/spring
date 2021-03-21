package com.ning.ba05;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


/**
 * @author XUN~MLF
 */


/**

 */

@Aspect
public class MyAspect {



    @After(value = "myPoint()")
    public void myAfter() {
        System.out.println("执行最终通知：总是会执行");
    }


    @Before(value = "myPoint()")
    public void myBefore() {
        System.out.println("执行前置通知：先执行的代码");
    }

    /**
     * @Pointcut :定义和管理切入点，如果你的项目中有多个切入点表达式是重复的，可以重复使用的。
     *             就可以使用@Poinycut注解
     *       属性：value：切入点表达式
     *       位置：在自定义方法的上面
     *    特点：当使用 @Pointcut 定义在一个方法上面时，该方法里面不需要代码。   此时该方法的名称就是切入点表达式的别名
     *          在其他的通知中，value属性就可以使用这个方法名代替切入点表达式了
     *
     *
     */

    @Pointcut(value = "execution(* *..SomeServiceImpl.doFinally*(..))")
    public  void myPoint(){
        //不需要代码
    }
}
