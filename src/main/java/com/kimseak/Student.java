package com.kimseak;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class Student {
	
	private String studentName;
	
	@Autowired
	@Qualifier(value="address_bean")
	private Address address;
	
	
	public Student(){
		
	}
	
	public Student(Address addresss){
		this.address = addresss;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void showInfo(){
		System.out.println("student adddress is: " + address.getAddress());
	}
	

}
