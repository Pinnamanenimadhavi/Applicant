package com.madhavi.springboot.applicantmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Applicant {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private Long id;
	private String firstName;
	private String lastName;
	private String middleName;
	private String phoneNumber;
	private String eMail;
	private String address;
	private String add1;
	private String city;
	private String state;
	private String country;
	public Applicant() {
		super();
	}
	public Applicant(Long id, String firstName, String lastName, String middleName, String phoneNumber, String eMail,
			String address, String add1, String city, String state, String country) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.phoneNumber = phoneNumber;
		this.eMail = eMail;
		this.address = address;
		this.add1 = add1;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAdd1() {
		return add1;
	}
	public void setAdd1(String add1) {
		this.add1 = add1;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Applicant [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", middleName="
				+ middleName + ", phoneNumber=" + phoneNumber + ", eMail=" + eMail + ", address=" + address + ", add1="
				+ add1 + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
	
	
	
	
	

}
