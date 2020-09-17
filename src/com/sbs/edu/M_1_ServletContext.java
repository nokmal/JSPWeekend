package com.sbs.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * - ServletContext
 * 		웹 애플리케이션 단위로 정보를 서버 쪽에 유지할 수 있는 방법은 ServletContext 객체를 사용하는 것이다.
 */

@WebServlet("/context1")
public class M_1_ServletContext extends HttpServlet {
	ServletContext sc;
// [1] init() 메서드를 재정의하여 추출하는 방법
	/*
	 * @Override public void init(ServletConfig config) throws ServletException { sc
	 * = config.getServletContext(); }
	 */
	
// [2] HttpServlet을 통해 추출하는 방법
	/*
	 * @Override public void doGet(HttpServletRequest req, HttpServletResponse resp)
	 * throws ServletException, IOException {
	 * resp.setContentType("text/html; charset=utf-8");
	 * 
	 * PrintWriter out = resp.getWriter(); sc = this.getServletContext();
	 * out.print("context : " + sc); out.close(); }
	 */
	
// ServletContext 변수 설정	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = resp.getWriter();
		sc = this.getServletContext();
		String location = sc.getInitParameter("contextConfig");
		out.print("location : " + location);
		
		out.print("<br/> 서블릿 버전 : " + sc.getMajorVersion() + "." + sc.getMinorVersion());
		out.print("<br/> 서버 정보 : " + sc.getServerInfo());
		out.print("<br/> 웹 애플리케이션 경로 : " + sc.getContextPath());
		out.print("<br/> 웹 애플리케이션 이름 : " + sc.getServletContextName());
		out.print("<br/> 파일 실제 경로 : " + sc.getRealPath("/name.jsp"));
		sc.log("로그기록");
		out.close();
	}
	
}
