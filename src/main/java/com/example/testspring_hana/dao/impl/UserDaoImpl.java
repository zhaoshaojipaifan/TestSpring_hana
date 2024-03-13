package com.example.testspring_hana.dao.impl;
import com.example.testspring_hana.dao.UserDao;
public class UserDaoImpl implements UserDao{
    @Override
        public boolean login(String name, String password) {
            if (name.equals("丁真")&&password.equals("ruike5")){
                return true;
            }
            return false;
    }
}
