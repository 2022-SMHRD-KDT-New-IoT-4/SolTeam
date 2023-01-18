package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.model.UserDAO;
import com.smhrd.model.UserDTO;


public class JoinProgram implements Command {
	private static final long serialVersionUID = 1L;

	
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String result = null;
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String job = request.getParameter("job");
		
	    
		UserDTO dto = new UserDTO(id,pw,name, job);
		
		UserDAO dao = new UserDAO();
		
		int row = dao.join(dto);
		
		if(row> 0) {
			request.getSession().setAttribute("name", name);
			
			// 웹 구현되면 join success 화면 만들어서 연결해야함!
			result = "join_success.jsp";
		}else {
			// 웹 구현되면 main 화면 만들어서 연결해야함!
			result = "main.jsp";
		}
		
		return result;
	}

}
