package com.ning.dao.impl;

import com.ning.dao.UserDao;
import com.ning.domain.User;
import org.springframework.stereotype.Repository;

/**
 * @author XUN~MLF
 */

@Repository("oracleDao")
public class OracleDaoImpl implements UserDao {

    @Override
    public void insertUser(User user) {
        System.out.println("oracle的insertUser");
    }
}
