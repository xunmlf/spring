package com.ning;

import com.ning.ba02.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Text02 {
    @Test
    public void text01(){
        String config = "applicationContext.xml";
        ApplicationContext act = new ClassPathXmlApplicationContext(config);
        //从容器中获取目标对象
        SomeService someService = (SomeService) act.getBean("myService");



        //通过代理对象执行的方法，  实现目标方法执行时，增强了功能。
        String str = someService.doOther("张三",28);
        System.out.println("str====="+str);
    }
}
