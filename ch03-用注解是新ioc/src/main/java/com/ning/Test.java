package com.ning;

import com.ning.domain.User;
import com.ning.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author XUN~MLF
 */
public class Test {
    public static void main(String[] args) {

        ApplicationContext act= new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service = (UserService) act.getBean("userService");
        User user = new User();
        user.setAge(19);
        user.setName("lisi");
        service.addUser(user);

    }
}
