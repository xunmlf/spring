package com.ning.service.impl;

import com.ning.dao.UserDao;
import com.ning.domain.User;
import com.ning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author XUN~MLF
 */

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("mysqlDao")
    private UserDao dao = null;



    @Override
    public void addUser(User user) {
        dao.insertUser(user);
    }
}
