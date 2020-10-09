package com.duan.service;


import com.duan.dao.UserDao;
import com.duan.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void GetUser() {
        userDao.GetUser();
    }
}
