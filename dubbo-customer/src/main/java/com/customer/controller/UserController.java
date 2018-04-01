package com.customer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.api.service.UserService;

@RestController
public class UserController {
	
	@Reference(interfaceClass=com.api.service.UserService.class,version="1.0.1",group="test1")
	private UserService userServiceImpl1;
	@Reference(interfaceClass=com.api.service.UserService.class,version="1.0.1",group="test2")
	private UserService userServiceImpl3;
	@Reference(interfaceClass=com.api.service.UserService.class,version="1.0.2")
	private UserService userServiceImpl2;
	
	@RequestMapping("/user1")
	public String sayHello1()
	{
		return userServiceImpl1.sayHello("world");
	}
	@RequestMapping("/user2")
	public String sayHello2()
	{
		return userServiceImpl2.sayHello("world");
	}
	@RequestMapping("/user3")
	public String sayHello3()
	{
		return userServiceImpl3.sayHello("world");
	}
	
}
