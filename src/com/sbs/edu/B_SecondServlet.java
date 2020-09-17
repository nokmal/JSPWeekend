package com.sbs.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * web.xml 파일로 설정하는 방식은 여러개의 서블릿을 태그로 등록하기 때문에 
 * 전체적인 관리가 쉽다.
 * 
 * 그리고 @WebServlet 설정 방식은 설정파일 없이 자바소스에서 
 * @WebServlet으로 쉽게 url패턴을 지정할 수 있다.
 * 
 * 그러나 하나의 자바 소스에 하나의 서블릿 매핑만 가능하므로 여러개의
 * 서블릿에 대한 정보를 일목요연하게 볼 수 없다.
 * web.xml에 설정하는 방법보다 유지보수성이 떨어진다.
 * 
 */


@WebServlet("/hello2")
public class B_SecondServlet extends HttpServlet {
	
	// get방식의 요청이 있을 때 실행된다.
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet()실행됨");
		doPost(req, resp);
		
		// 요청한 클라이언트와 웹서버 간 연결된 출력 스트림
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<heade><title> test </title></head>");
		out.print("<body>");
		out.print("<h1>Have a nice day!</h1>");
		out.print("</body>");
		out.print("</html>");
		out.close(); // 자원해제 : 생성했던 자원을 더 이상 사용하지 않는다면 메모리에서 해제
	}
	// post방식의 요청이 있을 때 실행된다.
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost()실행됨");
	}
}
