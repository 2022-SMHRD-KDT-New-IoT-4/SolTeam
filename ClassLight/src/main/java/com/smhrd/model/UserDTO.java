package com.smhrd.model;

// 회원 
public class UserDTO {

    // 회원 아이디 
    private String user_id;

    // 회원 패스워드 
    private String user_pw;

    // 회원 이름 
    private String user_name;

    // 회원 가입일자 
    private String user_joindate;

    // 회원 생년월일 
    private String user_birthdate;

    // 회원 포인트 
    private Double user_point;

    // 회원 유형 
    private String user_type;

    // 시리얼 넘버 
    private String serial_no;
    
    // 회원(학생) 학급
    private String user_class;
    
    // 기본 생성자
	public UserDTO() {
    }
    
    // 강사일 때 매개변수 5개 학생일 때 6개
    
    // 학급 매개변수를 뺀 dto
	public UserDTO(String user_id, String user_pw, String user_name, String user_birthdate, String user_type) {
		super();
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.user_name = user_name;
		this.user_birthdate = user_birthdate;
		this.user_type = user_type;
	}
	
	// 학급 매개변수가 표함된 dto
    public UserDTO(String user_id, String user_pw, String user_name, String user_birthdate, String user_type,
			String user_class) {
		super();
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.user_name = user_name;
		this.user_birthdate = user_birthdate;
		this.user_type = user_type;
		this.user_class = user_class;
	}
    
    // InfoStudent에 사용할 dto (매개변수 name, class)
    public UserDTO(String user_name, String user_class) {
    	super();
    	this.user_name = user_name;
    	this.user_class = user_class;
    }

	public String getUserId() {
        return user_id;
    }

    public void setUserId(String user_id) {
        this.user_id = user_id;
    }

    public String getUserPw() {
        return user_pw;
    }

    public void setUserPw(String user_pw) {
        this.user_pw = user_pw;
    }

    public String getUserName() {
        return user_name;
    }

    public void setUserName(String user_name) {
        this.user_name = user_name;
    }

    public String getUserJoindate() {
        return user_joindate;
    }

    public void setUserJoindate(String user_joindate) {
        this.user_joindate = user_joindate;
    }

    public String getUserBirthdate() {
        return user_birthdate;
    }

    public void setUserBirthdate(String user_birthdate) {
        this.user_birthdate = user_birthdate;
    }

    public Double getUserPoint() {
        return user_point;
    }

    public void setUserPoint(Double user_point) {
        this.user_point = user_point;
    }

    public String getUserType() {
        return user_type;
    }

    public void setUserType(String user_type) {
        this.user_type = user_type;
    }

    public String getSerialNo() {
        return serial_no;
    }

    public void setSerialNo(String serial_no) {
        this.serial_no = serial_no;
    }

	public String getUser_class() {
		return user_class;
	}

	public void setUser_class(String user_class) {
		this.user_class = user_class;
	}
    
    

}