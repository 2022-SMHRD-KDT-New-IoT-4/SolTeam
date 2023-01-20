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

public class QuestionProgram implements Command {
	private static final long serialVersionUID = 1L;

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");

		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String time = request.getParameter("time");
		String score = request.getParameter("score");

		QuestionDTO dto = new QuestionDTO(title, content, time, score);

		QuestionDAO dao = new QuestionDAO();

		int row = dao.make_q(dto);

		if (row > 0) {
			request.setAttribute("title", title);

			// 웹 구현시 이동할 페이지(로그인 성공) 아래에 기술
			return "question.jsp";
		} else {

			// 웹 구현시 이동할 페이지(로그인 실패) 아래에 기술
			return "main.jsp";
		}
		
	}

}
