package com.rest.api.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.rest.api.Constants.DBQueries;
import com.rest.api.bo.User;
import com.rest.api.resource.UserResource;
import com.rest.api.service.IUserInterface;

@Service
public class UserServiceImpl implements IUserInterface{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	 private static final Logger LOGGER = (Logger) LogManager.getLogger(UserServiceImpl.class);

	@Override
	public List<User> getUsers() {
         List<User> users = jdbcTemplate.query(DBQueries.GET_USERS, new BeanPropertyRowMapper(User.class));
		return users;
	}

	@Override
	public User getUser(int id) {
        User user =  (User) jdbcTemplate.queryForObject(DBQueries.GET_USER, new Object[]{ id }, new BeanPropertyRowMapper(User.class));
		return user;
	}
	
	
	@Override
	public String registerUser(User user) {
		
		String status = "";
		try {
	        jdbcTemplate.update(DBQueries.REGISTER, new Object[] { user.getTitile(), user.getFname(), user.getSname(), user.getEmail(),user.getGender(), user.getStreet(), user.getCity(), user.getState(), user.getPostcode(), user.getUsername(), user.getPassword(), user.getDob(), user.getRegisteredAt(), user.getPhone(), user.getCell(), user.getNat()});
	        status = "Registration done Successfully";
		}catch(Exception e) {
			status = "Registration not Successfully";
		}   
	       
		return status;
	}


	@Override
	public String deleteUser(int id) {
		String status = "";
		try {
			jdbcTemplate.update(DBQueries.DELETE, new Object[] { id});
			status = "User deleted Successfully";
    	}catch(Exception e) {
    		status = "User deleted not Successfully";
    	}
		return status;
	}

	@Override
	public String updateUser(User user) {

		
		String status = "";
		try {
	        jdbcTemplate.update(DBQueries.UPDATE, new Object[] { user.getFname(), user.getSname(), user.getEmail(),  user.getPhone(), user.getCell(), user.getStreet(), user.getCity(), user.getState(), user.getPostcode(), user.getId()});
	        status = "Updated Successfully";
		}catch(Exception e) {
			status = "Updated Successfully";
		}   
		
		
		return status;
	}


	

}
