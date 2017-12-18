package com.practice.scms.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.scms.dao.UserDAO;
import com.practice.scms.daoimpl.UserDAOImpl;
import com.practice.scms.model.LoginRqst;
import com.practice.scms.model.User;
import com.practice.scms.service.UserRegistrationServive;

/**
 * UserRegistrationServiveImpl implements UserRegistrationServive and contains methods which are 
 * accessed by the UserController
 * 
 * @author Vipul-win
 *
 */

@Service
public class UserRegistrationServiveImpl implements UserRegistrationServive{


	@Autowired
	UserDAO userDao;
	
	/**
	 *  registerUser() method set data and send it to the userDao to save the details
	 *  
	 * 
	 */
	
	public void registerUser(User user) {
		
		User user1 =  new User();
		user1.setName(user.getName());
		user1.setContact(user.getContact());
		user1.setEmail(user.getEmail());
		user1.setAddress(user.getAddress());
		user1.setLoginname(user.getLoginname());
		user1.setPassword(user.getPassword());
		
		userDao.save(user);
		
	}
	
	/**
	 *  checkLogin() method check logic if checkUser() methods return user 
	 *  or not, if it receives the User it than returns "loginsuccess" else loginfail 
	 * 
	 */
	
	public String checkLogin(User user1) {
		User user = userDao.checkUser(user1);
		if(user == null){
			return "loginfail";
		}else{
			return "loginsuccess";
			
	}
		
  }
	
}
