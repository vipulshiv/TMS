package com.practice.scms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practice.scms.model.User;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String helloWorld() {
		User user =  new User();
		return "hello";
	}
	
}
