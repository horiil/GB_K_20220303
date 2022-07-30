<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	request.setCharacterEncoding("UTF-8");

	// 파라미터를 받아오기 (파라미터느 from.jsp파일의 ans를 가리킨다.)

	String ansStr = request.getParameter("ans");

	int ans = 0;

	if (ansStr != null && !ansStr.equals("")) {
		ans = Integer.parseInt(ansStr);
	}
%>

<!-- Q1. 100 + 200=?  출력 값은 같지만 연산문을 body에 넣으면 나중에 유지보수가 힘들기 때문에 지양하는 것이 좋다.-->
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>응답결과</h3>
	<%
		if (ans == (100 + 200)) {
	%>
	정답입니다.
	<%
		} else {
	%>
	정답이 아닙니다ㅏ.
	<%
		}
	%>

</body>
</html>