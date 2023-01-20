package com.smhrd.usercontroller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.model.LevelCheckDAO;
import com.smhrd.model.LevelCheckDTO;
import com.smhrd.model.UserDAO;
import com.smhrd.model.UserDTO;

public class LevelCheckProgram implements Command {
	private static final long serialVersionUID = 1L;

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		LevelCheckDAO dao = new LevelCheckDAO();
		
		List<LevelCheckDTO> list = dao.selectAll();
		
		if(list != null) {
			request.setAttribute("std_id", list);
		}
		
		
		
		return "select.jsp";
	}

	
	

}
