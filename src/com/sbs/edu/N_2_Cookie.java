package com.sbs.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie3")
public class N_2_Cookie extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		Cookie[] list = req.getCookies();
		
		int cnt = 0;
		
		for(int i = 0; list != null && i< list.length; i++) {
			if(list[i].getName().equals("count")) {
				cnt = Integer.parseInt(list[i].getValue());
			}
		}
		cnt++;
		
		Cookie c = new Cookie("count", cnt + "");
		c.setMaxAge(60*60*1);
		resp.addCookie(c);
		
		out.print("<h1> 방문횟수 : " + cnt + "<h1/>" );
		out.close();
	}
}
