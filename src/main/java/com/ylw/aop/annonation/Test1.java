package com.ylw.aop.annonation;

import java.lang.reflect.Method;

public class Test1 {

    public static void main(String[] args) throws ClassNotFoundException {
        Class classInfo = Class.forName("com.ylw.aop.annonation.User");
        // 获取到所有方法
        Method[] methods = classInfo.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
            AddAnnotation declaredAnnotation = method.getDeclaredAnnotation(AddAnnotation.class);
            if (declaredAnnotation == null) {
                // 结束本次循环
                continue;
            }
            // 获取userId
            int userId = declaredAnnotation.userId();
            System.out.println("userId:" + userId);
            // 获取userName
            String userName = declaredAnnotation.userName();
            System.out.println("userName:" + userName);
            // 获取arrays
            String[] description = declaredAnnotation.description();
            for (String str : description) {
                System.out.println("desc:" + str);
            }
        }
    }
}
