package com.practice.scms.service;

import com.practice.scms.model.LoginRqst;
import com.practice.scms.model.User;

public interface UserRegistrationServive {
	
	public void registerUser(User user);
	
	public String checkLogin(User user1);

	
}
