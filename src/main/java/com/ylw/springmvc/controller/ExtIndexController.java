package com.ylw.springmvc.controller;


import com.ylw.springmvc.core.ExtController;
import com.ylw.springmvc.core.ExtRequestMapping;

@ExtController
@ExtRequestMapping("/ext")
public class ExtIndexController {

	//ext/test/?name=122&age=6440654
	@ExtRequestMapping("/test")
	public String test(String name,Integer age) {
		System.out.println("手写springmvc框架...");
		return "index";
	}

}
