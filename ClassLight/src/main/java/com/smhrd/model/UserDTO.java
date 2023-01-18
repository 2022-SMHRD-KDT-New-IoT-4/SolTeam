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

    // user_tb 모델 복사
    public void CopyData(UserDTO param)
    {
        this.user_id = param.getUserId();
        this.user_pw = param.getUserPw();
        this.user_name = param.getUserName();
        this.user_joindate = param.getUserJoindate();
        this.user_birthdate = param.getUserBirthdate();
        this.user_point = param.getUserPoint();
        this.user_type = param.getUserType();
        this.serial_no = param.getSerialNo();
    }
}