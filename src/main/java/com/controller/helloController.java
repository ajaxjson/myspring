package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class helloController
{

	@RequestMapping("/sayhello")
	public ModelAndView hello()
	{
		String helloWorldMessage = "Hello world, Boonya";
		return new ModelAndView("helloPage", "message", helloWorldMessage);
	}
	
	
}
