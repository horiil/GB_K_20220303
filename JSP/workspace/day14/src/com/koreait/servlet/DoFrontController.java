package com.koreait.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//  .do로 끝나는 모든 요청은 이쪽으로 온다.
@WebServlet("*.do")
public class DoFrontController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
		
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
		
	}
	
	// get, post 요청 모두 이곳으로 받아온다.
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 파싱 결과 출력 확인문
		System.out.println("URI : " + req.getRequestURI());
		
		// 파싱된 넣음
		String requestURI = req.getRequestURI();
		String responseURI = null;
		
		if(requestURI.equals("/fc/do1.do")) {
			// do1.do 에 대한 업무처리
//			Do1.java에서 처리할것이기 때문에 주석처리함
//			req.setAttribute("result", "do으로 요청보내기!");				// 업무처리
			
//			중복되는 부분이기때문에 주석처리 후 아래에서 한번에 처리하는 부분을 만들어 주었따
//			req.getRequestDispatcher("do1.jsp").forward(req, resp);	// 응답
			
			// Do1에서 return한 값을 가져와서 담음
			responseURI = new Do1().execute(req, resp);
			
		} else if (requestURI.equals("/fc/do2.do")){
			// do2.do 에 대한 업무처리
//			Do2.java에서 처리할것이기 때문에 주석처리함
//			req.setAttribute("result", "do2으로 요청보내기!");
			
//			중복되는 부분이기때문에 주석처리 후 아래에서 한번에 처리하는 부분을 만들어 주었따
//			req.getRequestDispatcher("do2.jsp").forward(req, resp);
			
			// Do2에서 return한 값을 가져와서 담음
			responseURI = new Do2().execute(req, resp);
			
		} else if (requestURI.equals("/fc/do3.do")) {
			// do3.do 에 대한 업무처리
//			Do3.java에서 처리할것이기 때문에 주석처리함
//			req.setAttribute("result", "do3으로 요청보내기!");
			
//			중복되는 부분이기때문에 주석처리 후 아래에서 한번에 처리하는 부분을 만들어 주었따
//			req.getRequestDispatcher("do3.jsp").forward(req, resp);
			
			// Do3에서 return한 값을 가져와서 담음
			responseURI = new Do3().execute(req, resp);
		}
		
		// 이동하는 페이지만 빼면 코드가 중복되기 때문에 각각의 Do파일에서 리턴값을 responseURI에 담아와서
		// 한번에 처리해주었다.
		req.getRequestDispatcher(responseURI).forward(req, resp);
	}
}
