package com.niit.frontend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class UserController {

	@RequestMapping("/")
	public String homePage()
	{
		return "home";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String loginPage()
	{
		return "login";
	}
	
	@RequestMapping("/admin")
	public String adminPage()
	{
		return "admin";
	}
	
	@RequestMapping(value="/authfailure",method=RequestMethod.GET)
	public String accessDeniedPage()
	{
		return "accessDenied";
	}
	
}
