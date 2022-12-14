package com.koreait.jpaitem.embed;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	// 주소
	private String city;
	private String street;
	private String zipcode;

	// 테스트를 위한 파라미터있는 생성자
	public Address(String city, String street, String zipcode) {
		super();
		this.city = city;
		this.street = street;
		this.zipcode = zipcode;
	}

	// 기본 생성자는 반드시 하나 있어야한다.
	public Address() {}

	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
}
