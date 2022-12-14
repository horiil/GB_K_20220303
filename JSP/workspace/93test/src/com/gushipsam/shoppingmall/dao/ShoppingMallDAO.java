package com.gushipsam.shoppingmall.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.gushipsam.shoppingmall.mybatis.SqlMapConfig;


public class ShoppingMallDAO {
	SqlSessionFactory factory = SqlMapConfig.getFactory();
	SqlSession sqlsession;
	
	public ShoppingMallDAO() {
		// autocommit
		sqlsession = factory.openSession(true);
	}
	
	public boolean checkId(String userid) {
        boolean result = false;
        int cnt = 0;
        
        cnt = sqlsession.selectOne("shoppingmall.checkId", userid);
        if( cnt >= 1 ) {
           result = true;
        }

        return result;
     }


	public int join(ShoppingMallDTO user) {
		int result;
	    
		result = sqlsession.insert("shoppingmall.join",user);
		 
		System.out.println("result : " + result);
	    return result;
	}

	public boolean login(String userid, String userpw) {
		boolean result = false;
		
		HashMap<String, String> datas = new HashMap<>();
		datas.put("userid", userid);
		datas.put("userpw", userpw);
		
		if((Integer)sqlsession.selectOne("shoppingmall.login", datas) == 1) {
			result = true;
		}
		
		return result;
	}
	
	public String id(String username, String userphone, String useremail) {
		
		HashMap<String, String> datas = new HashMap<>();
		datas.put("username", username);
		datas.put("userphone", userphone);
		datas.put("useremail", useremail);
		
		String user_id = sqlsession.selectOne("shoppingmall.id", datas);
		
		return user_id;
	}
	
	public String pw(String userid, String username, String userphone, String useremail) {
		
		HashMap<String, String> datas = new HashMap<>();
		datas.put("userid", userid);
		datas.put("username", username);
		datas.put("userphone", userphone);
		datas.put("useremail", useremail);
		
		String user_pw = sqlsession.selectOne("shoppingmall.pw", datas);
		
		return user_pw;
	}
	


	// goods_seq
	public int getGoods_seq() {
		return sqlsession.selectOne("shoppingmall.getGoods_seq");
	}

	
	// (mypage) ??????(3??????) ?????? ?????????(????????????
	public List<ShoppingMallDTO> getRecentList(String userid) {
		System.out.println("getRecentList ??????");

		List<ShoppingMallDTO> recentList = sqlsession.selectList("shoppingmall.getRecentList", userid);
		System.out.println("recentList ??????");

		return recentList;
	}
	
	

	// ????????? ?????? ?????????
		public List<ShoppingMallDTO> getMemberList() {
			System.out.println("getMemberList ??????");

			List<ShoppingMallDTO> memberList = sqlsession.selectList("shoppingmall.getMemberList");
			System.out.println("memberList ??????");

			return memberList;
		}

		// ????????? ?????? ???
		public int getMemberCnt() {
			return sqlsession.selectOne("shoppingmall.getMemberCnt");
		}



		// (?????? ?????????) ?????? ???
		public int getOrderCnt() {
			return sqlsession.selectOne("shoppingmall.getOrderCnt");
		}

		public List<ShoppingMallDTO> getOrderList(int startRow, int endRow) {
			HashMap<String, Integer> datas = new HashMap<>();
			datas.put("startRow", startRow);
			datas.put("endRow", endRow);

			List<ShoppingMallDTO> orderList = sqlsession.selectList("shoppingmall.getOrderList", datas);
			System.out.println("orderList ????????????");
			return orderList;
		}	


	
	// search ?????????(?????????,?????????)
	public List<ShoppingMallDTO> getSearchList(String searchtext) {
		System.out.println("getSearchList ????????? dao ??????");
		System.out.println(searchtext);
		/*
		 * HashMap<String, String> datas = new HashMap<>();
		 * datas.put("searchtext",searchtext);
		 */
		List<ShoppingMallDTO> searchlist = new ArrayList<>();
		System.out.println("arraylist ??????!");
		System.out.println(sqlsession.selectList("shoppingmall.getSearchList", searchtext));
		searchlist.addAll(sqlsession.selectList("shoppingmall.getSearchList", searchtext));
		System.out.println("select ???????????????");

		return searchlist;
	}
	
	
	
}


















