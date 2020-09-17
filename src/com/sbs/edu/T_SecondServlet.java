package com.sbs.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/filterSecond")
public class T_SecondServlet extends HttpServlet {
	@Override
	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("SecondServlet!");
		PrintWriter out = resp.getWriter();
		
		out.print("<html>");
		out.print("<head><title> TEST </title></head>");
		out.print("<body>");
		out.print("<h1> Have a Nice Day! </hi>");
		out.print("</body>");
		out.print("</html>");
		out.close();
	}
	
	
	
}
