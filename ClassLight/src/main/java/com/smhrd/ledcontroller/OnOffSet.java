package com.smhrd.ledcontroller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.model.OnOffDAO;
import com.smhrd.model.OnOffDTO;


@WebServlet("/OnOffSet")
public class OnOffSet extends HttpServlet {
	//온 오프 값 들어오는 구간 들어와서 수정

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//온오프 컨트롤 1작동 0 작동안함 
		int On_Off = Integer.parseInt(request.getParameter("On_Off"));
		
		OnOffDTO dto =new OnOffDTO(On_Off);
		OnOffDAO dao = new OnOffDAO();
		
		int row = dao.OnOffUpdate(dto);
		System.out.println("업데이트 성공"+row);
		
		
		
		
		
		
		
	}

}
