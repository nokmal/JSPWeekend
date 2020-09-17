package com.sbs.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * web.xml : 서버가 시작할 때 웹서버가 사용하는 파일.
 * 서버에서 서블릿 실행에 관한 정보를 설정 할 때, web.xml에 <servlet> 태그로 설정한다.
 * 서블릿 또는 웹 애플리케이션 서비스를 실행하기 위해 존재하는 파일이다.
 */

/*
 * [1] <servlet> 태그
 * <servlet> 태그는 설정하려는 서블릿을 등록한다.
 * <servlet>태그를 사용하면 반드시 하위태그로 <servlet-name>과 <servlet-class>가 나와야한다.
 * 
 * [2] <init-param> 태그
 * <init-param> 태그는 서블릿에 변수를 전달 할 때 사용한다.
 * 서블릿을 실행하면서 필요한 값을 외부에서 전달받아 실행할 수 있다.
 * 서블릿 소스에서 직접 값을 지정해서 사용해도 되지만, 실행환경에 맞게 동적으로 값을 할당하고자 할 때
 * 외부에서 값을 전달할 수 있다.
 * 
 * [3] <load-on-startup> 태그
 * <load-on-startup> 태그를 사용하면 웹 서비스가 시작될 때 서블릿 객체를 생성 할 수 있다.
 * 서블릿 객체가 메모리에 생성되는 시점은 클라이언트로부터 최초의 요청이 있을 때이다.
 * 서버에 서블릿 클래스 파일이 존재하더라도 클라이언트로부터 실행 요청이 없으면
 * 객체가 메모리에 생성되지 않는다.
 * 
 * 어떠한 서블릿은 요청부터 응답까지 서비스 처리에 전반적으로 관여하기도 하며,
 * 클라이언트로부터 요청이 들어오기 전에 어떤 기능을 미리 준비하는 서블릿도 있다.
 * 이렇게 서비스 처리에 관여하는 서블릿은 클라이언트의 요청과 상관없이 웹 서비스가 시작될 때
 * 객체를 생성하여 대기하고 있어야 한다. 이럴 때 사용하는 태그가 <load-on-startup>이다.
 * 
 * <load-on-startup> 태그의 값으로 숫자를 지정한다. 이 숫자는 객체가 생성되는 우선순위를 의미한다.
 * 서버가 시작될 때 생성해야 하는 서블릿 객체가 여러 개 일 <load-on-startup> 태그의 값으로 우선순위를 지정한다.
 * 숫자가 낮을수록 우선순위가 높다.
 */

public class J_InitParamServlet extends HttpServlet {
	String id, pw;
	
	@Override
		public void init(ServletConfig config) throws ServletException {
			id = config.getInitParameter("id");
			pw = config.getInitParameter("pw");
		}
	
	@Override
		public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			resp.setContentType("text/html; charset=utf-8");
			
			PrintWriter out = resp.getWriter();
			out.print("<h2> 서블릿 초기 추출 변수 </h2>");
			out.print("<h3> ID : " + id + "</h3>");
			out.print("<h3> PW : " + pw + "</h3>");
			out.close();
		}
}
