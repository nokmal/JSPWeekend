package com.sbs.edu;

import java.io.IOException;

import javax.servlet.*;

/*
 * Filter (필터)
 * 필터는 클라이언트로부터 서블릿이 요청되어 수행될 때 필터링 기능을 제공하기 위한 기술이다.
 * 필터가 수행되는 시점은 요청된 서블릿이 수행되기 전과 후이며, 필터 기능을 사용하여 서블릿의 처리와 유지 보수를 더욱 효과적으로처리할 수 있다.
 */

public class T_FlowFilterTwo implements Filter {
	
	@Override
		public void init(FilterConfig filterConfig) throws ServletException {
			System.out.println("init() 호출 ... Two");
		}
	
	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		System.out.println("Do Filter ... Two _1 ");
		arg2.doFilter(arg0, arg1);
		System.out.println("Do Filter ... Two _2 ");
	}
	
	public void destroy() {
		System.out.println("Destroy Two ... 호출");
	}

}
