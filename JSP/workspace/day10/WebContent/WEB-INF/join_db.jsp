<%@page import="com.koreait.dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%request.setCharacterEncoding("UTF-8");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="member" class="com.koreait.beans.MemberBean" />
<!-- 		일일이 하나씩 넣는ㄴ방ㅂㅂ -->
<%-- 	<jsp:setProperty property="userid" name="member"/> --%>
<%-- 	<jsp:setProperty property="userpw" name="member"/> --%>

<!-- 	한번에 property에 넣는방법 -->
	<jsp:setProperty property="*" name="member"/>
<!-- 	외부에서 전달된 name속성과 필드의 일므이 같으면 value가 자동으로 세팅된다. -->

<%
// 성공 / 실패로 리턴갓을 받아옴
	MemberDAO mdao = new MemberDAO();
	if(mdao.join(member)){ // 회우너가입 성공
%>
	<script>
		alert("회원가입 성공!");
		location.href="login_view.jsp";
	</script>
	
<% } else { // 회원가입 실패  %>
	
	<script>
		alert("회원가입 실패!");
		location.href="Join_view.jsp";
	</script>
<%
	}
%>
</body>
</html>