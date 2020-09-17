package com.sbs.edu;

import java.io.IOException;

import javax.servlet.*;

/*
 * Filter (필터)
 * 필터는 클라이언트로부터 서블릿이 요청되어 수행될 때 필터링 기능을 제공하기 위한 기술이다.
 * 필터가 수행되는 시점은 요청된 서블릿이 수행되기 전과 후이며, 필터 기능을 사용하여 서블릿의 처리와 유지 보수를 더욱 효과적으로처리할 수 있다.
 */

public class T_FlowFilterOne implements Filter {
	
	@Override
		public void init(FilterConfig filterConfig) throws ServletException {
			System.out.println("init() 호출 ... One");
		}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		/*
		 * FilterChain
		 * FilterChain은 필터가 실행될 때 doFilter() 메서드의 세번재 인자로 전달되는 객체로써
		 * web.xml 파일에 설정한 모든 <filter-mapping> 정보를 가지고 있다.
		 * 즉, 클라이언트 요청에 대하여 필터들의 실행 순서를 알고 있는 객체이다.
		 * 하나의 요청에 필터들이 실행되고, 서블릿이 실행될 때 처리 흐름을 제어할 수 있는 객체이다.
		 * 
		 * 만약 필터의 doFilter() 메서드에 chain.doFilter() 명령문이 생략된다면, 실행 흐름은 더 이상진행하지 못하고 현재 메서드에서 종료된다.
		 */
		
		System.out.println("Do Filter ... One _1 ");
		chain.doFilter(request, response);
		System.out.println("Do Filter ... One _2 ");
	}
	
	public void destroy() {
		System.out.println("Destroy One ... 호출");
	}

}
