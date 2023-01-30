package com.smhrd.questioncontroller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.model.QuestionDAO;
import com.smhrd.model.QuestionDTO;
import com.smhrd.usercontroller.Command;

public class TimeProgram extends HttpServlet implements Command {

	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		QuestionDAO dao = new QuestionDAO();

		List<QuestionDTO> timeList = dao.time();

		if (timeList != null) {
			request.getSession().setAttribute("q_time", timeList);
		} 
		return "";
	}

}
