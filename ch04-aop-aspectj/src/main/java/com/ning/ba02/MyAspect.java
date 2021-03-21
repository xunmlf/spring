package com.ning.ba02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

/**
 * @author XUN~MLF
 */


/**
 * @author XUN~MLF
 * @Aspect :是aspectj框架中的注解
 *      作用：表示当前类是切面类。
 *      切面类：是用来给业务方法增加功能的类，在这个类中有切面的功能代码。
 *      位置：在类定义上面。
 */

@Aspect
public class MyAspect {

    /**
     * 后置通知定义方法，方法是实现切面功能的。
     * 方法定义的要求
     *  1.公共方法  public
     *  2.方法没有返回值
     *  3.方法名称自定义
     *  4.方法有参数 ，推荐使用Object，参数名自定义
     *
     */

    /**
     * @AfterReturning :后置通知
     *      属性：1.value：切入点表达式
     *            2.returning：自定义的变量，表示目标方法的返回值。
     *            自定义变量名必须和通知方法的形参名一样。
     *       特点：
     *           1.在目标方法之后执行
     *           2.能够获取目标方法的返回值，可以根据这个返回值做不同的功能处理
     *           3.可以修改这个返回值
     *
     *
     *   环绕通知：经常做事务，在目标方法之前开启事务，执行目标方法，在方法执行之后提交事务。
     */
    @AfterReturning(value = "execution(* *..SomeServiceImpl.doOther(..))",
                    returning = "res")
    public void myAfterReturning(JoinPoint jp,Object res){
        //Object res:是目标方法执行后的返回值，根据返回值做你的切面的功能处理
        System.out.println("后置通知====方法的定义"+jp.getSignature());
        System.out.println("后置通知:在目标方法之后执行的，获取的返回值是:" + res);
        if (res.equals("abcd")) {
             //做一些功能
        }else{
            //另一些功能
        }

        //修改目标方法的返回值

    }

}
