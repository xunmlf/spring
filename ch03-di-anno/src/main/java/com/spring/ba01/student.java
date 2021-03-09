package com.spring.ba01;

import org.springframework.stereotype.Component;

/**
 * @author XUN~MLF
 */


/**
 * @Component： 创建对象的，等同于<bean>的功能
 *
 *   属性：value 就是对象的名称，也就是bean的id值
 *         value的值是唯一的，创建的对象在整个spring容器中就一个
 *   位置：在类的上面
 *
 *
 *
 *  一： spring中和@Component功能一致，创建对象的注解还有：
 *       1.@Repository(用在持久层类的上面)：放在Dao的实现类上面，
 *                    表示创建dao对象，dao对象是能访问数据库的。
 *       2.@Service(用在业务层类的上面)：放在service实现类的上面，
 *                   创建service对象，service对象是做业务处理，可以有事务等功能。
 *       3.@Controller(用在控制器类的上面)：放在控制器(处理器)类的上面，创建控制器对象的
 *                   控制器对象，能够接受用户提交的参数，显示请求的处理结果。
 *    以上三种注解和@Component 一样的，都能创建对象，但这三个注解还有额外的功能
 *     @Repository，@Service，@Controller是给项目的对象分层的
 */
//@Component(value = "myStudent")

//最常用，省略value
@Component("mStudent")

//不指定对象名称，由spring提供默认名称：类名的首字母小写
//@Component
public class student {
    private Integer age;
    private String name;

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
