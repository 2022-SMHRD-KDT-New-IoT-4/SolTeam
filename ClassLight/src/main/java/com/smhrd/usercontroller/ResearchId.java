package com.smhrd.usercontroller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.model.UserDAO;
import com.smhrd.model.UserDTO;

public class ResearchId implements Command {
	private static final long serialVersionUID = 1L;

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String result = null;
		
		String name = request.getParameter("name");
		
	    UserDTO dto = new UserDTO();
	    
	    dto.setUserName(name);
	    
	    UserDAO dao = new UserDAO();
	    
	    UserDTO row = dao.researchId(dto);
		
		return result;
	}

}
