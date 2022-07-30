package com.koreait.app.board.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.koreait.app.board.mybatis.SqlMapConfig;



public class BoardDAO {
	SqlSessionFactory factory = SqlMapConfig.getFactory();
	SqlSession sqlsession;
	
	public BoardDAO() {
		// autocommit
		sqlsession = factory.openSession(true);
	}

	// 테이블의 데이터를 읽어옴
	public List<BoardDTO> getBoardList(int startRow, int endRow) {
		HashMap<String, Integer> datas = new HashMap<>();
		datas.put("startRow", startRow);
		datas.put("endRow", endRow);
		List<BoardDTO> boardList = sqlsession.selectList("Board.getBoardList", datas);

		System.out.println("BoardList 조회 성공");
		return boardList;
	}

	
	// 테이블의 리스트 수를 읽어옴
	public int getBoardCnt() {
		return sqlsession.selectOne("Board.getBoardCnt");
	}

	
	// [글쓰기]
	public boolean insertBoard(BoardDTO board) {
		boolean result = false;
		
		// insert가 성공했다면
		if(sqlsession.insert("Board.insertBoard", board) == 1) {
			result = true;
		}
		
		System.out.println("result : "+result);
		
		return result;
		
	}

	// 글의 세부내용
	public BoardDTO getDetail(int boardnum) {
		return (BoardDTO)sqlsession.selectOne("Board.getDetail", boardnum);
	}

	
	// 조회수 증가
	public void updateReadCount(int boardnum) {
		System.out.println("DAO 도착!");
		sqlsession.update("Board.updateReadCount",boardnum);
	}

	
	public int getSeq() {
		return sqlsession.selectOne("Board.getSeq");
	}

	
	public boolean addReply(ReplyDTO reply) {
		boolean result = false;
		
		// sql문
		if(sqlsession.insert("Board.addReply", reply) != 0) {
			result = true;
			System.out.println("sql값");
		}
		return result;
	}

	
	// 테이블의 데이터 전체를 가져와서 담아야 하기 때문에 리스트로 리턴
	public List<ReplyDTO> getReplys(int boardnum) {
		
		List<ReplyDTO> list =  sqlsession.selectList("Board.getReplys",boardnum);
		System.out.println("리스트안에 데이터 담기");
		return list;
	}

	// DAO에서 호출함
	public boolean updateReply(int replynum, String replycontents) {
		boolean result = false;
		HashMap<String, Object> datas = new HashMap<>();
		datas.put("replynum", replynum);
		datas.put("replycontents", replycontents);
		
		if(sqlsession.update("Board.updateReply", datas) != 0) {
			result = true;
		}
		return result;
		
	}

	public boolean deleteReply(int replynum) {
		boolean result = false;
		
		if(sqlsession.delete("Board.deleteReply", replynum) == 1){
			result = true;
		}
		
		return result;
	}
}
