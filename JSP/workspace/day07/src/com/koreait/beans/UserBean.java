package com.koreait.beans;

public class UserBean {
	
	// 변수명은 jsp의 name값을 그대로 가져오는 것이 알아보기 좋다
	private String userid;
	private String userpw;
	private String username;
	private String userphone;
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserphone() {
		return userphone;
	}
	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}
	
}
