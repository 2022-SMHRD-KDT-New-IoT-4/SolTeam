package com.smhrd.model;

public class QuestionDTO {

	    // 문제 순번 
	    private int q_seq;

	    // 문제 제목 
	    private String q_title;

	    // 문제 내용 
	    private String q_content;

	    // 문제풀이시간 
	    private String q_time;

	    // 문제 점수 
	    private String q_score;

	    
	    public int getQSeq() {
	        return q_seq;
	    }
	    
		public void setQSeq(int q_seq) {
	        this.q_seq = q_seq;
	    }

	    public String getQTitle() {
	        return q_title;
	    }

	    public void setQTitle(String q_title) {
	        this.q_title = q_title;
	    }

	    public String getQContent() {
	        return q_content;
	    }

	    public void setQContent(String q_content) {
	        this.q_content = q_content;
	    }

	    public String getQTime() {
	        return q_time;
	    }

	    public void setQTime(String q_time) {
	        this.q_time = q_time;
	    }

	    public String getQScore() {
	        return q_score;
	    }

	    public void setQScore(String q_score) {
	        this.q_score = q_score;
	    }

		public QuestionDTO(String q_title, String q_content, String q_time, String q_score) {
			super();
			this.q_title = q_title;
			this.q_content = q_content;
			this.q_time = q_time;
			this.q_score = q_score;
		}

		public QuestionDTO() {
			super();
		}

		
		
}
