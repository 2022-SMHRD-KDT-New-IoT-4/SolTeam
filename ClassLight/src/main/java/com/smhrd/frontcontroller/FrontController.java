package com.smhrd.frontcontroller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.controller.Command;
import com.smhrd.controller.JoinProgram;
import com.smhrd.controller.LoginProgram;
import com.smhrd.controller.ResearchId;
import com.smhrd.controller.ResearchPw;

@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HashMap<String, Command> map = null;
     
	public void init() throws ServletException {
	map = new HashMap<>();
	
	map.put("Join.do", new JoinProgram());
	map.put("Login.do", new LoginProgram());
	map.put("ResearchId.do", new ResearchId());
	map.put("ResearchPw.do", new ResearchPw());
	
	
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String uri = request.getRequestURI();
		
		String path = request.getContextPath();
		
		String finalurl = uri.substring(path.length()+1);
		
		Command com = null;
		
		request.setCharacterEncoding("UTF-8");
		
	    com = map.get(finalurl);
	    
	    String rdPath = com.execute(request, response);
	    
	    // WEB-INF에 파일 넣으면 rdPath 앞에 "WEB-INF" 추가 할 것 
	    RequestDispatcher rd  = request.getRequestDispatcher(rdPath);
	    
		
	
	}

}
