package com.springproject.service;

import com.springproject.model.User;

public interface UserService {

	void SignUp(User user);
	
	User login(String un, String psw);
}
