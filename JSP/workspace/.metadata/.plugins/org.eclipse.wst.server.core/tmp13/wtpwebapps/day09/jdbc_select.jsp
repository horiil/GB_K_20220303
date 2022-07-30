<%@page import="java.io.Console"%>
<%@page import="com.sun.corba.se.spi.orbutil.fsm.Guard.Result"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>

<!-- 특정 데이터 베이스와 연결정보를 가지는 interface이다. -->
<!-- DriverManager로부터 Connction객체를 가져온다. -->
<%@page import="java.sql.Connection"%>

<!-- select 구문 실행 결과를 조회할 수 있는 방법을 정의한 interface이다. -->
<%@page import="java.sql.ResultSet"%>

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
	
	Connection conn = null;
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	// 오라클 사용자 계정 아이디
	String user = "ksh";
	// 오라클 사용자 계정 비밀번호
	String password = "ksh";
	
	Class.forName(driver);
	// 확인 문구
	System.out.println("jdbc driver 로딩성공!");
	
	// 연결하려는 계정의 주소, 아이디, 패스워드값을 넘긴다
	conn = DriverManager.getConnection(url, user, password);
	System.out.println("오라클 연결 성공!!");
	
// 	String sql = "SELECT sysdate FROM dual";
// 	PreparedStatement pstm = conn.prepareStatement(sql);
	
	// executeQuery : 쿼리문 수행			//Query에 대한 결과값을 rs에 담아준다. executeQuery
// 	ResultSet rs = pstm.executeQuery();
	
	
	// 보통 데이터를 테이블형태로 많이 가져오는데 보통 첫라인은 컬럼 명이다.
	// rs.next()를 하게되면 다음 줄에 데이터가 있는지 물어보는 것이다.
	// rs.next(): true 다음 라인이 잇는 것이고 false라면 다음 라인에 데이터가 없는 것이다.
// 	if( rs.next() ){
// 		out.print(rs.getDate(1));
// 	}
	
	
	String sql = "SELECT * FROM car";
	PreparedStatement pstm = conn.prepareStatement(sql);
	ResultSet rs = pstm.executeQuery();
	
	// 차번호, 브랜드, 색상, 가격
	while(rs.next()){
// 		rs.getString에 들어가는 1은 컬럼의 인덱스 번호이다.
// 		순서대로 차번호1, 브랜드2, 색상3, 가격4이다.
		out.print("차 번호: " + rs.getString(1) + "<br>");
// 		순서대로가 아닌 컬럼명으로도 데이터를 가져올 수 있다.
		out.print("브랜드: " + rs.getString("BRAND") + "<br>");
		out.print("색상: " + rs.getString(3) + "<br>");
		out.print("가격: " + rs.getInt("PRICE") + "<br>");
	}
	
	out.print("<br><hr>");
	
	String carnum = "3";
// 	sql = "SELECT * FROM car WHERE carnum = '" + carnum + "'";
	// ?에는 파라미터 값이 담길 자리이다.
	sql = "SELECT color FROM car WHERE carnum = ?";
	
	pstm = conn.prepareStatement(sql);
	// 1번째 ?에는 carnum라는 변수가 들어갈거라는 의미이다.
	pstm.setString(1, carnum);
	rs = pstm.executeQuery();
	
	if( rs.next() ){
		out.print("색상: " + rs.getString(1));
	}
	
	
	
	//close는 반납의 개념    / 자바의 서버단과 오라클의 연결했던 줄을 반납했다고 생각하자
 	rs.close();
 	pstm.close();
 	conn.close();
%>
	
</body>
</html>