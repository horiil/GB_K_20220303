package com.koreait.web.calc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc")
public class CalcServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		String Sx = req.getParameter("x");
		String Sy = req.getParameter("y");
		String op = req.getParameter("operator");
		
		System.out.println("Sx : " + Sx);
		System.out.println("Sy : " + Sy);
		System.out.println("operator : " + op);
		
		int x = 0;
		int y = 0;
		int result = 0;
		
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("result : " + result);
		
		if(Sx != null && !Sx.equals("") ) {
			x = Integer.parseInt(Sx);
		}
		
		if(Sy != null && !Sy.equals("") ) {
			y = Integer.parseInt(Sy);
		}
		
		if(op.equals("덧셈") ) {
			result = x + y;
			resp.getWriter().println("x + y = " + result);
		} else {
			result = x - y;
			resp.getWriter().println("x - y = " + result);
		}
		
		
	}
}
