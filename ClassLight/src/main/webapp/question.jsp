<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"> 
<title>Insert title here</title>
</head>
<body>
	<form action="makeQuestion.do" method="post">
		문제 제목: <input type="text" name="title">
		<br>
		문제 내용: <input type="text" name="content">
		<br>
		문제풀이 시간: <input type="text" name="time">
		<br>
		문제 점수: <input type="number" name="score">
		<br>
		<input type="submit">
	</form>
</body>
</html>