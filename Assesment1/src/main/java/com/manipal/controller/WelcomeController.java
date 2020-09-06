package com.manipal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.manipal.dao.UserDao;
import com.manipal.model.User;


@Controller
public class WelcomeController {
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public ModelAndView greet() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("greeting");
		return modelAndView;
	}
	
	
	@RequestMapping(value="/greet", method=RequestMethod.GET)
	public String greet1(Model model) {
		model.addAttribute("message", "Good Morning");
		return "greet-message";
	}
}
