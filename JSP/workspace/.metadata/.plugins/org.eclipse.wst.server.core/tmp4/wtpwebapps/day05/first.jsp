<!-- 
	디렉티브 태그 
		-> 사용할 프로그래밍 언어, 생성할 문서의 콘텐츠 유형, 문자의 인코딩 설정, ... 등을 표시
	#import을 해서 가지고 오는 경우를 제외하면 디렉티브 태그는 페이지당 하나만 사용이 가능하다.#
-->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<!-- 이러한 디렉티브 태그 덕분에 java단에서 한글 인코딩을 해주었던 작업을 하지 않아도 된다. -->
<%
// 	response.setCharacterEncoding("UTF-8");
// 	response.setContentType("text/html; charset=UTF-8");

// 	객체 선언 후 request로 돌아오는 값(cnt)를 받아온다
	String cntStr = request.getParameter("cnt");
	
	int cnt = 100;
	if( cntStr != null && !cntStr.equals("") ){
		cnt = Integer.parseInt(cntStr);
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		for(int i = 0; i < cnt; i++){
	%>
			안녕 servlet!!!<br>
			
	<% 
			}
	%>
		
</body>
</html>