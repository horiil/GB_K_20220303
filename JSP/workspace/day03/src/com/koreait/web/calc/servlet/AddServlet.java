package com.koreait.web.calc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {

		
		PrintWriter out = resp.getWriter();
		
		String X = req.getParameter("x");
		String Y = req.getParameter("y");
		
		System.out.println("X = " + X);
		System.out.println("Y = " + Y);
	
		int x = 0;
		int y = 0;
		
		System.out.println("x = " + x);
		System.out.println("x = " + x);
		
		if(X != null && !X.equals("") ) {
			x = Integer.parseInt(X);
		}
		
		if(Y != null && !Y.equals("") ) {
			y = Integer.parseInt(Y);
		}
		
		int result = x + y;

		out.println(result);
		System.out.println("result : " + result);

	}
	
}
