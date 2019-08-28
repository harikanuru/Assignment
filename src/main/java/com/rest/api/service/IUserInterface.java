package com.rest.api.service;

import java.util.List;


import com.rest.api.bo.User;

public interface IUserInterface {

	
	List<User> getUsers();
	
	String registerUser(User user);
	
	String deleteUser(int id);

	

}
