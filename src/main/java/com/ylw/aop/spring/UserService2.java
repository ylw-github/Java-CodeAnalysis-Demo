package com.ylw.aop.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService2 {

    @Autowired
    private UserDao userDao;

    @Transactional
    public void add() {

        userDao.add("张三", 27);
        int i = 1 / 0;                     //模拟抛出异常
        System.out.println("我是add方法");
        userDao.add("李四", 16);

    }

}