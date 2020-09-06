package com.manipal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.manipal.dao.UserDao;
import com.manipal.model.User;

@Controller
public class UserController {
	@Autowired
	UserDao userDao;
	
	@RequestMapping(value="userform")
	public String getForm() {
		return "userform";
	}
	
		
	@RequestMapping(value="/addUser", method=RequestMethod.POST)	
	public String addUserDetails(@ModelAttribute User user) {
		userDao.addUser(user);		
		return "useradded";
	}
	
	@RequestMapping(value="showUsers")
	public ModelAndView getUsers(){
		List<User> userList = userDao.getAllUsers();
		return new ModelAndView("userdetails", "userList", userList);
	}
	
	
	@RequestMapping(value="/name", method=RequestMethod.GET)	
	public ModelAndView greetWithName(@ModelAttribute User user) {
		ModelAndView modelAndView = new ModelAndView("greeting-user"); // view name		
		modelAndView.addObject("user", user); //model object name-value		
		
		return modelAndView;
	}
	
	
	
	/*@RequestMapping(value="/name", method=RequestMethod.GET)	
	public ModelAndView greetWithName(@RequestParam String userName, @RequestParam String userLocation) {
		ModelAndView modelAndView = new ModelAndView("greeting-user"); // view name
		User user = new User();
		user.setUserName(userName);
		user.setUserLocation(userLocation);		
		
		UserDao userDao = new UserDao();
		userDao.verifyUser(userName);
		
		modelAndView.addObject("user", user); //model object name-value
		
									
		return modelAndView;
	}*/
	
	/*@RequestMapping(value="/name", method=RequestMethod.GET)	
	public ModelAndView greetWithName(@RequestParam("userName") String name, @RequestParam("userLocation") String location) {
		ModelAndView modelAndView = new ModelAndView("greeting-name"); // view name
		modelAndView.addObject("uname", name); //model object name-value
		modelAndView.addObject("location", location); //model object name-value
									//new ModelAndView(viewname, modelName, modelObject)
		return modelAndView;
	}*/
	
	@RequestMapping(value="/name/{username}", method=RequestMethod.GET)	
	public ModelAndView greetWithName1(@PathVariable("username") String name) {
		ModelAndView modelAndView = new ModelAndView("greeting-name","uname", name);
		return modelAndView;
	}

}
