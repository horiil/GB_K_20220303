package com.koreait.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/get")
public class Get extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		if (req.getMethod().equals("GET")) {
			System.out.println("GET 요청입니다.");

		} else if (req.getMethod().equals("POST")) {
			System.out.println("POST 요청입니다.");
		}
		
//		doGet, doPost를 사용하기 위해서는 
//		부모 클래스의 req, resp를 호출을 해야지만 사용이 가능하다.
		super.service(req, resp);
	} 
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost 메소드가 호출 되었습니다.");
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet 메소드가 호출 되었습니다.");
		
	}
	
//	데이터를 받아와서 service에서 처리 후 
//	super클래스에서 req.resp값을 받아와서 doGet과 doPost까지 처리했기 때문에 각각 2가지 요청이 모두 출력된다.
}
