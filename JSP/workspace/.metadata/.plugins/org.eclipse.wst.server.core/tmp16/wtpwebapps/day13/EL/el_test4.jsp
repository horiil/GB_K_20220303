<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- jstl을 사용하기 위한 선언 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		ArrayList<String> arList = new ArrayList<>();
		arList.add("hello");
		arList.add("jsp");
		arList.add("el");
		arList.add("jstl");
		pageContext.setAttribute("list", arList);
	%>
	
	${list }
</body>
</html>