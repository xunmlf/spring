package org.example;

import com.service.impl.SomeService;
import com.service.impl.SomeServiseImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.jar.JarOutputStream;

public class oneText {
    @Test
    public void text01(){
        SomeService service = new SomeServiseImpl();
        service.doSome();
    }

    /**
     * spring默认创建对象的时间：在创建spring的容器时，会创建配置文件中的所有的对象
     * spring创建对象，默认调用的是无参构造方法
     */
    @Test
    public void text02(){
        //使用spring容器创建的对象
        //1：指定spring配置文件的名称
        String config = "beans.xml";

        //2：创建表示spring容器的对象，ApplicationContext
        //ApplicationContext就是表示spring容器，通过容器获取对象
        //ClassPathXmlApplicationContext：表示从类路径中加载spring的配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        //从容器中获取某个对象，你要调用对象的方法
        //getBean("配置文件中的id值")
        SomeService service = (SomeService) ac.getBean("SomeService");

        //使用spring创建好的对象
        service.doSome();
    }

    @Test
    public void text03(){
        String config = "beans.xml";
        ApplicationContext ac =  new ClassPathXmlApplicationContext(config);
        int nums = ac.getBeanDefinitionCount();
        System.out.println("容器中定义类的数量："+nums);

        //容器中每个对象的名称
        String arr[] = ac.getBeanDefinitionNames();
        for (String name : arr){
            System.out.println(name);
        }
    }

    //获取一个非自定义的类对象
    @Test
    public void text04(){
        String config = "beans.xml";
        ApplicationContext ac =  new ClassPathXmlApplicationContext(config);
        Date my = (Date) ac.getBean("MyDate");
        System.out.println("Date:"+my);

    }
}
