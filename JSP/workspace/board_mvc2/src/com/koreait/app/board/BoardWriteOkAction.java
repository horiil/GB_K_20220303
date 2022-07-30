package com.koreait.app.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.koreait.action.Action;
import com.koreait.action.ActionForward;
import com.koreait.app.board.dao.BoardDAO;
import com.koreait.app.board.dao.BoardDTO;

public class BoardWriteOkAction implements Action {

	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) {
		ActionForward forward = new ActionForward();
		
		// DB연결		을 위해 다오 객체 생성
		BoardDAO bdao = new BoardDAO();
		
		// 데이터
		String boardtitle = req.getParameter("boardtitle");
		String boardcontent = req.getParameter("boardcontent");
		String username = req.getParameter("username");
		
		//BoardDTO에 담아서 넘겨줌
		BoardDTO board = new BoardDTO();
		board.setBoardtitle(boardtitle);
		board.setBoardcontent(boardcontent);
		board.setUsername(username);
		
		forward.setRedirect(true);
		
		// 글 작성 성공&실패시 페이지 이동
		if(bdao.insertBoard(board)) {	// 성공시
//			forward.setPath(req.getContextPath() + "/board/Boardlist.bo");
			int boardnum = bdao.getSeq();
			forward.setPath( req.getContextPath() + "/board/BoardView.bo?boardnum=" + boardnum );
			System.out.println("글 작성 성공!");
			
		} else {						// 실패시
			// "/board/BoardWrite.bo"로 이동
			forward.setPath(req.getContextPath() + "/board/BoardWrite.bo");
			System.out.println("글 작성 실패..!");
		}
		
		return forward;
	}
}
