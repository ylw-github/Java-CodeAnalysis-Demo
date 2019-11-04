package com.ylw.mybatis.sql;

import com.ylw.mybatis.orm.mybatis.aop.MyInvocationHandlerMbatis;

import java.lang.reflect.Proxy;

public class SqlSession {

	// 加载Mapper接口
	public static <T> T getMapper(Class classz) {
		return (T) Proxy.newProxyInstance(classz.getClassLoader(), new Class[] { classz },
				new MyInvocationHandlerMbatis(classz));
	}

}
