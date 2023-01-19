package com.smhrd.model;

public class LedCountDTO {
	
	///////아두이노에서 받아온 센서값 DTO
	  private String control_seq;

	    // 빨강 LED 
	    private String red_led;

	    // 주황 LED 
	    private String orange_led;

	    // 녹색 LED 
	    private String green_led;

	    // 학생 아이디 
	    private String student_id;

		public LedCountDTO(String control_seq, String red_led, String orange_led, String green_led, String student_id) {
			super();
			this.control_seq = control_seq;
			this.red_led = red_led;
			this.orange_led = orange_led;
			this.green_led = green_led;
			this.student_id = student_id;
		}

		public String getControl_seq() {
			return control_seq;
		}

		public void setControl_seq(String control_seq) {
			this.control_seq = control_seq;
		}

		public String getRed_led() {
			return red_led;
		}

		public void setRed_led(String red_led) {
			this.red_led = red_led;
		}

		public String getOrange_led() {
			return orange_led;
		}

		public void setOrange_led(String orange_led) {
			this.orange_led = orange_led;
		}

		public String getGreen_led() {
			return green_led;
		}

		public void setGreen_led(String green_led) {
			this.green_led = green_led;
		}

		public String getStudent_id() {
			return student_id;
		}

		public void setStudent_id(String student_id) {
			this.student_id = student_id;
		}

}
