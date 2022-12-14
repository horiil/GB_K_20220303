package com.koreait.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.koreait.beans.MemberBean;

public class MemberDAO {

	Connection conn;
	PreparedStatement pstm;
	ResultSet rs;

	// DTO / VO / BEAN 등에 담겨서 이동한다.
	public boolean join(MemberBean member) {

		String sql = "INSERT INTO TBL_MEMBER values(?, ?, ?, ?, ?)";

		// 실패 시 값을 받을 변수
		int result = 0;

		try {
			conn = DBConnection.getConnction();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, member.getUserid());
			pstm.setString(2, member.getUserpw());
			pstm.setString(3, member.getUsername());
			pstm.setString(4, member.getUsergender());
			pstm.setString(5, member.getUserphone());

			// executeUpdate()
			// - SQL DMLT(데이터 조작어) 행의 수가 return
			// 결과값이 없는 경우 0 return
			result = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (result != 0) {
			// 성공
			return true;
		} else {
			// 실패
			return false;
		}
	}

	// login
	public MemberBean login(String userid, String userpw) {
		String sql = "SELECT * FROM tbl_member WHERE userid = ? AND userpw = ?";
		MemberBean member = null;

		try {

			conn = DBConnection.getConnction();
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, userid);
			pstm.setString(2, userpw);

			rs = pstm.executeQuery();

			if (rs.next()) {
				member = new MemberBean();
				member.setUserid(rs.getString(1));
				member.setUserpw(rs.getString(2));
				member.setUsername(rs.getString(3));
				member.setUsergender(rs.getString(4));
				member.setUserphone(rs.getString(5));
			}

			// 예외처리
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return member;
	}

}
