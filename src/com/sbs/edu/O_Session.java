package com.sbs.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session")
public class O_Session extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		String param = req.getParameter("p");
		String msg = null;
		HttpSession session = null;
		
		if(param.equals("create")) {
			session = req.getSession();
			if (session.isNew()) {
				msg = "새로운 객체가 생성되었습니다." ;
			} else {
				msg = "기존의 세션 객체가 존재합니다.";
			}
		} 
		
		else if(param.equals("delete")) {
			session = req.getSession();
			if (session != null) {
				session.invalidate(); //세션삭제
				msg = "세션 객체 삭제 완료 되었습니다." ;
			} else {
				msg = "삭제할 세션이 존재하지 않습니다.";
			}
		}
		
		else if(param.equals("add")) {
			session = req.getSession(false);
			session.setAttribute("msg", "메세지입니다.");
			msg = "세션 객체에 데이터가 등록 완료 되었습니다.";
		}
		
		else if(param.equals("get")) {
			session = req.getSession(false);
			if(session != null) {
				String str = (String)session.getAttribute("msg");
				msg = str;
			} else {
				msg = "데이터를 추출할 객체가 존재하지 않습니다.";
			}
			
		} else if(param.equals("remove")) {
			if(session != null) {
				session.removeAttribute("msg");
				msg = "세션 객체의 데이터가 삭제완료 되었습니다.";
			} else {
				msg = "데이터를 삭제할 세션 객체가 존재하지 않습니다.";
			}
			
		} else if(param.equals("replace")) {
			session = req.getSession();
			session.setAttribute("msg", "새로운 메세지입니다. -2-");
			msg = "replace 세션 객체 데이터가 등록 완료되었습니다.";
		}
		
		out.print("처리결과 : " + msg);
		out.close();
	}
}
