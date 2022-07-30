<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
EL JSP에서 웹 영역에서 
<%
	String data = "hello";

	// pageContext : 현재 페이지
	pageContext.setAttribute("data", data);
%>
	<!-- \를 붙이게 되면 문자열 그대로 출력 -->
	\${date } : ${data }
<%-- 	${10 + 20 }	<br> --%>
<%-- 	${10 > 3 } <br> --%>
</body>
</html>