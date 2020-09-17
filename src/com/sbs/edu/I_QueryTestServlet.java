package com.sbs.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/queryTest")
public class I_QueryTestServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("member doget입니다.");
		
		resp.setContentType("text/html; charset=utf-8");
		
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		String name = req.getParameter("name");
		
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<head><title>Query 문자열 테스트</title></head>");
		out.print("<body>");
		out.print(id + " : " + pw + " : " + name);
		out.print("</body>");
		out.print("</html>");
		out.close();
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		req.setCharacterEncoding("utf-8");
		System.out.println("member doPost입니다.");
		
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		String name = req.getParameter("name");
		
		
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<head><title>Query 문자열 테스트</title></head>");
		out.print("<body>");
		out.print(id + " : " + pw + " : " + name);
		out.print("</body>");
		out.print("</html>");
		out.close();
	}
	
		
}
