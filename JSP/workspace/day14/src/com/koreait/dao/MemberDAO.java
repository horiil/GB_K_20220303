package com.koreait.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.koreait.beans.MemberBean;
import com.koreait.mybatis.SqlMapConfig;

public class MemberDAO {

	Context context;
	DataSource dataSource;
	
	Connection conn;
	PreparedStatement pstm;
	ResultSet rs;
	
	SqlSessionFactory factory = SqlMapConfig.getFactory();
	SqlSession sqlsession;
	
	public MemberDAO() {
		// autocommit
		sqlsession = factory.openSession(true);
	}
	
	
	public boolean join(MemberBean member) {
		boolean result = false;
		
		if(sqlsession.insert("Member.join", member) == 1) {
			result = true;
		}
		
		return result;
	}
	
	public MemberBean login(String userid, String userpw) {
		HashMap<String, String> datas = new HashMap<>();
		datas.put("userid", userid);
		datas.put("userpw", userpw);
		
		MemberBean member = sqlsession.selectOne("Member.login", datas);
		return member;
	}
	
	
	public boolean checkId(String userid) {
		boolean result = false;
		int cnt = 0;
		
		cnt = sqlsession.selectOne("Member.checkId", userid);
		if( cnt >= 1 ) {
			result = true;
		}

		return result;
	}
	
	
	public MemberBean searchById(String userid) {
		return (MemberBean)sqlsession.selectOne("Member.searchById", userid);
	}
	
	public List<MemberBean> getList(){
		List<MemberBean> result = sqlsession.selectList("Member.getList");
		return result;
		
	}
	
}


























