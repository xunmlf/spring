package com.ning.service.impl;

import com.ning.dao.UserDao;
import com.ning.domain.User;
import com.ning.service.UserService;

/**
 * @author XUN~MLF
 */
public class UserServiceImpl implements UserService {
    private UserDao dao = null;

    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public void addUser(User user) {
        dao.insertUser(user);
    }
}
