package com.lcwd.springmvc.services;

import com.lcwd.springmvc.dao.UserDao;
import com.lcwd.springmvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {
    @Autowired
    private UserDao userDao;

    public int createUser(User user){
        System.out.println("create user called");
        return userDao.saveUser(user);
    }
}
