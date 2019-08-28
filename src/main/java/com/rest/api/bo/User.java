package com.rest.api.bo;

public class User {
	
	
	public User(int id ,String uuid, String titile, String fname, String sname, String email, String gender, String street,
			String city, String state, String postcode, String username, String password, String dob,
			String registeredAt, String phone, String cell, String image, String nat) {
		super();
		this.uuid = id;
		this.uuid = uuid;
		this.titile = titile;
		this.fname = fname;
		this.sname = sname;
		this.email = email;
		this.gender = gender;
		this.street = street;
		this.city = city;
		this.state = state;
		this.postcode = postcode;
		this.username = username;
		this.password = password;
		this.dob = dob;
		this.registeredAt = registeredAt;
		this.phone = phone;
		this.cell = cell;
		this.image = image;
		this.nat = nat;
	}
	
	
	public User() {
		super();
	}
	
	

    public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}



	private int id;
	private String uuid;
	private String titile;
	private String fname;
	private String sname;
	private String email;
	private String gender;
	private String street;
	private String city;
	private String state;
	private String postcode;
	private String username;
	private String password;
	private String dob;
	private String registeredAt;
	private String phone;
	private String cell;
	private String image;
	private String nat;
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getTitile() {
		return titile;
	}
	public void setTitile(String titile) {
		this.titile = titile;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getRegisteredAt() {
		return registeredAt;
	}
	public void setRegisteredAt(String registeredAt) {
		this.registeredAt = registeredAt;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCell() {
		return cell;
	}
	public void setCell(String cell) {
		this.cell = cell;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getNat() {
		return nat;
	}
	public void setNat(String nat) {
		this.nat = nat;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", uuid=" + uuid + ", titile=" + titile + ", fname=" + fname + ", sname=" + sname
				+ ", email=" + email + ", gender=" + gender + ", street=" + street + ", city=" + city + ", state="
				+ state + ", postcode=" + postcode + ", username=" + username + ", password=" + password + ", dob="
				+ dob + ", registeredAt=" + registeredAt + ", phone=" + phone + ", cell=" + cell + ", image=" + image
				+ ", nat=" + nat + "]";
	}

	
	

}
