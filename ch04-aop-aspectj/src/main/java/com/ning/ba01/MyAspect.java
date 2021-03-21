package com.ning.ba01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

/**
 * @author XUN~MLF
 */


/**
 * @Aspect :是aspectj框架中的注解
 *      作用：表示当前类是切面类。
 *      切面类：是用来给业务方法增加功能的类，在这个类中有切面的功能代码。
 *      位置：在类定义上面。
 */

@Aspect
public class MyAspect {

    /**
     * 定义方法马，方法是实现切面功能的。
     * 方法定义的要求
     *  1.公共方法  public
     *  2.方法没有返回值
     *  3.方法名称自定义
     *  4.方法可以有参数，也可以没有参数
     *     如果有参数，参数类型不是自定义，有几个参数类型可以使用
     */


    /**
     *  @Before :前置通知
     *    属性:value 切入点表达式，表示切面的功能执行的位置。
     *    位置：方法的上面
     *    特点：
     *         1.在目标方法之前执行。
     *         2.不会改变目标方法执行的结果
     *         3.不会影响目标方法的执行
     *execution(访问修饰符 返回值 包名.类名.方法名称(方法参数))
     */


//    @Before(value = "execution(public void com.ning.ba01.SomeServiceImpl.doSome(String, Integer))")
//    public void myBefore(){
//        System.out.println("0===前置通知，在方法执行之前输出时间:"+new Date());
//    }

//    @Before(value = "execution(void com.ning.ba01.SomeServiceImpl.doSome(String, Integer))")
//    public void myBefore(){
//        System.out.println("1===前置通知，在方法执行之前输出时间:"+new Date());
//    }

//    @Before(value = "execution(void *..SomeServiceImpl.doSome(String, Integer))")
//    public void myBefore(){
//        System.out.println("2===前置通知，在方法执行之前输出时间:"+new Date());
//    }

//    @Before(value = "execution(* *..SomeServiceImpl.doSome(..))")
//    public void myBefore(){
//        System.out.println("3===前置通知，在方法执行之前输出时间:"+new Date());
//    }


    /**
     * 指定通知方法中的参数：JoinPoint
     *   JoinPoint：要加入切面功能的业务方法
     *       作用是：可以在通知方法中获取方法执行时的信息，例如方法名称，方法实参。
     *       这个JoinPoint参数值是由框架赋予的，必需是第一个位置的参数。
     */

    @Before(value = "execution(* do*(..))")
    public void myBefore(JoinPoint joinPoint){

        //获取方法的完整定义
        System.out.println("方法的签名(定义):"+joinPoint.getSignature());
        System.out.println("方法的名称:"+joinPoint.getSignature().getName());
        
        //获取参数的实参
        Object arr[] = joinPoint.getArgs();
        for (Object arg:arr) {
            System.out.println("参数="+arg);
        }

        //就是你切面要执行的功能代码
        System.out.println("4===前置通知，在方法执行之前输出时间:"+new Date());
    }

}
