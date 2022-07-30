package com.koreait.app.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.koreait.action.Action;
import com.koreait.action.ActionForward;
import com.koreait.app.board.dao.BoardDAO;

public class BoardViewAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) {
		ActionForward forward = new ActionForward();
		BoardDAO bdao = new BoardDAO();
		
		int boardnum = Integer.parseInt( req.getParameter("boardnum") );
		
		// 조회수 update
		bdao.updateReadCount(boardnum);
		
		// DAO에 받아온값 replylist에 넣음
		req.setAttribute("replylist", bdao.getReplys(boardnum)); 
		
		// boardnum을 파라미터 값으로 넘기지 않으면 모든 게시물의 조회수가 증가할 수있다.
		req.setAttribute("board", bdao.getDetail(boardnum));
		
		forward.setRedirect(false);
		forward.setPath("/app/board/boardview.jsp");
		System.out.println("/app/board/boardview.jsp 로 이동!");
		
		return forward;
	}
}
