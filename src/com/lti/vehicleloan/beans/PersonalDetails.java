package com.lti.vehicleloan.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="VEHICLEPERSONALDETAILS")
public class PersonalDetails {
	@Column(name="USER_NAME")
	private String userName;
	@Id
	@Column(name="AGE")
	private int age;
	@Column(name="GENDER")
	private String gender;
	@Column(name="ADDRESS")
	private String address;
	@Column(name="STATE")
	private String state;
	@Column(name="CITY")
	private String city;
	@Column(name="PINCODE")
	private long pincode;
	
	
	public PersonalDetails() {
		super();
	}
	
	
	public PersonalDetails(String userName, int age, String gender, String address, String state, String city,
			long pincode) {
		super();
		this.userName = userName;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}


	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "PersonalDetails [userName=" + userName + ", age=" + age + ", gender=" + gender + ", address=" + address
				+ ", state=" + state + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	
	
}
