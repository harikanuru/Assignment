package com.rest.api.Constants;

public class DBQueries {
	
	public static final String GET_USERS = "SELECT * FROM PERSON";
	
	public static final String REGISTER = "INSERT INTO `emp`.`person`(`titile`,`fname`,`sname`,`email`,`gender`,`street`,`city`,`state`,`postcode`,`username`,`password`,`dob`,`registeredAt`,`phone`,`cell`,`image`,`nat`) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,)";
					//"54f258d7-8f0e-40d0-8aac-482f82460290","mr","terrance","bell","terrance.bell@example.com","male","376 ash dr", "peoria" ,"north dakota","82976","biglion154","321654","1960-09-11 10:54:20","2013-03-19T22:33:43Z","(195)-690-7423","(401)-235-1290","https://randomuser.me/api/portraits/men/92.jpg","US")"";

	public static final String DELETE = "DELETE FROM PERSON WHERE ID = ?";

}
