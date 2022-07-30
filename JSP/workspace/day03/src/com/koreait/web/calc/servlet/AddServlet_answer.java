package com.koreait.web.calc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add_answer")
public class AddServlet_answer extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {

//		-----------------정답-----------------------
		String xStr = req.getParameter("x");
		String yStr = req.getParameter("y");
		
		int x = 0;
		int y = 0;
		
		if(xStr != null & !xStr.equals("") ) {
			x = Integer.parseInt(xStr);
		}
		
		if(yStr != null & !yStr.equals("") ) {
			y = Integer.parseInt(yStr);
		}
		
		int result = x + y;
		resp.getWriter().println("result is " + result);

	}

}
