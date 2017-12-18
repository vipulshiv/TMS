package com.practice.scms.dao;

import java.util.List;

import com.practice.scms.model.LoginRqst;
import com.practice.scms.model.User;

/**
 * This UserDAO Interface have methods which will be implemented by UserDAOImpl
 * @author Vipul-win
 *
 */
public interface UserDAO {

	/**
	 * 
	 * @param user
	 */
	public void save(User user);
	
	public User checkUser(User user1);
}
