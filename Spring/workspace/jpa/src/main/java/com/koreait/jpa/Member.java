package com.koreait.jpa;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


// @Entity : JPA가 관리할 객체

//@Entity
@Table(name = "MBR")
public class Member {
	
	// @Id : 데이터베이스 PK와 매핑		얘가 key값이야 라고 알려주는 언오테이션이다.
	@Id
	private Long id;
	
	@Column(unique = true, length = 10)
	private String name;
	
	@Column(name = "myage")
	private int age;

	// 날짜 타입 매핑
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;

	// 매핑 무시
	private int temp;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}
	
	
	
}