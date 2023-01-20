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

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String result = null ;
				
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		
		UserDTO dto = new UserDTO();
		
		dto.setUserId(id);
		dto.setUserPw(pw);
		
		UserDAO dao = new UserDAO();
		
		UserDTO row = dao.login(dto);
		
		if(row != null) {
			request.getSession().setAttribute("name", row);
		}
		
		// 로그인 실패시 main 으로 이동 --> result 값에 "main.jsp" 넣어주기
		return result;
	}

}
