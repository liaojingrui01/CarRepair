package com.gssx.entity;

public class StaffEnt {
	
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getStorageId() {
		return storageId;
	}
	public void setStorageId(int storageId) {
		this.storageId = storageId;
	}
	public String getCarded() {
		return carded;
	}
	public void setCarded(String carded) {
		this.carded = carded;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@Override
	public String toString() {
		return "staffEntity [staffId=" + staffId + ", staffName=" + staffName + ", tel=" + tel + ", storageId="
				+ storageId + ", carded=" + carded + ", post=" + post + ", sex=" + sex + "]";
	}

	public StaffEnt(int staffId, String staffName, String tel, int storageId, String carded, String post,
			String sex) {
		super();
		this.staffId = staffId;
		this.staffName = staffName;
		this.tel = tel;
		this.storageId = storageId;
		this.carded = carded;
		this.post = post;
		this.sex = sex;
	}

	public StaffEnt() {
		super();
	}

	private int staffId;
	private String staffName;
	private String tel;
	private int storageId;
	private String carded;
	private String post;
	private String sex;
	
}
