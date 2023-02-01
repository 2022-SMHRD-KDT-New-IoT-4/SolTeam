package com.smhrd.ledcontroller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.json.JSONParser;

import com.google.gson.JsonParser;
import com.smhrd.model.OnOffDAO;
import com.smhrd.model.OnOffDTO;
import com.smhrd.usercontroller.Command;

public class OnOffSet extends HttpServlet implements Command {
	// 온 오프 값 들어오는 구간 들어와서 수정

	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 온오프 컨트롤 1작동 0 작동안함
		
	    int On_Off = Integer.parseInt(request.getParameter("ledState"));
		OnOffDTO dto = new OnOffDTO(On_Off);
		OnOffDAO dao = new OnOffDAO();

		int row = dao.OnOffUpdate(dto);
		System.out.println("업데이트 성공 >> " + row);
      
		
		return null;
	}

}
