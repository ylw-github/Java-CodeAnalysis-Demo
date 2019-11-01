package com.ylw.aop.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private TransactionUtils transactionUtils;

    public void add() {
        TransactionStatus transactionStatus = null;
        try {
            transactionStatus = transactionUtils.begin();

            userDao.add("张三", 27);
            int i = 1 / 0;                     //模拟抛出异常
            System.out.println("我是add方法");
            userDao.add("李四", 16);

            transactionUtils.commit(transactionStatus);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (transactionStatus != null) {
                transactionStatus.rollbackToSavepoint(transactionStatus);
            }
        }

    }

}