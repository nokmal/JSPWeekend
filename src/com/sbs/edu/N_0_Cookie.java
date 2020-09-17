package com.sbs.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie")
public class N_0_Cookie extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		Cookie c1 = new Cookie("id", "guest");
		c1.setPath("/");
		resp.addCookie(c1);
		
		Cookie c2 = new Cookie("code", "0001");
		c2.setMaxAge(60*60*3); // 3시간 유지
		c2.setPath("/");
		resp.addCookie(c2);
		
		Cookie c3 = new Cookie("subject", "java");
		c3.setMaxAge(60*60*24*10); //10일 유지
		c3.setPath("/");
		resp.addCookie(c3);
		
		out.print("쿠키 전송 완료");
		out.close();
	}
}
