package com.ning.dao.impl;

import com.ning.dao.UserDao;
import com.ning.domain.User;
import org.springframework.stereotype.Repository;

/**
 * @author XUN~MLF
 */
@Repository("mysqlDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void insertUser(User user) {
        System.out.println("user插入到MySQL数据库");
    }
}
