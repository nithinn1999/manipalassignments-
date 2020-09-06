package com.manipal.model;

public class User {
	private int id;
	private String atheletename;
	private String gender;
	private String category;
	private String useremail;
	private String usermobile;
	
	public String getAtheletename() {
		return atheletename;
	}
	public void setAtheletename(String atheletename) {
		this.atheletename = atheletename;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getUsermobile() {
		return usermobile;
	}
	public void setUsermobile(String usermobile) {
		this.usermobile = usermobile;
	}
}

//CREATE TABLE USER (USERNAME VARCHAR(25) NOT NULL, LOCATION VARCHAR(25) );

