<%@page import="com.koreait.dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="member" class="com.koreait.beans.MemberBean"/>
	<jsp:setProperty property="*" name="member"/>
	
	<%
		MemberDAO mdao = new MemberDAO();
		if(mdao.join(member)){
			
		}
	%>
</body>
</html>