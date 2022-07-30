package com.koreait.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cnt")
public class CntServlet extends HttpServlet{
	
	/*
	 * CntServlet을 servlet class로 사용하여
	 * 사용자 url요청 	: http://localhost:9090/cnt?cnt=5
	 * 화면 출력 내용		: 1: 안녕 servlet
	 * 				  2: 안녕 servlet
	 * 				  3: 안녕 servlet
	 * 				  4: 안녕 servlet
	 *  			  5: 안녕 servlet
	 *  
	 *  사용자 url요청 	: http://localhost:9090/cnt?		null or ""
	 *  화면 출력 내용	: 1: 안녕 servlet
	 * 				  ...
	 * 				  100: 안녕 servlet
	 */
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		// 한글이 깨지지 않게 
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html charset=utf-8");
		
		String paramCnt = req.getParameter("cnt");
		System.out.println("paramCnt : " + paramCnt);
		
		int cnt = 100;
		
		if(paramCnt != null && !paramCnt.equals("") ) {
			cnt = Integer.parseInt(paramCnt);
		}
		System.out.println("cnt : " + cnt);
		
		PrintWriter out = resp.getWriter();
		if(cnt == 100) {
			for(int i = 1; i <= cnt; i++) {
				out.println(i + ":" + " 안녕 servlet<br>");
			}
		} else {
			for(int j = 1; j <= cnt; j++) {
				out.println(j + ":" + " 안녕 servlet<br>");
			}
		}
	}
}
