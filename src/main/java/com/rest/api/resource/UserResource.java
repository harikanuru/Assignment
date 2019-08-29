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

	 private static final Logger LOGGER = (Logger) LogManager.getLogger(UserResource.class);
	 
	 @Autowired
	 IUserInterface userService;
	 
	 
	@RequestMapping(value="/getUsers", method = RequestMethod.GET)
	public @ResponseBody List<User> getUsers() {
		LOGGER.debug("START :: UserResource :: getUsers");
		return userService.getUsers();
	}
	
	@RequestMapping(value="/getUser", method = RequestMethod.POST)
	public @ResponseBody User getUsers(@RequestBody User user) {
		LOGGER.debug("START :: UserResource :: getUsers");
		return userService.getUser(user.getId());
	}

	@RequestMapping(value="/register", method = RequestMethod.POST)
	public @ResponseBody String registerUser(@RequestBody User user) {
		LOGGER.debug("START :: UserResource :: registerUser");		
		return userService.registerUser(user);
	}
	
	@RequestMapping(value="/update", method = RequestMethod.POST)
	public @ResponseBody String updateUser(@RequestBody User user) {
		LOGGER.debug("START :: UserResource :: updateUser");		
		return userService.updateUser(user);
	}
	
	@RequestMapping(value="/delete", method = RequestMethod.POST)
	public @ResponseBody String deleteUser(@RequestBody User user) {
		LOGGER.debug("START :: UserResource :: deleteUser");	
		
		return userService.deleteUser(user.getId());
	}

}
