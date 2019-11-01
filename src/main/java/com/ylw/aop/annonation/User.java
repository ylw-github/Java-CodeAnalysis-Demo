package com.ylw.aop.annonation;

public class User {

    @AddAnnotation(userName = "张三", userId = 1, description = {"高大", "英俊", "肥胖"})
    public void add() {
    }

}
