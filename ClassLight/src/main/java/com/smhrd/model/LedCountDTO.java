package com.smhrd.model;

public class LedCountDTO {
	//학생 led 점등현화 DTO
	///////아두이노에서 받아온 센서값 DTO
	  private String control_seq;

	    // 빨강 LED 
	    private Integer red_led;

	    // 주황 LED 
	    private Integer orange_led;

	    // 녹색 LED 
	    private Integer green_led;

	    // 학생 아이디 
	    private String student_id;
	    //시리얼 넘버
	    private Integer serial_no;
		public LedCountDTO(String control_seq, Integer red_led, Integer orange_led, Integer green_led, String student_id , Integer serial_no) {
			super();
			this.control_seq = control_seq;
			this.red_led = red_led;
			this.orange_led = orange_led;
			this.green_led = green_led;
			this.student_id = student_id;
			this.serial_no = serial_no;
		}
		
		// db에 넣을 정보
		public LedCountDTO(Integer red_led, Integer orange_led, Integer green_led, Integer serial_no) {
			super();
			this.red_led = red_led;
			this.orange_led = orange_led;
			this.green_led = green_led;
			this.serial_no = serial_no;
		}



		public LedCountDTO() {
		}

		public Integer getSerial_no() {
			return serial_no;
		}

		public void setSerila_no(Integer serial_no) {
			this.serial_no = serial_no;
		}

		public String getControl_seq() {
			return control_seq;
		}

		public void setControl_seq(String control_seq) {
			this.control_seq = control_seq;
		}

		public Integer getRed_led() {
			return red_led;
		}

		public void setRed_led(Integer red_led) {
			this.red_led = red_led;
		}

		public Integer getOrange_led() {
			return orange_led;
		}

		public void setOrange_led(Integer orange_led) {
			this.orange_led = orange_led;
		}

		public Integer getGreen_led() {
			return green_led;
		}

		public void setGreen_led(Integer green_led) {
			this.green_led = green_led;
		}

		public String getStudent_id() {
			return student_id;
		}

		public void setStudent_id(String student_id) {
			this.student_id = student_id;
		}

}
