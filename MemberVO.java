package edu.web.homework;

public class MemberVO {
	// 주의) useBean을 위한 VO를 생성할 경우, parameter name과 변수명이 같아야 함
	private String userId;
	private String password;
	private String email;
	private String emailAgree;
	private String[] interest;
	private String phone;
	
	// 기본 생성자
	public MemberVO() {
	}

	// getter/setter
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmailAgree() {
		return emailAgree;
	}

	public void setEmailAgree(String emailAgree) {
		this.emailAgree = emailAgree;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}	
	
	public String[] getInterest() {
		return interest;
	}
	
	public String getInterestJoin() {
		return (interest == null) ? "없음" : String.join(", ", interest);
	}

	public void setInterest(String[] interest) {
		this.interest = interest;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	private String introduce;
}
