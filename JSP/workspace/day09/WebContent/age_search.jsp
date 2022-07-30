<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="age_db.jsp">
		<label>
			이름: <input type="text" name="name"><br>
			
<!-- 		submit을 누르면 age_db.jsp로 데이터가 전송된다. -->
			<input type="submit">
		</label>
	</form>
<!-- 	button을 누르면 selectAll()이라는 스크립트로 연결된다. -->
	<input type="button" value="전체확인하기" onclick="selectAll();">
	
	<script>
		function selectAll(){
// 			페이지 이동
			location.href="age_all.jsp";
		}
	
	</script>
</body>
</html>