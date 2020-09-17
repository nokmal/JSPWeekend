package com.sbs.edu;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/headerInfo")
public class G_HeaderInfoServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<head><title>Header 정보 출력</title></head>");
		out.print("<body>");
		out.print("<h3>요청 헤더 정보</h3>");
		
		Enumeration<String> em = req.getHeaderNames();
		while(em.hasMoreElements()) {
			String s = em.nextElement();
			out.println(s + " : " + req.getHeader(s) + "<br/>");
		}		
		
		out.print("</body>");
		out.print("</html>");
		out.close();
	} 
}






