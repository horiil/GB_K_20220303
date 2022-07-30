package com.koreait.Springtest3.basic;

import lombok.Getter;
import lombok.Setter;

public class Member {

	private Long number;
	private Integer Gnum;
	private String name;
	private Integer phone;
	private String gender;
	private String Sgender;
	
	public Member() {}

	public Member(Integer gnum, String name, Integer phone) {
		super();
		this.Gnum = gnum;
		this.name = name;
		this.phone = phone;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public Integer getGnum() {
		return Gnum;
	}

	public void setGnum(Integer gnum) {
		Gnum = gnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSgender() {
		return Sgender;
	}

	public void setSgender(String sgender) {
		Sgender = sgender;
	}
	
	
}
