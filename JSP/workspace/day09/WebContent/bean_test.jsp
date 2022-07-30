<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 	선언 -->
<!-- 	class는 가져올 패키지의  패지키명.클래스명 으로 작성하고,  어떤 객체명으로 보낼지 id를 적어준다. -->
	<jsp:useBean class="com.koreait.beans.MemberBean" id="member" />
<!-- 	set -->
<!-- 	각 안의 객체를 가져온다.-->
<!-- 	name이라고 하는 객체에 property (가 적용될)대상 name에 김자바 라는 값을 넣어준다. -->
	<jsp:setProperty name="member" property="name" value="김자바" />
<!-- 	set -->
	<jsp:setProperty name="member" property="age" value="22" />
	
	<table border="1">
		<tr>
			<th>이름</th>
			<th>나이</th>
		</tr>
		<tr>
			<td><jsp:getProperty property="name" name="member"/>
			<td><jsp:getProperty property="age" name="member"/>
		</tr>
	</table>
</body>
</html>