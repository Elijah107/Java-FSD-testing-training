package com.ust.spring.mvcspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello");
	//	return modelAndView;
		modelAndView.addObject("id", 123);
		modelAndView.addObject("name", "Elijah");
		modelAndView.addObject("salary", 50000);
		return modelAndView;
	}

}
