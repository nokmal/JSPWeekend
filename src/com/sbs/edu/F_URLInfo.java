package com.sbs.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/urlInfo")
public class F_URLInfo extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");		
		
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<head><title> Request 정보 출력 </title></head>");
		out.print("<body>");		
		out.print("<h3>요청 방식과 프로토콜 정보</h3>");
		// 클라이언트가 요청한 문서정보를 반환한다.
		out.print("Request URI      : " + req.getRequestURI()  + "<br/>");
		// 클라이언트가 서비스를 요청한 전체 정보, 즉 url을 반환
		out.print("Request URL      : " + req.getRequestURL()  + "<br/>");
		// 웹 애플리케이션의 경로 정보를 반환
		out.print("Context Path     : " + req.getContextPath() + "<br/>");
		// 서비스를 처리하면서 사용되는 프로토콜의 구체적인 정보를 반환
		out.print("Request Protocol : " + req.getProtocol()    + "<br/>");
		// 웹 애플리케이션을 루트 디렉토리를 기준으로 서블릿의 경로를 반환
		out.print("Servlet Path     : " + req.getServletPath() + "<br/>");
		
		
		out.print("</body>");
		out.print("</html>");
		out.close();
	}
	
}











