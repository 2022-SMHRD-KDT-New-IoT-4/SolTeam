package com.smhrd.usercontroller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.model.UserDAO;
import com.smhrd.model.UserDTO;

public class LoginProgram implements Command {

	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String result = null;
				
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		
		
		UserDTO dto = new UserDTO();
		
		dto.setUserId(user_id);
		dto.setUserPw(user_pw);
		
		UserDAO dao = new UserDAO();
		
		UserDTO row = dao.login(dto);
		
		if(row != null) {
			request.getSession().setAttribute("name", row);
			result = "mainTeacher.jsp";
		}else {
			result="main.jsp";
		}
		
		// 로그인 실패시 main 으로 이동 --> result 값에 "main.jsp" 넣어주기
		return result;
	}

}
