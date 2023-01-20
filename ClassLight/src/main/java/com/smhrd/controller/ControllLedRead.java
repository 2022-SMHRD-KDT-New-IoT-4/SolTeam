package com.smhrd.controller;

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

import org.apache.tomcat.util.json.JSONParser;

import com.smhrd.model.LedCountDTO;
import com.smhrd.model.ControlLedDAO;
import com.smhrd.model.ControlLedDTO;
import com.google.gson.Gson;
/////////////////////////아두이노 센서 신호 읽어오는 구간
/**
 * Servlet implementation class Commentdelete
 */
@WebServlet("/api/info")
public class ControllLedRead extends HttpServlet {
   private static final long serialVersionUID = 1L;

   /**
    * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
    */
   protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // 아두이노 요청을 읽어오는 구간
      String bodyJson = "";
        
      StringBuilder stringBuilder = new StringBuilder();
        BufferedReader br = null;        //
        
        try {
            String line = "";
             //body내용 inputstream에 담는다.
            InputStream inputStream = request.getInputStream();
            if (inputStream != null) {
                br = new BufferedReader(new InputStreamReader(inputStream));
                //더 읽을 라인이 없을때까지 계속
                while ((line = br.readLine()) != null) {
                    stringBuilder.append(line);
                }
            }
        } catch (IOException e) {
           e.printStackTrace();
        } 
 
        // 읽어온 데이터를 json으로 파싱하는 구간
       Gson gson = new Gson();       
       LedCountDTO info = gson.fromJson(stringBuilder.toString(), LedCountDTO.class);
             
//       // db에 저장하는 구간
//       ControlLedDTO dto = new ControlLedDTO();
//      dto.setBoardSeq(info.getRed_led());
//      dto.setId(info.getOrange_led());
//      dto.setCmtContent(info.getGreen_led());
//      
//      ControlLedDAO dao = new ControlLedDAO();
//      int row = dao.commentWrite(dto);
//      if(row > 0) {
//         // 댓글작성성공
//      }
//      else {
//         // 작성실패
//      }
//      
       System.out.println("Humidity: " + info.getRed_led() +  ", Temperature: " + info.getOrange_led() + ", Weight: " + info.getGreen_led()+" , serila :"+info.getSerila_no());
   }
}