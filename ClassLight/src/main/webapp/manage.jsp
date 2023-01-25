<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>학생 관리</h1>
	<form action="InfoStudent.do" method="post">
		반<select name="clas">
			<option>1
			<option>2
			<option>3
			<option>4
			<option>5
			<option>6
			<option>7
			<option>8
			<option>9
		</select>
		<br>
		이름<input type="text" name="name">
		<br>
		<input type="submit">
	</form>
</body>
</html>