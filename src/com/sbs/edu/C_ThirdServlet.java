package com.sbs.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/third")
public class C_ThirdServlet extends HttpServlet {

	/*
	 * 서버에서 클라이언트로 데이터를 전송하면서 명시하지 않은 정보가 있다.
	 * 그것은 보내는 데이터의 타입과 문자셋 정보이다.
	 * 응답정보의 헤더에 데이터 타입과 문자셋을 설정해서 보내야지만
	 * 클라이언트는 받은 데이터를 타입에 맞게 처리할 수 있고,
	 * 인코딩 작업도 할 수 있다.
	 * 
	 * 그런데 서버가 이 정보를 명시하지 않으면 기본값으로 처리한다.
	 * 즉 문서타입은 text/html, 문자셋은 8859_1로 처리한다.
	 * 그래서 "<h1>좋은 하루!</h1>"란 문자열을 보내면 html의 h1태그로 처리하고,
	 * 인코딩 문자셋은 8859_1로 처리하는데, 8859_1문자셋은 한글을 지원하지 않는다.
	 * 따라서 한글이 깨져서 출력된다.
	 * 
	 */
	
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		resp.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = resp.getWriter();
		out.print("<h1>좋은하루!</h1>");
		out.close();
	}
	
}
