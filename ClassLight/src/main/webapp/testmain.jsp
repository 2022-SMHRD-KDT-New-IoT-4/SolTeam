<%@page import="java.util.List"%>
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
	
	<!-- login -->
	<%
	Object data = request.getSession().getAttribute("name");
	if(data != null){
		UserDTO name = (UserDTO)data;
		out.print(name.getUserName());
	}
	%>
	
	<!-- join -->
	<%
	String join_name = (String)request.getSession().getAttribute("name");
	%>
	<%=join_name %>
	
	<!-- 학생 조회 -->
	<%
	List<UserDTO> Student = (List<UserDTO>)request.getSession().getAttribute("list");
	for(int i = 0; i < Student.size(); i++){
	out.print(Student.get(i).getUserId() + " ");
	}
	%>
<<<<<<< HEAD
	<%=selectStudent_name%>
	
	
=======
>>>>>>> branch 'master' of https://github.com/2022-SMHRD-KDT-New-IoT-4/SolTeam.git

</body>
</html>