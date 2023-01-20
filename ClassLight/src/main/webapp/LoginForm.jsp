<%@page import="com.smhrd.model.UserDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="Login.do" method="post">
		<h1> 로그인 </h1>
		<h4> 아이디 입력</h4>
		<input name = "id" type="text" placeholder="아이디를 입력하세요">
		<h4> 비밀번호 입력</h4>
		<input name = "pw" type="text" placeholder="비밀번호를 입력하세요">
		<br>
		<br>
		<input type="submit" value="제출하기">
		<br>
		<a href="#">아이디 찾기</a> <a href="#">비밀번호찾기</a>
	</form>
	
		
	<%
	UserDTO name = (UserDTO)request.getSession().getAttribute("name");
	%>
	<%=name.getUserName() %>
</body>
</html>