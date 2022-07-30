<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- http://localhost:9090/jstl/jstl_test4.jsp?userid=test&userpw=test12324 --%>
	<%-- userid = admin -> 관리자, userid = apply -> 김사과, 비회원 
	userid가 empty 상태일때는 form 태그를 보여준ㄷ,
	--%>
	
	<c:choose>
		<%-- param.userid가 empty일때  --%>
		<c:when test="${empty param.userid }">
			<form>
				아이디 <input type="text" name="userid"><br> 비밀번호
				<input type="password" name="userpw">
				<br>
				<input type="submit">
			</form>
		</c:when>
		<%-- param.userid가 empty가 아닌 경우 --%>
		<c:otherwise>
			<c:set var="userid" value="${userid }" />
			<c:set var="userpw" value="${userpw }" />
			
			<%-- 관리자, 김사과(회원), 비회원 --%>
			<c:choose>
				<c:when test="${userid == admin }">관리자</c:when>
				<c:when test="${userid == apply }">김사과(회원)</c:when>
				<c:otherwise>비회원</c:otherwise>
			
			</c:choose>
		</c:otherwise>
	</c:choose>
</body>


</html>