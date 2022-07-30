<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- 로그인 실패시 --%>
	<c:if test="${not empty param.flag }">		<%-- UserLoginOkAction에서  받는 flag값이 null 인지 체크--%>
		<c:if test="${not param.flag }">
			<script>
				alert("로그인 실패!");
			</script>
		</c:if>
	</c:if>
	<form action="${pageContext.request.contextPath }/user/userLoginOk.us" method="post">
		<p>
			아이디 <input type="text" name="userid">
		</p>
		<p>
			비밀번호 <input type="password" name="userpw">
		</p>
		<p>
			<input type="submit" value="로그인하기">
		</p>
	</form>
</body>
</html>