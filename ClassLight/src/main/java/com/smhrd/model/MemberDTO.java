package com.smhrd.model;

public class MemberDTO {
	
	private String name;
	private String id;
	private String pw;
	private String birth;
	
	public MemberDTO(String name, String id, String pw, String birth) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.birth = birth;
		
	}
		public String getName() {
			return name;
		}
		
		
		public void setName(String name) {
			this.name = name;
		}
		
		
		public String getId() {
			return id;
		}
		
		
		public void setId(String id) {
			this.id = id;
		}
		
		
		public String getPw() {
			return pw;
		}
		
		
		public void setPw(String pw) {
			this.pw = pw;
		}
		
		
		public String getBirth() {
			return birth;
		}
		
		
		public void setBirth(String birth) {
			this.birth = birth;
		}
		
		
		


}
