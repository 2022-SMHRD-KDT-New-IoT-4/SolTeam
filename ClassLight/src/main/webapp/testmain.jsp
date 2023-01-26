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
	String selectStudent_name = (String)request.getSession().getAttribute("name");
	%>
	<%=selectStudent_name%>

</body>
</html>