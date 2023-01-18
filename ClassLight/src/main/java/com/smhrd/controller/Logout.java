package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Logout implements Command {

	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// session 가져오기
		HttpSession session = request.getSession();
		// session 안의 저장되어있는 user data 삭제(무효화)
		session.invalidate();
		// session.removeAttribute("user");
		
		//  이동할곳 작성
		
		return null;
	}
}