package com.sbs.edu;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

/*
 * 서블릿 실행 순서
 * 서블릿의 실행 순서를 이해하려면 IoC라는 개념을 알아야 한다.
 * JAVA SE 프로그램은 개발자가 main()메서드 안에 구현한 순서대로 실행된다.
 * 즉 프로그램이 실행되는 순서를 개발자가 제어한다.
 * 그러나 JAVA EE 기바 프로그램은 실행의 흐름을 개발자가 제어하는 것이 아닌
 * 컨테이너가 제어한다.
 * 
 * 이처럼 개발자가 아닌 제3자가 프로그램의 실행 흐름을 제어하는 것을 IoC(Inversion of Control)
 * 우리말로 번역하면 "제어의 역전" 이라고 한다. 우리가 개발할 서블릿도 여기에 속한다.
 * 따라서 JAVA EE기반 프로그램을 개발 할 때는 먼저 애플리케이션 컨테이너들이 프로그램을 어떤 순서로
 * 동작시키는지 알고 해당 순서에 맞게 개발해야 한다.
 * 
 */

/*
 * 
 * 
 */


public class A_FirstServlet extends HttpServlet { 
	
	// init() 메서드 서블릿이 최초로 실행되었을 때
	// 서블릿 컨테이너가 자동으로 실행한다.
	// 서블릿 객체가 생성된 후,
	// 한번만 실행되므로 서블릿의 초기화 역할을 한다.
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init() 실행됨");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service() 실행됨");
	}
	
	
	
	
	
	
	
}
