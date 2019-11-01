package com.ylw.aop.spring;

import com.ylw.aop.spring.div.ExtTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService3 {

    @Autowired
    private UserDao userDao;

    @ExtTransaction
    public void add() {
        userDao.add("张三", 27);
        int i = 1 / 0;                     //模拟抛出异常
        System.out.println("我是add方法");
        userDao.add("李四", 16);

    }

}