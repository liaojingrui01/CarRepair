package com.gssx.entity;

import java.util.Date;

public class LeavingEnt {
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getLeaveName() {
		return leaveName;
	}
	public void setLeaveName(String leaveName) {
		this.leaveName = leaveName;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getCountent() {
		return countent;
	}
	public void setCountent(String countent) {
		this.countent = countent;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
	@Override
	public String toString() {
		return "leavingEntity [contactId=" + contactId + ", leaveName=" + leaveName + ", tel=" + tel + ", countent="
				+ countent + ", time=" + time + "]";
	}
	
	public LeavingEnt(int contactId, String leaveName, String tel, String countent, Date time) {
		super();
		this.contactId = contactId;
		this.leaveName = leaveName;
		this.tel = tel;
		this.countent = countent;
		this.time = time;
	}

	public LeavingEnt() {
		super();
	}

	private int contactId;
	private String leaveName;
	private String tel;
	private String countent;
	private Date time;

}
