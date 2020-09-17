package com.sbs.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logProc")
public class P_LogInOutServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = resp.getWriter();
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		System.out.println(id + " : " + pw);
		
		if(id.isEmpty() || pw.isEmpty()) {
			out.print("ID 또는 PW를 입력해주세요");
			return;
		}
		HttpSession session = req.getSession();
		if(session.isNew() || session.getAttribute("id") == null ) {
			session.setAttribute("id", id);
			out.print("로그인을 완료하였습니다.");
		} else {
			System.out.println("현재 로그인 상태입니다.");
		}
		
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		HttpSession session = req.getSession();
		
		if(session != null && session.getAttribute("id") != null) {
			session.invalidate();
			out.print("로그아웃 작업 완료!");
		} else {
			out.print("현재 로그인 상태가 아닙니다.");
		}
		
	}
	
}
