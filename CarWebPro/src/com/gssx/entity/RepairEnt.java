package com.gssx.entity;

import java.util.Date;

public class RepairEnt {
	
	private int repairId;
	private int userId;
	private Date repairTime;
	private String timeNum;
	private int staffId;
	private double price;
	private Date takeTime;
	private int ServiceId;
	
	public int getRepairId() {
		return repairId;
	}
	public void setRepairId(int repairId) {
		this.repairId = repairId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Date getRepairTime() {
		return repairTime;
	}
	public void setRepairTime(Date repairTime) {
		this.repairTime = repairTime;
	}
	public String getTimeNum() {
		return timeNum;
	}
	public void setTimeNum(String timeNum) {
		this.timeNum = timeNum;
	}
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getTakeTime() {
		return takeTime;
	}
	public void setTakeTime(Date takeTime) {
		this.takeTime = takeTime;
	}
	public int getServiceId() {
		return ServiceId;
	}
	public void setServiceId(int serviceId) {
		ServiceId = serviceId;
	}
	public RepairEnt(int repairId, int userId, Date repairTime, String timeNum, int staffId, double price,
			Date takeTime, int serviceId) {
		super();
		this.repairId = repairId;
		this.userId = userId;
		this.repairTime = repairTime;
		this.timeNum = timeNum;
		this.staffId = staffId;
		this.price = price;
		this.takeTime = takeTime;
		ServiceId = serviceId;
	}
	public RepairEnt() {
		super();
	}
	@Override
	public String toString() {
		return "RepairEnt [repairId=" + repairId + ", userId=" + userId + ", repairTime=" + repairTime + ", timeNum="
				+ timeNum + ", staffId=" + staffId + ", price=" + price + ", takeTime=" + takeTime + ", ServiceId="
				+ ServiceId + "]";
	}

	

}
