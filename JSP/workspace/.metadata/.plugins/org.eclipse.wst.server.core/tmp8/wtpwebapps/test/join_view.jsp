<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="join_db.jsp" name="joinForm" method="post">
		<p id="text"> 사용할 수 있는 아이디 입니다.</p>
		<p>
			<label> 아이디: <input type="text" name="username"> </label>
			<input type="button" value="중복확인">
		</p>
		<p>
			<label> 비밀번호: </label>
			<input type="password" name="userpw"> 
		</p>
		<p>
			<label> 비밀번호 확이: </label>
		</p>
	
	
	
	</form>
</body>
</html>