package com.koreait.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myserlvet")
public class MyServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("result", "success");
		
		String[] name = {"ksh", "abc"};
		req.setAttribute("names", name);
		
		Map<String, Object> notice = new HashMap<String, Object>();
		notice.put("id", 1);
		notice.put("title", "el학습");
		req.setAttribute("notice",  notice);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/EL/el_test3.jsp");
		dispatcher.forward(req, resp);
		
	
	}
}
