package com.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.api.service.UserService;

@Service(interfaceClass=com.api.service.UserService.class ,version="1.0.2")
public class UserServiceImpl implements UserService {

	public String sayHello(String userName) {
		return "Provider2 say:Hello,  " + userName ;
	}


}
