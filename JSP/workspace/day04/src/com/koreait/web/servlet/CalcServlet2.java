package com.koreait.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/calc2")
public class CalcServlet2 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		// 한글 인코딩
		req.setCharacterEncoding("UTF-8");
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html charset=UTF-8");
		
		// session 객체
		HttpSession session = req.getSession();
		
		PrintWriter out = resp.getWriter();
		
		String value_ = req.getParameter("value");
		String op = req.getParameter("operator");
		
		int value = 0;
		
		// value_값이 공백이 아니라면
		if( !value_.equals("") ) {
			value = Integer.parseInt(value_);
		}
		
		// 계산
		if(op.equals("=") ) {
			// session에 저장되 값을 꺼내옴
			int x = (Integer)session.getAttribute("value");
			// 2번째로 요청보낸 값
			int y = value;
			
			String operator = (String)session.getAttribute("op");
			
			int result = 0;
			
			if(operator.equals("+") ) {
				result = x + y;
			} else {
				result = x - y;
			}
			
			out.println("결과 값: " + result);
			
		} else {	// op값이 + 또는 - 이면, session에 저장
			session.setAttribute("value", value);
			session.setAttribute("op", op);
		}
		
	}
}
