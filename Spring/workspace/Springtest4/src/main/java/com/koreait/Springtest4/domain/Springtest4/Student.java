package com.koreait.Springtest4.domain.Springtest4;

public class Student {

	private Long studentId;
	private String studentName;
	private Integer age;
	private Integer subject;
	private Integer phone;
	private String addr;
	
	public Student() {}

	public Student(Long studentId, String studentName, Integer age, Integer subject, Integer phone, String addr) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.age = age;
		this.subject = subject;
		this.phone = phone;
		this.addr = addr;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getSubject() {
		return subject;
	}

	public void setSubject(Integer subject) {
		this.subject = subject;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
} 
