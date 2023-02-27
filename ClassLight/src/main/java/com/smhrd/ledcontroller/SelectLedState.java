package com.smhrd.ledcontroller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.smhrd.model.LedDAO;
import com.smhrd.model.LedDTO;
import com.smhrd.usercontroller.Command;

public class SelectLedState implements Command {


	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String result;
		
		LedDAO dao = new LedDAO();
		
		List<LedDTO> list = dao.SelectLedState();
		PrintWriter out = response.getWriter();
		
		if(list != null) {
			request.getSession().setAttribute("list", list);
			Gson gson = new Gson();
			out.print(gson.toJson(list));
			// ajax 통신으로 다시 값을 되돌려주겠다
			System.out.println("빨>>>"+list.get(3).getRed_led());
			System.out.println("주>>>"+list.get(3).getOrange_led());
			System.out.println("초>>>"+list.get(3).getGreen_led());
		}
		
		return null;
	}

}
