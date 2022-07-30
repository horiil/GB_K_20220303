package com.koreait.web.servlet.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class CharacterEncodingFilter implements Filter{
	
	@Override
	public void doFilter(ServletRequest request, 
			ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		request.setCharacterEncoding("UTF-8");
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html charset=UTF-8");
		
//		System.out.println("before filter");			// 테스트용 출력
		// filterChain으로 다음 작업 진행 여부를 정한다.
		chain.doFilter(request, response);
//		System.out.println("after filter");				// 테스트용 출력
		
	}

	@Override
	public void destroy() {
		
	}


	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

}
