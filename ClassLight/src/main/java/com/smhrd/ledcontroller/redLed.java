package com.smhrd.ledcontroller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.model.ControlLedDAO;
import com.smhrd.model.ControlLedDTO;
import com.smhrd.usercontroller.Command;

public class redLed implements Command {
	private static final long serialVersionUID = 1L;

	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		
		ControlLedDTO dto = new ControlLedDTO();
		
		dto.setStudentId(id);
		
		ControlLedDAO dao = new ControlLedDAO();
		
		String row = dao.redLed(dto);
		
		if(row != null) {
			request.getSession().setAttribute("redLed", 1);
		} else if (row == null) {
			request.getSession().setAttribute("redLed", 0);
		}
		
		return row;

	}

}
