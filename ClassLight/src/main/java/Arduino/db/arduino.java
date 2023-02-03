package Arduino.db;

/////////////////////////////////아두이노 코드
//// 타이머 라이브러리
////타이머 라이브러리 추가 >>>>
//#include <Arduino.h>
//#include <TM1637Display.h>
//// wifi 라이브러리
//
//#include <WiFi.h>
//#include <HTTPClient.h>
//#include <ArduinoJson.h>
////본인이 사용하는 와이파이 아이디 비밀번호 작성
//const char* ssid = "";  // WIFI ID
//const char* password = "";  // WIFI PW
//
//// Server 요청 주소
//// 본인ip주소:8081
//String origin = "http://211.227.114.143:8081";
//String result = "";  // 응답 결과 저장
//HTTPClient http;     // 통신 객체
//
//
//int cnt1 = 0;
//int cnt2 = 0;
//int cnt3 = 0;
//bool check1 = true;
//bool check2 = true;
//bool check3 = true;
//
//// Module connection pins (Digital Pins)
////세그먼트 디스플레이 핀 번호
//#define CLK 17
//#define DIO 16
//
//// The amount of time (in milliseconds) between tests
//
//TM1637Display display(CLK, DIO);
//
//// led
//int redled = 18;
//int orangeled = 19;
//int greenled = 23;
//// but
//int butred = 5;
//int butorange = 13;
//int butgreen = 12;
//
//void setup() {
//  // put your setup code here, to run once:
//
//  // wifi
//  Serial.begin(115200);  // Baud rate
//
//  WiFi.begin(ssid, password);
//  while (WiFi.status() != WL_CONNECTED) {
//    delay(1000);
//    Serial.println("Connecting to WiFi..");
//  }
//
//  Serial.println("Connected to the WiFi network");
//  WiFi.begin();
//  //////////////////////////////////////////////////////////////////////////////
//  // led
//  pinMode(redled, OUTPUT);
//  pinMode(orangeled, OUTPUT);
//  pinMode(greenled, OUTPUT);
//  // but
//  pinMode(butred, INPUT);
//  pinMode(butorange, INPUT);
//  pinMode(butgreen, INPUT);
//
//  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  display.setBrightness(8);  // 밝기 설정 범위는 0 ~ 16 (세그먼트 디스플레이 밝기)
//
//  uint8_t data[] = { 0xff, 0xff, 0xff, 0xff };
//  display.setSegments(data);  // 배열 출력
//  delay(1000);
//  
//
//  // encode digit를 이용해서 배열 내용을 변경하여 의미 있는 값을 넣을 수 있다
//  //  0 ~ 9를 입력하면 숫자 그대로 표시되며
//  //  10 ~ 15까지는 알파벳 순으로 A ~ F 가 출력된다
//  data[0] = display.encodeDigit(0);
//  data[1] = display.encodeDigit(1);
//  data[2] = display.encodeDigit(2);
//  data[3] = display.encodeDigit(3);
//
//  display.setSegments(data);  // 배열 출력
//  delay(1000);
//
//  data[0] = display.encodeDigit(10);
//  data[1] = display.encodeDigit(11);
//  data[2] = display.encodeDigit(12);
//  data[3] = display.encodeDigit(13);
//
//  display.setSegments(data);  // 배열 출력
//  delay(1000);
//
//  // display.showNumberDec(999, false, 3, 1);//숫자 표시
//  // 153 : 표시할 숫자 , 3 : 숫자 길이, 1 : 표시할 위치 (왼쪽 부터 오른쪽 순)
//  delay(1000);
//}
//
//bool sendGet(String path, String* output) {
//  String url = origin + path;
//  http.begin(url.c_str());
//  int httpCode = http.GET();  // 응답코드
//  bool result = httpCode == 200;
//  if(result){
//    // delay(100); // 데이터가 다 들어오지 않으면 주석제거
//    *output = http.getString();  
//  }
//  http.end();                                             
//  return result;
//}
//
//
//
//
//bool sendPost(String path, String buffer) {
//  String url = origin + path;
//  http.begin(url.c_str());
//  int httpCode = http.POST(buffer);  // 응답코드  
//  http.end();                        // Free the resources
//
//  return httpCode == 200;
//}
//
//
//long dueTime = millis();
//
//void loop() {
//
//  // put your main code here, to run repeatedly:
//  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//      
//  
//     long now = millis();
//    long ttt=0.0;
//       String onoff = "";
//      String result;
//    
//    if(dueTime < now){    
//      sendGet("/ClassLight/api/time", &result);
//       String orderStr = result.substring(0, result.indexOf(',')); // 문제번호
//       String timeStr = result.substring(result.indexOf(',') + 1,result.indexOf('.')); // 문제시간
//      onoff= result.substring(result.indexOf('.')+1); // 온오프제어
//      dueTime = now + timeStr.toInt();
//    }
//    else {
//      //서버에서 넘어온 시간 값 (ttt)
//      ttt=(dueTime - now) / 1000.0;
//    }
//        
//    int buts1 = digitalRead(butred);
//    int buts2 = digitalRead(butorange);
//    int buts3 = digitalRead(butgreen);
//   
//    
//    //세그먼트 디스플레이 출력화면
//     display.showNumberDec(ttt, false, 3, 1);
//    ////
//     sendGet("/ClassLight/api/time", &result);
//     onoff= result.substring(result.indexOf('.')+1); // 온오프제어
//     Serial.println("onoff>>"+onoff); 
//     
//    if(onoff.equals("0")){
//      digitalWrite(redled, 0);
//      digitalWrite(orangeled, 0);
//      digitalWrite(greenled, 0);
//    }
//    
//    // red
//    if (buts1 == 1&& onoff.equals("1")) {
//      if (check1 == true) {
//        cnt1++;
//        check1 = false;
//        if (cnt1 == 1 ) {
//          digitalWrite(redled, 1);
//          if ((WiFi.status() == WL_CONNECTED)) {  // Check the current connection status
//                                                  //serial_no인영씨 자리부터 1 >>갈수록 1씩 증가해서 숫자 입력
//            sendPost("/ClassLight/api/info", "{\"red_led\": 1,\"
//            orange_led\":0,\"green_led\" : 0 ,\"serial_no\": 2}");
//           
//          }
//
//        } else if (cnt1 == 2) {
//          digitalWrite(redled, 0);
//          cnt1 = 0;
//          if ((WiFi.status() == WL_CONNECTED)) {  // Check the current connection status
//            sendPost("/ClassLight/api/info", "{\"red_led\": 0,\"orange_led\":0,\"green_led\" : 0 ,\"serial_no\": 2}");
//          }
//        }
//      }
//    } else if (buts1 == 0) {
//      check1 = true;
//    }
//    // orange
//    if (buts2 == 1 && onoff.equals("1")) {
//      if (check2 == true) {
//        cnt2++;
//        check2 = false;
//        if (cnt2 == 1 ) {
//          digitalWrite(orangeled, 1);
//          if ((WiFi.status() == WL_CONNECTED)) {  // Check the current connection status
//            sendPost("/ClassLight/api/info", "{\"red_led\": 0,\"orange_led\":1,\"green_led\" : 0 ,\"serial_no\": 2}");
//          }
//        } else if (cnt2 == 2) {
//          digitalWrite(orangeled, 0);
//          cnt2 = 0;
//          if ((WiFi.status() == WL_CONNECTED)) {  // Check the current connection status
//            sendPost("/ClassLight/api/info", "{\"red_led\": 0,\"orange_led\":0,\"green_led\" : 0 ,\"serial_no\": 2}");
//          }
//        }
//      }
//    } else if (buts2 == 0) {
//      check2 = true;
//    }
//    // green
//    if (buts3 == 1 && onoff.equals("1") ) {
//      if (check3 == true) {
//        cnt3++;
//        check3 = false;
//        if (cnt3 == 1 ) {
//          digitalWrite(greenled, 1);
//          if ((WiFi.status() == WL_CONNECTED)) {  // Check the current connection status
//            sendPost("/ClassLight/api/info", "{\"red_led\": 0,\"orange_led\":0,\"green_led\" : 1 ,\"serial_no\": 1}");
//          }
//        } else if (cnt3 == 2 ) {
//          digitalWrite(greenled, 0);
//          cnt3 = 0;
//          if ((WiFi.status() == WL_CONNECTED)) {  // Check the current connection status
//            sendPost("/ClassLight/api/info", "{\"red_led\": 0,\"orange_led\":0,\"green_led\" : 0 ,\"serial_no\": 2}");
//          }
//        }
//      }
//    } else if (buts3 == 0) {
//      check3 = true;
//    }
//   
//    ///////////////////////////////////////////////////////////////////////////////////////
//
//   
//
//}
