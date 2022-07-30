package com.koreait.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	//각 jsp파일에서 DB에 Connection하는 코드가 중복고 유지보수가 편하게 위해서 dao 파일을 만들어서 관리한ㄷ.
	public static Connection getConnection() {
		Connection conn = null;
		try {
			
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		// 오라클 사용자 계정 아이디
		String user = "ksh";
		// 오라클 사용자 계정 비밀번호
		String password = "ksh";
		
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB접속 오류");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("알 수 없는 오류");
			e.printStackTrace();
		}
		
		return conn;
	}

}
