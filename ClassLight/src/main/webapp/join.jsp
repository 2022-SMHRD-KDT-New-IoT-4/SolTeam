<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="Join.do" method="post">
		아이디<input type="text" name="id">
		<br>
		비번<input type="text" name="pw">
		<br>
		이름<input type="text" name="name">
		<br>
		생년월일<input type="date" name="birth">
		<br>
		회원유형
		<br>
		<select name="job">
			<option value="teacher">강사
			<option value="student">학생
		</select>
		<br>
		<input type="submit" value="제출하기">
	</form>
</body>
</html>