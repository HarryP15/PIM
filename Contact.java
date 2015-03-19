package io.github.potti15;

import java.util.HashMap;

public class Contact {
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String emailAddress;
	private String uniCourse;
	private HashMap<String, String> homeAddress;
	
	public Contact(String firstName, String lastName, String phoneNumber, String emailAddress, String uniCourse) {
		
		homeAddress = new HashMap<String, String>(5);
		
	}
	
	public void setFirstName(String firstName) {
		
		this.firstName = firstName;
		
	}
	
	public String getFirstName() {
		
		return firstName;
		
	}
	
	public void setLastName(String lastName) {
		
		this.lastName = lastName;
		
	}
	
	public String getLastName() {
		
		return lastName;
		
	}
	
	public void setPhoneNumber(String phoneNumber) {
		
		this.phoneNumber = phoneNumber;
		
	}
	
	public String getPhoneNumber() {
		
		return phoneNumber;
		
	}
	
	public void setEmailAddress(String emailAddress) {
		
		this.emailAddress = emailAddress;
		
	}
	
	public String getEmailAddress() {
		
		return emailAddress;
		
	}
	
	public void setUniCourse(String uniCourse) {
		
		this.uniCourse = uniCourse;
		
	}
	
	public String getUniCourse() {
		
		return uniCourse;
		
	}
	
	public void setHomeAddress(String firstLine, String secondLine, String town, String county, String postcode) {
		
		homeAddress.put("firstLine", firstLine);
		homeAddress.put("secondLine", secondLine);
		homeAddress.put("town", town);
		homeAddress.put("county", county);
		homeAddress.put("postcode", postcode);
		
	}
	
	public HashMap<String, String> getHomeAddress() {
		
		return homeAddress;
		
	}

}
