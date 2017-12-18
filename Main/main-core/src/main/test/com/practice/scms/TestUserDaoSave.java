package com.practice.scms;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.practice.scms.configuration.SpringRootConfig;
import com.practice.scms.dao.UserDAO;
import com.practice.scms.model.User;

public class TestUserDaoSave {

	public static void main(String[] args) {
		
		System.out.println("Start");
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
		
		System.out.println(ctx);
		
		UserDAO userDAO = ctx.getBean(UserDAO.class);
		
		User user = new User();
		
		user.setName("Shiv");
		user.setContact("999");
		user.setEmail("Shiv@gmail.com");
		user.setAddress("Pune");
		user.setLoginname("shiv");
		user.setPassword("baba");
		
		userDAO.save(user);
		System.out.println("User Saved");
		
		ctx.close();
		
	}

}
