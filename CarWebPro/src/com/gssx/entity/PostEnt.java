package com.gssx.entity;

import java.util.Date;

public class PostEnt {
	
	private int postId;
	private String postName;
	private String postings;
	private int postNum;
	private int storageId;
	private Date beginTime;
	private Date endTime;
	private String duty;
	private String address;
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public String getPostName() {
		return postName;
	}
	public void setPostName(String postName) {
		this.postName = postName;
	}
	public String getPostings() {
		return postings;
	}
	public void setPostings(String postings) {
		this.postings = postings;
	}
	public int getPostNum() {
		return postNum;
	}
	public void setPostNum(int postNum) {
		this.postNum = postNum;
	}
	public int getStorageId() {
		return storageId;
	}
	public void setStorageId(int storageId) {
		this.storageId = storageId;
	}
	public Date getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getDuty() {
		return duty;
	}
	public void setDuty(String duty) {
		this.duty = duty;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public PostEnt(int postId, String postName, String postings, int postNum, int storageId, Date beginTime,
			Date endTime, String duty, String address) {
		super();
		this.postId = postId;
		this.postName = postName;
		this.postings = postings;
		this.postNum = postNum;
		this.storageId = storageId;
		this.beginTime = beginTime;
		this.endTime = endTime;
		this.duty = duty;
		this.address = address;
	}
	public PostEnt() {
		super();
	}
	@Override
	public String toString() {
		return "PostEnt [postId=" + postId + ", postName=" + postName + ", postings=" + postings + ", postNum="
				+ postNum + ", storageId=" + storageId + ", beginTime=" + beginTime + ", endTime=" + endTime + ", duty="
				+ duty + ", address=" + address + "]";
	}
	


}
