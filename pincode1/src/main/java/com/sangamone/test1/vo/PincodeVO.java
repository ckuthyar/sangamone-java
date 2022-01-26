package com.sangamone.test1.vo;

public class PincodeVO {
	private int pincode;
	private String location;
	
	public PincodeVO(int pincode, String location) {
		super();
		this.pincode = pincode;
		this.location = location;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
