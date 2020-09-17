package com.sbs.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie2")
public class N_1_GetCookie extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		Cookie[] list = req.getCookies();
		
		for(int i = 0; list != null && i< list.length; i++) {
			out.print(list[i].getName() + " : " + list[i].getValue() + "<br/>");
		}
		
		out.print("<br/>쿠키 추출 완료");
		out.close();
	}
}
