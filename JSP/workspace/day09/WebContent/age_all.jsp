<%@page import="com.koreait.beans.MemberBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="mdao" class="com.koreait.dao.MemberDAO" />
	<%
//		코드가 중복되기 때문에 DB Connection을 관리할 dao 파일을 만들어준다.
		// DB Connection이 이루어 진다.
		// ....
		// ....
// 		Connection conn = null;
// 		String driver = "oracle.jdbc.driver.OracleDriver";
// 		String url = "jdbc:oracle:thin:@localhost:1521:xe";
// 		// 오라클 사용자 계정 아이디
// 		String user = "ksh";
// 		// 오라클 사용자 계정 비밀번호
// 		String password = "ksh";
		
// 		Class.forName(driver);
// 		// 확인 문구
// 		System.out.println("jdbc driver 로딩성공!");
		// 확인 문구
// 		System.out.println("오라클 연결 성공!!");
// 		연결하려는 계정의 주소, 아이디, 패스워드값을 넘긴다
// 	conn = DriverManager.getConnection(url, user, password);
		
// 	MemberDAO에서 만든 selectALL메서드를 사용하기 위해 지정한 액션태그 id로 불러와서 객체 배열에 값을 넣는다.
	ArrayList<MemberBean> result = mdao.selectAll();
		
	%>
	
	<table border="1">
		<tr>
			<th>이름</th>
			<th>나이</th>
		</tr>
		<%
			for(MemberBean member : result){
		%>
			<tr>
				<td><%=member.getName() %></td>
				<td><%=member.getAge() %></td>
			</tr>
			
		<% } %>	
	</table>
	<input type="button" value="다시 검색하기" onclick="location.href='age_search.jsp'">
</body>
</html>