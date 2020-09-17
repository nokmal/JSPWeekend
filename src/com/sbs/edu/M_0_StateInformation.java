package com.sbs.edu;

import javax.servlet.http.HttpServlet;

/*
 * 상태정보 유지
 * 웹에서 사용하는 HTTP 프로토콜의 통식(통신오타?) 방식은
 * 클라이언트와 서버 간의 연결을 클라이언트로부터 요청이 있을 때마다 매번 새롭게 연결하는 방식이다.
 * 이처럼 클라이언트와 서버 간에 연결 상태가 유지되지 않는 통식(통신오타?) 방식을 '무상태(Stateless)'라고 한다.
 * 
 * 클라이언트가 이전 요청에서의 처리결과를 계속해서 다른 요청에서도 사용하고 싶다면 서버측이든, 클라이언트 측이든
 * 어딘가에 정보를 저장해서 유지해야한다. (원칙상 다시 로그인하는게 맞긴함. <- 이런걸 안하게 하기 위한게 상태정보 유지)
 */

/*
 * - 클라이언트 측에 저장 : 쿠키 - 클라이언트 단위 유지
 * - 서버 측에 저장:
 * 1) ServletContext - 웹 애플리케이션 단위 유지 
 * 		웹 애플리케이션이 서비스되고 있는 동안 유지하는 것을 의미한다. 
 * 		생명주기가 웹 애플리케이션과 같은 객체는 서비스가 시작될 때 생성되고, 서비스가 종료될 때 소멸한다.
 * 		ex) 톰캣 서버 눌렀을 때 시작되고 중지 누르면 종료
 * 2) HttpSession - 클라이언트 단위 유지
 * 		클라이언트 별로 구분해서 상태정보를 유지한다. 예를 들어 A클라이언트가 계속해서 사용하고자 하는 상태 정보가 있는데,
 * 		이 상태정보를 다른 클라이언트는 사용할 수 없어야 할 때 클라이언트 단위로 유지한다.
 * 		ex) 로그인 정보
 * 3) HttpServletRequest - 요청 단위 유지
 * 		웹에서 클라이언트로부터 요청이 있을 때마다 새로운 연결 작업이 이루어지며, 클라이언트로 응답이 이루어지면 연결이 바로 해제된다. 
 */

public class M_0_StateInformation extends HttpServlet {

}
