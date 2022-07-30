package com.koreait.app.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.koreait.action.Action;
import com.koreait.action.ActionForward;
import com.koreait.app.board.dao.BoardDAO;
import com.koreait.app.board.dao.ReplyDTO;

public class AddReplyAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) {
		ActionForward forward = new ActionForward();
		
		// DAO 객체
		BoardDAO bdao = new BoardDAO();
		// DTO 객체
		ReplyDTO reply = new ReplyDTO();
		
		// ReplyDTO에서 데이터 가져옴
		int boardnum = Integer.parseInt(req.getParameter("boardnum"));
		
		reply.setBoardnum( boardnum );
		reply.setUsername( req.getParameter("username") );
		reply.setPassword( req.getParameter("password") );
		reply.setReplycontents( req.getParameter("replycontents") );

		
		// DAO로 데이터를 넘겨줌
		if(bdao.addReply(reply)) {
			forward.setRedirect(true);
			forward.setPath(req.getContextPath() + "/board/BoardView.bo?boardnum=" + boardnum);
			System.out.println("replyAction에서 DAO로 가는중");
			
		}
		return forward;
	}

	
}
