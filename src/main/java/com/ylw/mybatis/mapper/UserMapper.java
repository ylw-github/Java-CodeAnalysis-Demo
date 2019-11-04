package com.ylw.mybatis.mapper;


import com.ylw.mybatis.entity.User;
import com.ylw.mybatis.orm.annotation.ExtInsert;
import com.ylw.mybatis.orm.annotation.ExtParam;
import com.ylw.mybatis.orm.annotation.ExtSelect;

public interface UserMapper {

	@ExtInsert("insert into t_users(Name,age) values(#{Name},#{age})")
	public int insertUser(@ExtParam("Name") String userName, @ExtParam("age") String userAge);

	@ExtSelect("select * from t_users where Name=#{Name} and age=#{age} ")
	User selectUser(@ExtParam("Name") String Name, @ExtParam("age") String age);

}
