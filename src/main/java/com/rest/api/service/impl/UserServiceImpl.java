package com.rest.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.rest.api.Constants.DBQueries;
import com.rest.api.bo.User;
import com.rest.api.service.IUserInterface;

@Service
public class UserServiceImpl implements IUserInterface{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	@Override
	public List<User> getUsers() {
         System.out.println("JDbc Template "+ jdbcTemplate);
         List<User> users = jdbcTemplate.query(DBQueries.GET_USERS, new BeanPropertyRowMapper(User.class));
		return users;
	}


	@Override
	public User registerUser(User user) {
	        jdbcTemplate.update(DBQueries.REGISTER, new Object[] { user.getTitile(), user.getFname(), user.getSname(), user.getEmail(),user.getGender(), user.getStreet(), user.getCity(), user.getState(), user.getPostcode(), user.getUsername(), user.getPassword(), user.getDob(), user.getRegisteredAt(), user.getPhone(), user.getCell(),user.getImage(), user.getNat()});
	    		   
	    		   System.out.println("");
	       
		return null;
	}


	@Override
	public User deleteUser(int id) {
        jdbcTemplate.update(DBQueries.DELETE, new Object[] { id});
		return null;
	}

}
