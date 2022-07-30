<%@page import="com.koreait.beans.UserBean"%>
<%@page import="com.koreait.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String userid = request.getParameter("userid");
	String userpw = request.getParameter("userpw");
	String username = request.getParameter("username");
	String userphone = request.getParameter("userphone");
	
	UserDao udao = new UserDao();
	UserBean bean = new UserBean();
	bean.setUserid(userid);
	bean.setUserpw(userpw);
	bean.setUsername(username);
	bean.setUserphone(userphone);
	
	udao.join(bean);
	
	boolean check = udao.join(bean);
	if(check){	//true
		// 가입성공로직
	} else {
		// 가입실패 로직
	}
	
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>