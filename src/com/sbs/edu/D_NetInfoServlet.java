package com.sbs.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/netInfo")
public class D_NetInfoServlet extends HttpServlet {
	
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<heade><title> test </title></head>");
		out.print("<body>");
		out.print("<h3>네트워크 관련 요청 정보</h3>");
		// 클라이언트가 웹서버에 서비스를 요청할 때 사용한 프로토콜을 이름을 반환한다.
		out.print("Request Scheme : " + req.getScheme() + "<br/>");
		// 서버의 호스트 이름을 반환하고, 별도의 이름이 없으면 IP주소를 반환한다.
		out.print("Server Name : " + req.getServerName() + "<br/>");
		// 클라이언트로부터 서비스를 요청받은 서버의 IP주소를 반환한다.
		out.print("Server Adderess : " + req.getLocalAddr() + "<br/>");
		// 클라리언트로부터 서비스를 요청받은 서버의 포트를 반환한다.
		out.print("Server Port : " + req.getLocalPort() + "<br/>");
		// 서비스를 요청한 클라이언트의 IP주소를 반환한다.
		out.print("Client Adderess : " + req.getRemoteAddr() + "<br/>");
		// 서비스를 요청한 클라이언트 호스트 이름을 반환한다.
		out.print("Client Host : " + req.getRemoteHost() + "<br/>");
		// 서비스를 요청한 클라이언트 포트를 반환한다.
		out.print("Client Port : " + req.getRemotePort() + "<br/>");
		
		out.print("</body>");
		out.print("</html>");
		out.close();
		
		
	}
	
	
	
	
	
	
	
	
	
}
