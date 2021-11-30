package com.sangamone.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pincode")
public class Pincode2 {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String city;
	private String division;
	private String office;
	private int pincode;
	private String district;
	private String state;
	public Pincode2(int id, String city, String division, String office, int pincode, String district, String state) {
		super();
		this.id = id;
		this.city = city;
		this.division = division;
		this.office = office;
		this.pincode = pincode;
		this.district = district;
		this.state = state;
	}
	public Pincode2() {
		
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	

}
