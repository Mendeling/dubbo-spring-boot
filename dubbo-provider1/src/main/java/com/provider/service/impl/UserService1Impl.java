package com.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.api.service.UserService;

@Service(interfaceClass=com.api.service.UserService.class,version="1.0.1",group="test2")
public class UserService1Impl implements UserService {

	public String sayHello(String userName) {
		return "Provider1 test2 say:Hello,  " + userName ;
	}


}
