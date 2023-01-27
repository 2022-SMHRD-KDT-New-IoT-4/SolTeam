<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="./jquery-3.6.3.min.js"></script>
</head>
<body>

	<!-- 회원가입 -->
	<h1>회원가입</h1>
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
		<select name="job" id="jobType" onchange="jobKindchange(this)">
			<option value="1">강사
			<option value="2">학생
		</select>
		<br>
		<label for="jobTypeDetail">학급(반) 선택</label>
		<select name="clas" id="jobTypeDetail"></select>
		<br>
		<!-- 학생을 골랐을 때 반을 선택할 수 있게 함 -->
		<script type="text/javascript">
		function jobKindchange(e) {
			var clas = [1, 2, 3, 4, 5, 6, 7, 8, 9];
			var target = document.getElementById("jobTypeDetail");
			
			if(e.value == "2") var d = clas;
			
			for(x in d) {
				var opt = document.createElement("option");
				opt.value = d[x];
				opt.innerHTML = d[x];
				target.appendChild(opt);
			}
		}
		</script>
		<input type="submit" value="제출하기">
	</form>
	
	
	<!-- 로그인 -->
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
	
	
	<!-- 문제 생성 -->
	<h1>문제 생성</h1>
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

	
	<!-- 학생 조회 -->
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