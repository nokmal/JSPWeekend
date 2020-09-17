package com.sbs.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addInfo")
public class H_AdditionalInfoServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<head><title>기타 정보</title></head>");
		out.print("<body>");
		
		out.print("<h3>추가적인 요청 정보</h3>");
		out.print("Request Method  : " + req.getMethod() + "<br />");
		out.print("Path Info       : " + req.getPathInfo() + "<br />");
		out.print("Path Translated : " + req.getPathTranslated() + "<br />");
		out.print("Query String    : " + req.getQueryString() + "<br />");
		out.print("Content Length  : " + req.getContentLength() + "<br />");
		out.print("Content Type    : " + req.getContentType() + "<br />");
		
		out.print("</body>");
		out.print("</html>");
		out.close(); 
		
	}
}
