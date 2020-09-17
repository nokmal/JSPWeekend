package com.sbs.edu;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/portalSite")
public class Q_SendRedirectTestServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String Param = req.getParameter("site");
		if(Param.equals("naver")) {
			resp.sendRedirect("http://www.naver.com");
		} else if (Param.equals("google")) {
			resp.sendRedirect("http://www.google.com");
		}
	}
}
