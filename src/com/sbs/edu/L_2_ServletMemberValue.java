package com.sbs.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 서블릿을 구현할 때 멤버변수로 선언하면
 * 서블릿을 요청하는 클라이언트끼리 서로 공유되므로 어느 한 쪽의 값을 변경하면 서로에게 영향을 미친다.
 */

@WebServlet("/memberValue")
public class L_2_ServletMemberValue extends HttpServlet {
	String str;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int number = 0;
		str = req.getParameter("msg");
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<head> <title> Multi Thread Test </title></html>");
		out.print("<body>");
		out.print("<h2> 처리결과(멤버변수) </h2>");
		while (number++ < 10) {
			out.print(str + " : " + number + "<br/>");
			out.flush();
			System.out.println(str + " : " + number);
			try {
				Thread.sleep(1000);				
			} catch(Exception e) {
				System.out.println(e.getStackTrace());
			}
		}
		out.print("<h2>Done " + str + "</h2><br/>");
		
		out.print("</body>");
		out.print("</html>");
		out.close();
	}
}
