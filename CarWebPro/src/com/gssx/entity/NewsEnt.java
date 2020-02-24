package com.gssx.entity;

public class NewsEnt {
	private int newsId;
	private String tiltle;
	private String countent;
	private String releaseTime;
	private int staffId;
	public int getNewsId() {
		return newsId;
	}

	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}

	public String getTiltle() {
		return tiltle;
	}

	public void setTiltle(String tiltle) {
		this.tiltle = tiltle;
	}

	public String getCountent() {
		return countent;
	}

	public void setCountent(String countent) {
		this.countent = countent;
	}

	public String getReleaseTime() {
		return releaseTime;
	}

	public void setReleaseTime(String releaseTime) {
		this.releaseTime = releaseTime;
	}

	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	

	@Override
	public String toString() {
		return "newsEnt [newsId=" + newsId + ", tiltle=" + tiltle + ", countent=" + countent + ", releaseTime="
				+ releaseTime + ", staffId=" + staffId + "]";
	}

	public NewsEnt() {
		super();
	}
	
	

	public NewsEnt(String tiltle, String countent, String releaseTime, int staffId) {
		super();
		this.tiltle = tiltle;
		this.countent = countent;
		this.releaseTime = releaseTime;
		this.staffId = staffId;
	}

	public NewsEnt(int newsId, String tiltle, String countent, String releaseTime, int staffId) {
		super();
		this.newsId = newsId;
		this.tiltle = tiltle;
		this.countent = countent;
		this.releaseTime = releaseTime;
		this.staffId = staffId;
	}

}
