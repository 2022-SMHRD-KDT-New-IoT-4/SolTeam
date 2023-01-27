package com.smhrd.infocontroller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.model.UserDAO;
import com.smhrd.model.UserDTO;
import com.smhrd.usercontroller.Command;

public class InfoStudent implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String result = null ;
		
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		String clas = request.getParameter("clas");
		
		UserDTO dto = new UserDTO(name, clas);
		
		UserDAO dao = new UserDAO();
		
		// 학생관리 페이지에서 학생 한 명의 정보를 받아오는 메소드
		List<UserDTO> list = dao.SelectStudent(dto);
		
		if(list != null) {
			request.getSession().setAttribute("list", list);
			result = "testmain.jsp";
		}else {
			result = "testpage.jsp";
		}
		
		// 로그인 실패시 main 으로 이동 --> result 값에 "main.jsp" 넣어주기
		return result;
	}

}
