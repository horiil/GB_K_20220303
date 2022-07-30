<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		// request.getparamtet()...
		// : 요청을 보낸 페이지에서 <input> 으로
		// 보낸 데이터를 받을때 사용
		String userid = "ksh";
		String userpw = "1q2w3e4r";
		String username="김시훈";
		
		// request 공간에 저장
		// 데이터를 담는 형식 : 아래처럼 key, value형태인 경우가 많고
		// 어떠한 메서드를 사용하는지가 중요하다
// 		request.setAttribute("userid", userid);
// 		request.setAttribute("userpw", userpw);
// 		request.setAttribute("username", username);
// 		pageContext.forward("attribute02.jsp");

		// session 공간에 저장
		session.setAttribute("userid", userid);
		session.setAttribute("userpw", userpw);
		session.setAttribute("username", username);
		// 페이지가 변경되지 않음
// 		pageContext.forward("attribute02.jsp");
		// 페이지가 변경됨
		response.sendRedirect("attribute02.jsp");
		// session객체는 브라우저를 종료하지 않는다면
		// 초기화되지 않으므로 redirect(재전송) 방식으로 전송해도 데이터가 유지된다. (브라우저에 저장이 되기 때문)
	%>
</body>
</html>