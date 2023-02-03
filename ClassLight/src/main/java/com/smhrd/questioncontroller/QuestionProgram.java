package com.smhrd.questioncontroller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.model.QuestionDAO;
import com.smhrd.model.QuestionDTO;
import com.smhrd.usercontroller.Command;

public class QuestionProgram extends HttpServlet implements Command {
	private static final long serialVersionUID = 1L;
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");

		String q_title = request.getParameter("q_title");
		String q_content = request.getParameter("q_content");
		String q_time = request.getParameter("q_time");
		String q_score = request.getParameter("q_score");

		QuestionDTO dto = new QuestionDTO(q_title, q_content, q_time, q_score);

		QuestionDAO dao = new QuestionDAO();

		int row = dao.makeQuestion(dto);

		if (row > 0) {
			request.getSession().setAttribute("q_content", q_content);

			// 웹 구현시 이동할 페이지(로그인 성공) 아래에 기술
			return "readyToClass.jsp";
		} else {

			// 웹 구현시 이동할 페이지(로그인 실패) 아래에 기술
			return "errorpage.jsp";
		}
		
	}

}
