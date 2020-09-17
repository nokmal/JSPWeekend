<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form Test</title>
</head>
<body>
	<h3>회원가입</h3>
	<form action="signUp" method="post"> <br/>
	아이디 : <input type="text" name="id"> <br/>
	비밀번호 : <input type="password" name="pw"> <br/>
	이름 : <input type="text" name="name"> <br/>
	자기소개 : <textarea name="content" cols="40" rows="8"></textarea>
	
	</form>
</body>
</html>