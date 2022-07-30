package com.koreait.web.calc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc3")
public class Calc3Servlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		String[] numStr = req.getParameterValues("num");
		
		int result = 0;
		
		for(int i = 0; i < numStr.length; i++) {
			int num = Integer.parseInt( numStr[i]);
			result += num;
		}
		
		resp.getWriter().println("result is " + result);
	}
}
