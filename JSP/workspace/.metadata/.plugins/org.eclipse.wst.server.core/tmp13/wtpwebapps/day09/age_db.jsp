<%@page import="com.koreait.dao.MemberDAO"%>
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
			
			
// DBConnection 부분	

		// 	코드가 중복되기 때문에 DB Connection을 관리할 dao 파일을 만들어준다.
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
//		 연결하려는 계정의 주소, 아이디, 패스워드값을 넘긴다
		// 확인 문구
// 		System.out.println("오라클 연결 성공!!");
// 		conn = DriverManager.getConnection(url, user, password);
		
// DBConnection 부분	


// sql처리 부분

// 		jsp에 너무 많은 자바 코드가 있는것은 좋지않다. view단의 기능에 충실하는 것이 좋기 때문에 
//		DAO파일에 특정 메서드로 빼내는 것이 좋다.
	
// 		Connection conn = DBConnection.getConnection();
// 		String sql = "SELECT age FROM MEMBER WHERE name = ?";
// 		PreparedStatement pstm = conn.prepareStatement(sql);
		
// 		pstm.setString(1, name);
// 		ResultSet rs = pstm.executeQuery();
		

// sql처리 부분


// 		한 건만 받아올 떄
		String name = request.getParameter("name");

		MemberDAO mdao = new MemberDAO();
		int age = mdao.getAge(name);
	%>
	
	화면에 출력
	<%
		if( age != 0 ){
	%>
		이름 : <%=name %><br>
		나이 : <%=age %><br>	
	<%
		} else {
	%>
		찾는 이름이 없습니다.	
	<%
		}
	%>
	
	<input type="button" value="다시 검색하기" onclick="location.href='age_search.jsp'">
	
</body>
</html>