package com.kimseak;

public class Address {
	
	private String address;
	
	public Address(){
		this.address = "Address in address object";
	}
	
	public Address(String address){
		this.address = address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}

}
