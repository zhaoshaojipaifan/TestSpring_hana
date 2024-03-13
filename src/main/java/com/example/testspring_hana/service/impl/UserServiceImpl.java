package com.example.testspring_hana.service.impl;
import com.example.testspring_hana.dao.UserDao;
import com.example.testspring_hana.service.UserService;

public class UserServiceImpl implements UserService {
    UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }
    @Override
    public boolean login(String name, String password) {
        return userDao.login(name,password);
    }
}