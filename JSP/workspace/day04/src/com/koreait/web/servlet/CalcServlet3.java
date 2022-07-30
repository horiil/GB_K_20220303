package com.koreait.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc3")
public class CalcServlet3 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// 한글 인코딩
		req.setCharacterEncoding("UTF-8");

		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html charset=UTF-8");

		// cookie 배열
		// req에 요청이 넘어온것을 getCookies에 담아옴 -> cookies에 넣음
		Cookie[] cookies = req.getCookies();

		PrintWriter out = resp.getWriter();

		String value_ = req.getParameter("value");
		String op = req.getParameter("operator");

		int value = 0;

		// value_값이 공백이 아니라면
		if (!value_.equals("")) {
			value = Integer.parseInt(value_);
		}

		// 계산
		if (op.equals("=")) {
			// cookie에 저장되 값을 꺼내옴
			int x = 0;
			int y = value;

			// cookies 꺼내기

			for (Cookie c : cookies) {
				if (c.getName().equals("value")) {
					x = Integer.parseInt(c.getValue());
					break;
				}
			}

			String operator = "";

			for (Cookie c : cookies) {
				if (c.getName().equals("op")) {
					operator = c.getValue();
					break;
				}
			}

			int result = 0;

			if (operator.equals("+")) {
				result = x + y;
			} else {
				result = x - y;
			}

			out.println("결과 값: " + result);

		} else { // op값이 + 또는 - 이면, cookies에 저장
			// cookie는 문자열 형태만 담을 수 있따.
			Cookie valueCookie = new Cookie("value", String.valueOf(value));
			Cookie opCookie = new Cookie("op", op);

			// 사용자에게 cookie가 전달된다.
			resp.addCookie(valueCookie);
			resp.addCookie(opCookie);

			resp.sendRedirect("calc3.html");
		}

	}
}
