package com.smhrd.questioncontroller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.smhrd.model.QuestionDAO;
import com.smhrd.model.QuestionDTO;
import com.smhrd.usercontroller.Command;

public class TimeProgram implements Command {

	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        String result = null;
		QuestionDAO dao = new QuestionDAO();
		List<QuestionDTO> timeList = dao.time();
        PrintWriter out = response.getWriter();

		if (timeList != null) {
			Gson gson = new Gson();
			out.print(gson.toJson(timeList));
			System.out.println("들어옴 >>> " + timeList.get(3).getQTitle());
			
		} 
		return null;
	}

}
