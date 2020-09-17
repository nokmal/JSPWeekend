package com.sbs.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.filters.AddDefaultCharsetFilter.ResponseWrapper;

@WebServlet ("/bookOutput")
public class S_BookTest2Servlet extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		S_BookDto book = (S_BookDto) req.getAttribute("book");
		
		out.print("책제목 : " + book.getTitle());
		out.print("책저자 : " + book.getAuthor());
		out.print("출판사 : " + book.getPublisher());
		out.close();
		
		
	}
}
