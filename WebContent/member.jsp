<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form Test</title>
</head>
<body>
	<h3>회원정보 GET</h3>
	
	<form action="queryTest" method="get">
		ID   : <input type="text" name="id"/> <br/>
		PW : <input type="password" name="pw" /> <br/>
		이름 : <input type="text" name="name" /> <br/>
		
		<input type="submit" value="전송" /> <br/>
		<input type="reset" value="초기화" /> <br/>
		</form>
		
	<h3>회원정보 POST</h3>
	
	<form action="queryTest" method="post">
		ID   : <input type="text" name="id"/> <br/>
		PW : <input type="password" name="pw" /> <br/>
		이름 : <input type="text" name="name" /> <br/>
		
		<input type="submit" value="전송" /> <br/>
		<input type="reset" value="초기화" /> <br/>
		</form>
</body>
</html>