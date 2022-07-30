<%@page import="vo.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		User[] atUser = (User[])request.getAttribute("users");
		for(int i = 0; i < atUser.length; i++){
			out.println(atUser[i].userid);
			out.println(atUser[i].username);
			out.println(atUser[i].age + "<br>");
		}
	%>
</body>
</html>