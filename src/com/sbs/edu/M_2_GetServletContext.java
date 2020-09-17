package com.sbs.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/context3")
public class M_2_GetServletContext extends HttpServlet {
	ServletContext sc;

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		
		ServletContext sc = this.getServletContext();
		PrintWriter out = resp.getWriter();
		
		M_2_ShareObj obj1 = (M_2_ShareObj) sc.getAttribute("data1");
		M_2_ShareObj obj2 = (M_2_ShareObj) sc.getAttribute("data2");
		
		out.print("DATA1 : " + obj1.getCount() + " , " + obj1.getStr() + "<br/>");
		out.print("DATA2 : " + obj2.getCount() + " , " + obj2.getStr() + "<br/>");
		out.close();
	}
	
}
