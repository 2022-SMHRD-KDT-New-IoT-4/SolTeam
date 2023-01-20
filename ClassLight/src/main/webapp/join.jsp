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
	
	<%
	String name = (String)request.getSession().getAttribute("name");
	%>
	<%=name %>
</body>
</html>