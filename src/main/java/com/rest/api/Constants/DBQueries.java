package com.rest.api.Constants;

public class DBQueries {
	
	public static final String GET_USERS = "SELECT * FROM PERSON";
	
	public static final String GET_USER = "SELECT * FROM PERSON WHERE ID = ?";

	public static final String REGISTER = "INSERT INTO emp.person(`titile`,`fname`,`sname`,`email`,`gender`,`street`,`city`,`state`,`postcode`,`username`,`password`,`dob`,`registeredAt`,`phone`,`cell`,`nat`) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

	public static final String DELETE = "DELETE FROM PERSON WHERE ID = ?";
	
	public static final String UPDATE = "UPDATE PERSON SET fname = ? , sname = ? , email = ? , phone = ? , cell = ? , street = ? , city = ? , state = ?, postcode = ? WHERE ID = ?";

}
