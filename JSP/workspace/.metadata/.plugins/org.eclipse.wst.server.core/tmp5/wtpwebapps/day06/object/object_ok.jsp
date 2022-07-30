<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 	object의 값을 파라미터로 받은 다음 forward방식으로 object_result로 넘겨준다.
	String username = request.getParameter("username");
	String userbirth = request.getParameter("userbirth");
	
	// DB처리
	
	
	// forward : request 객체가 유지된다.
	//pageContext.forward("object_result.jsp");
	
	// redirect 방식	: request 객체 재생성
	response.sendRedirect("object_result.jsp");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>