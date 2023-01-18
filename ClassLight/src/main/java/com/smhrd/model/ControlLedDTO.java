package com.smhrd.model;

public class ControlLedDTO {
	// 학생 LED 점등 현황

	    // 점등 순번 
	    private String control_seq;

	    // 빨강 LED 
	    private String red_led;

	    // 주황 LED 
	    private String orange_led;

	    // 녹색 LED 
	    private String green_led;

	    // 학생 아이디 
	    private String student_id;

	    
	    public ControlLedDTO(String control_seq, String red_led, String orange_led, String green_led,
				String student_id) {
		}

		public ControlLedDTO() {
		}

		public String getControlSeq() {
	        return control_seq;
	    }

	    public void setControlSeq(String control_seq) {
	        this.control_seq = control_seq;
	    }

	    public String getRedLed() {
	        return red_led;
	    }

	    public void setRedLed(String red_led) {
	        this.red_led = red_led;
	    }

	    public String getOrangeLed() {
	        return orange_led;
	    }

	    public void setOrangeLed(String orange_led) {
	        this.orange_led = orange_led;
	    }

	    public String getGreenLed() {
	        return green_led;
	    }

	    public void setGreenLed(String green_led) {
	        this.green_led = green_led;
	    }

	    public String getStudentId() {
	        return student_id;
	    }

	    public void setStudentId(String student_id) {
	        this.student_id = student_id;
	    }

	}

