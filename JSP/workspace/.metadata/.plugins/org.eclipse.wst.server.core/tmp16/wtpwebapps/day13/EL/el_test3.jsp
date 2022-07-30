<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=request.getAttribute("result") %><br>
	${result }<br>
	${names[0] }<br>
	${names[1] }<br>
	${notice.id }<br>
	${notice.title }<br>
	<hr>
<!-- 	param이라는 내장 객체를 사용해서 바로 데이터를 가져올수 있다. -->
	${param.num }<br>
	<hr>
	${param.num >= 3 }<br>
	${param.num ge 3 }<br>
	<hr>
<!-- 	param값이 비어있ㄴ느지 물어보는  -->
	${empty param.num }<br>
	${not empty param.num }
	<hr>
	${empty param.num ?'값이 비어 있습니다.':param.num}<br>
	
</body>
</html>