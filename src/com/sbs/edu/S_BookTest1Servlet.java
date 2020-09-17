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

@WebServlet ("/bookdReg")
public class S_BookTest1Servlet extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = resp.getWriter();
		req.setCharacterEncoding("utf-8");
		
		String title = req.getParameter("title");
		String author = req.getParameter("author");
		String publisher = req.getParameter("publisher");
		
		S_BookDto book = new S_BookDto();		
		book.setTitle(title);
		book.setAuthor(author);
		book.setPublisher(publisher);
		
		req.setAttribute("book", book);
		
		RequestDispatcher rd = req.getRequestDispatcher("bookOutput");
		rd.forward(req, resp);
		
		
		
		out.close();
	}
}
