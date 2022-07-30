<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
// Controller 부분

// 이  Controller을 java 파일로 따로 때놓은 것이 mvc2 모델이다

// 	int num = 0;
// 	String num_ = request.getParameter("num");
// 	if(num_ != null && !num_.equals("") ){
// 		num = Integer.parseInt(num_);
// 	}
	
// 	String result = "";
// 	if (num % 2 != 0){
// 		result = "홀수";
// 	} else {
// 		result = "짝수";
// 	}

// Controller 부분
%>

<!-- 사용자에게 보이는 view 단 -->
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 	model 부분 -->
	<%=request.getAttribute("result") %> 입니다.
<!-- 	model 부분 -->
</body>
</html>
<!-- 사용자에게 보이는 view 단 -->