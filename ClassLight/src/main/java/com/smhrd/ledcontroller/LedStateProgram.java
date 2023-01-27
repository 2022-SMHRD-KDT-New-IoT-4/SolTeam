package com.smhrd.ledcontroller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Select;
import org.apache.tomcat.util.json.JSONParser;

import com.smhrd.model.LedDTO;
import com.smhrd.usercontroller.Command;
import com.smhrd.model.LedDAO;

import com.google.gson.Gson;
/////////////////////////아두이노 센서 신호 읽어오는 구간

public class LedStateProgram implements Command {

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 아두이노 요청을 읽어오는 구간
		String bodyJson = "";

		StringBuilder stringBuilder = new StringBuilder();
		BufferedReader br = null; //

		try {
			String line = "";
			// body내용 inputstream에 담는다.
			InputStream inputStream = request.getInputStream();
			if (inputStream != null) {
				br = new BufferedReader(new InputStreamReader(inputStream));
				// 더 읽을 라인이 없을때까지 계속
				while ((line = br.readLine()) != null) {
					stringBuilder.append(line);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 읽어온 데이터를 json으로 파싱하는 구간
		Gson gson = new Gson();
		LedDTO inputState = gson.fromJson(stringBuilder.toString(), LedDTO.class);

		System.out.println("들어오니>" + stringBuilder.toString());
		LedDTO dto = new LedDTO();
		LedDAO dao = new LedDAO();

		LedDTO query = new LedDTO();
		query.setSerila_no(inputState.getSerial_no());
		//Serial_no :  select로 값을 받아와 현재 led들의 정보를 확인 
		LedDTO lastState = dao.LedSelect(query);

		if (lastState == null) {
			System.out.println(inputState.getSerial_no());

			return;
		}

		boolean updateFlag = false;
		//현재 led의 값 확인
		updateFlag = updateFlag || (inputState.getRed_led() != lastState.getRed_led());
		updateFlag = updateFlag || (inputState.getGreen_led() != lastState.getGreen_led());
		updateFlag = updateFlag || (inputState.getOrange_led() != lastState.getOrange_led());
		//조건을 줘서 led값 변경 
		if (updateFlag) {
			System.out.println(updateFlag);
			int row = dao.LedUpdate(inputState);
			if (row > 0) {
				System.out.println("업데이트 성공");
			} else {
				System.out.println("업데이트 실패");
			}
		}

		System.out.println(stringBuilder.toString());
//       System.out.println(gson.fromJson(stringBuilder.toString(), LedCountDTO.class));
//       System.out.println("redled: " + dto.getRed_led() +  ", orangeled: " + dto.getOrange_led() + ", greenled: " + dto.getGreen_led()+" , serial :"+dto.getSerial_no());

	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		return null;
	}
}