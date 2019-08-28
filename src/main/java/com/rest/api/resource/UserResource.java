package com.rest.api.resource;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rest.api.bo.User;
import com.rest.api.service.IUserInterface;
@Controller

public class UserResource {

	 private static final Logger LOGGER = (Logger) LogManager.getLogger(EmployeeResource.class);
	 
	 @Autowired
	 IUserInterface userService;
	 
	 
	@RequestMapping(value="/getEmps", method = RequestMethod.GET)
	public @ResponseBody List<User> getWelcome() {
		
		return userService.getUsers();
	}

	@RequestMapping(value="/register", method = RequestMethod.POST)
	public @ResponseBody User registerUser(@RequestBody User user) {
		
		user.registerUser(user);
		
		return null;
	}
	
	@RequestMapping(value="/delete", method = RequestMethod.POST)
	public @ResponseBody User registerUser(@RequestBody User user) {
		
		user.deleteUser(user.getId());
		return null;
	}

}
