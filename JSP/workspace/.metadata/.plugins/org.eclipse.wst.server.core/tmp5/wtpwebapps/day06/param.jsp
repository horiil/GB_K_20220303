<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>param 액션태그</h3>
	<jsp:forward page="param_result.jsp">
		<jsp:param name="userid" value="ksh" />
		<jsp:param name="userpw" value="1q2w3e4r" />
	</jsp:forward>
	
<!-- 	어떠한 정보를 가지고 있어야 된다면 forward 그렇지 않다면 redirect -->
</body>
</html>