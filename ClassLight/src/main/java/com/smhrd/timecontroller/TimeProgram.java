package com.smhrd.timecontroller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Select;
import org.apache.tomcat.util.json.JSONParser;

import com.smhrd.model.LedDTO;
import com.smhrd.model.OnOffDAO;
import com.smhrd.model.OnOffDTO;
import com.smhrd.model.QuestionDAO;
import com.smhrd.model.QuestionDTO;
import com.smhrd.model.LedDAO;
import com.smhrd.model.LedDTO;
import com.google.gson.Gson;
/////////////////////////아두이노 센서 신호 보내는 구간 

@WebServlet("/api/time")
public class TimeProgram extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// int set = Integer.parseInt(request.getParameter("onoff"));
		String q_time = request.getParameter("q_time");

		// int q_time = Integer.parseInt(request.getParameter("q_time"));

		QuestionDTO dto = new QuestionDTO();

		dto.setQTime("12");
		// 컬럼이 한 개 일 때 select * 로 움직이는 타이머
		QuestionDAO dao = new QuestionDAO();
		QuestionDTO row = dao.QuestionSelect(dto);

		// row = 문제에 대한 정보를 조회한 값이 담겨있음

//      int time = 12000; // q_time 문제 시간 값 담아주기
		// 오더값이 증가함에 따라 아두이노에서는 다음 문제로 인식한다.
//      int order = 100;  //q_seq 문제 번호 값 담아주기

		int realTime = Integer.parseInt(row.getQTime());

		// 온오프 제어

		OnOffDAO ofdao = new OnOffDAO();
		int onoff = ofdao.OnOffDTOSelect();

		OutputStreamWriter writer = new OutputStreamWriter(response.getOutputStream());
		// 타이머 값
		writer.append(Integer.toString(row.getQSeq()));
		writer.append(",");
		writer.append(Integer.toString(realTime * 6000));
		// 온오프 제어 값
		writer.append(".");
		writer.append(Integer.toString(onoff));

		writer.flush(); // 100,12345
		writer.close();

		System.out.println("무슨 값?" + onoff);
		System.out.println("타이머 무슨 값?" + row.getQTime());
	}

}
