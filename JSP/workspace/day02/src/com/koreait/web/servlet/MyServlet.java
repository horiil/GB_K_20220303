package com.koreait.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")	// 이전 시간에 web.xml에 여러 줄 작성해서 서블릿 연결하지 않고도, 이처럼 간단하게 작성해서 연결할 수 있다.
public class MyServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");				// 한글이 나타나게 Response를 인코딩
		resp.setContentType("text/html charset=utf-8");	// 한글이 깨지지 않게 Response의 내용의 타입을 지정해주었다.
						
		String paramCnt = req.getParameter("cnt");
		System.out.println("paramCnt : " + paramCnt);
		int cnt = 0;
		
		if(paramCnt != null && !paramCnt.equals("") ) {
			cnt = Integer.parseInt(paramCnt);
		} else {
			cnt = 100;
		}
		System.out.println("cnt : " + cnt);
																// 특정 key값을 통해 Request로 들어온 value값을 반환하기
//		int cnt = Integer.parseInt(req.getParameter("cnt"));	// 문자열로 반환되므로 타 타입으로 바꿀 필요가 있다.
//		System.out.println("cnt : " + cnt);
		
		PrintWriter out = resp.getWriter();
		out.println("안녕 Hello Servlet Annotation!!!!!");
		// setCharacterEncoding 하기 전 결과 : ?? Servlet Annoteation!!!!!
		// setCharacterEncoding 설정 후 결과 : 덈뀞 Hello Servlet Annotation!!!!!
		// setContentType 설정 후 결과 : 안녕 Hello Servlet Annotation!!!!!
	}
}
