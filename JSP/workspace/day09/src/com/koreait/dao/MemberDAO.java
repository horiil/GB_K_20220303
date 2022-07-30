package com.koreait.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.koreait.beans.MemberBean;

// 해당 class에는 DBConnection을 맺어서 업무적인 sql문을 날려서 결과값을 return해서 view단에 넘겨주는 기능들을 작성해놓았다.
public class MemberDAO {

	// age_db.jsp -> getAge
	public int getAge(String name) {
		Connection conn;
		PreparedStatement pstm;
		ResultSet rs;
		int age = 0;

		try {
			conn = DBConnection.getConnection();
			String sql = "SELECT age FROM MEMBER WHERE name = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, name);	// ?에 넘기는 param값
			rs = pstm.executeQuery();
			
			if (rs.next() ) {
				age = rs.getInt(1);		// return age
			}
			
		} catch (SQLException e) {
			System.out.println("DB접속 오류");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("알 수 없는 오류");
			e.printStackTrace();
		}

		return age;
	}
	
	// age_all.jsp -> selectAll
	
//	Arraylist로 리던
	public ArrayList<MemberBean> selectAll(){
		Connection conn;
		PreparedStatement pstm;
		ResultSet rs;
		
//		sql문의 결과가 테이블 상태로 나오는 것처럼 데이터도 마찬가지로 테이블 상태로 넘어온다.
		String sql = "SELECT * FROM MEMBER";
		
//		result에 값을 받아옴
		ArrayList<MemberBean> result = new ArrayList<MemberBean>();		//MemberBean이 DTO / VO를 가르킨다.

		try {
		conn = DBConnection.getConnection();
		pstm = conn.prepareStatement(sql);
		rs = pstm.executeQuery();
		
//		rs.next : true일때 계속 반복하면서 객체 배열인 result에 값을 넣어준다.
		while (rs.next()) {
			// 객체 생성
			MemberBean member = new MemberBean();
			member.setName(rs.getString(1));	// 첫 번째 컬럼 가지고와!
			member.setAge(rs.getInt(2));	// 두번째 인덱스 가지고와!
			
		//  객체 배열에 넣어ㅓ준다.
			result.add(member);
			
		}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e){
			e.printStackTrace();
		}
		
		return result;
		
	}
}
