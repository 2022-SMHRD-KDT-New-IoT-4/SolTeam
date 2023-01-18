package com.smhrd.model;

public class UserDTO {

	    // 회원 아이디 
	    private String userId;

	    // 회원 패스워드 
	    private String userPw;

	    // 회원 이름 
	    private String userName;

	    // 회원 가입일자 
	    private String userJoindate;

	    // 회원 생년월일 
	    private String userBirthdate;

	    // 회원 포인트 
	    private Double userPoint;

	    // 회원 유형 
	    private String userType;

	    // 시리얼 넘버 
	    private String serialNo;

	    public String getUserId() {
	        return userId;
	    }

	    public void setUserId(String userId) {
	        this.userId = userId;
	    }

	    public String getUserPw() {
	        return userPw;
	    }

	    public void setUserPw(String userPw) {
	        this.userPw = userPw;
	    }

	    public String getUserName() {
	        return userName;
	    }

	    public void setUserName(String userName) {
	        this.userName = userName;
	    }

	    public String getUserJoindate() {
	        return userJoindate;
	    }

	    public void setUserJoindate(String userJoindate) {
	        this.userJoindate = userJoindate;
	    }

	    public String getUserBirthdate() {
	        return userBirthdate;
	    }

	    public void setUserBirthdate(String userBirthdate) {
	        this.userBirthdate = userBirthdate;
	    }

	    public Double getUserPoint() {
	        return userPoint;
	    }

	    public void setUserPoint(Double userPoint) {
	        this.userPoint = userPoint;
	    }

	    public String getUserType() {
	        return userType;
	    }

	    public void setUserType(String userType) {
	        this.userType = userType;
	    }

	    public String getSerialNo() {
	        return serialNo;
	    }

	    public void setSerialNo(String serialNo) {
	        this.serialNo = serialNo;
	    }

		public UserDTO(String userId, String userPw, String userName, String userBirthdate) {
			super();
			this.userId = userId;
			this.userPw = userPw;
			this.userName = userName;
			this.userBirthdate = userBirthdate;
		}
}
