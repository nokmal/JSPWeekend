package com.sbs.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/local")
public class L_1_ServletLocalValue extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int number = 0;
		String str = req.getParameter("msg");
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<head> <title> Multi Thread Test </title></html>");
		out.print("<body>");
		out.print("<h2> 처리결과(지역변수) </h2>");
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
