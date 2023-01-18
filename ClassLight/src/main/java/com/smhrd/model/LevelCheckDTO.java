package com.smhrd.model;

public class LevelCheckDTO {
	
	// 난이도 체크 테이블 
	public class levelcheck_db {

	    // 클릭 순번 
	    private Double click_seq;

	    // 학생 아이디 
	    private String std_id;

	    // 빨강 버튼 클릭 
	    private String red_click;

	    // 주황 버튼 클릭 
	    private String orange_click;

	    // 녹색 버튼 클릭 
	    private String green_click;

	    // 문제 순번 
	    private Double q_seq;

	    // 클릭 시간 
	    // ** db 에서는 number로 되어있음 java 에선 int 로 타입변경 했음!!
	    private int click_time;
	    
	    
        // 기본생성자
	    public levelcheck_db() {
			super();
		}

		public Double getClickSeq() {
	        return click_seq;
	    }

	    public void setClickSeq(Double click_seq) {
	        this.click_seq = click_seq;
	    }

	    public String getStdId() {
	        return std_id;
	    }

	    public void setStdId(String std_id) {
	        this.std_id = std_id;
	    }

	    public String getRedClick() {
	        return red_click;
	    }

	    public void setRedClick(String red_click) {
	        this.red_click = red_click;
	    }

	    public String getOrangeClick() {
	        return orange_click;
	    }

	    public void setOrangeClick(String orange_click) {
	        this.orange_click = orange_click;
	    }

	    public String getGreenClick() {
	        return green_click;
	    }

	    public void setGreenClick(String green_click) {
	        this.green_click = green_click;
	    }

	    public Double getQSeq() {
	        return q_seq;
	    }

	    public void setQSeq(Double q_seq) {
	        this.q_seq = q_seq;
	    }

	    public  int getClickTime() {
	        return click_time;
	    }

	    public void setClickTime(int click_time) {
	        this.click_time = click_time;
	    }

	   
	}

}
