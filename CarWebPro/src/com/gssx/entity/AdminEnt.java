package com.gssx.entity;

import java.sql.Date;

public class AdminEnt {
	private int adminId         ;
	private String loginName    ;
	private String loginPwd     ;
	private String adminName    ;
	private String post         ;
	private String tel          ;
	private int creatTime       ;
	private Date remark         ;
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginPwd() {
		return loginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getCreatTime() {
		return creatTime;
	}
	public void setCreatTime(int creatTime) {
		this.creatTime = creatTime;
	}
	public Date getRemark() {
		return remark;
	}
	public void setRemark(Date remark) {
		this.remark = remark;
	}
	public AdminEnt(int adminId, String loginName, String loginPwd, String adminName, String post, String tel,
			int creatTime, Date remark) {
		super();
		this.adminId = adminId;
		this.loginName = loginName;
		this.loginPwd = loginPwd;
		this.adminName = adminName;
		this.post = post;
		this.tel = tel;
		this.creatTime = creatTime;
		this.remark = remark;
	}
	public AdminEnt() {
		super();
	}
	
	public AdminEnt(String loginName, String loginPwd) {
		super();
		this.loginName = loginName;
		this.loginPwd = loginPwd;
	}
	@Override
	public String toString() {
		return "adminEnt [adminId=" + adminId + ", loginName=" + loginName + ", loginPwd=" + loginPwd + ", adminName="
				+ adminName + ", post=" + post + ", tel=" + tel + ", creatTime=" + creatTime + ", remark=" + remark
				+ "]";
	}
	public AdminEnt(String loginName, String loginPwd,String adminName) {
		super();
		this.loginName = loginName;
		this.loginPwd = loginPwd;
		this.adminName=adminName;
	}


}
