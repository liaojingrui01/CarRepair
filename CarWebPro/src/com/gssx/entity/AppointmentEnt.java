package com.gssx.entity;

import java.util.Date;

public class AppointmentEnt {

	private  int userId;
	private  String userName;
	private  String sex;
	private  String carBrand;
	private  int carId;
	private  String tel;
	private  String appointmentTime;
	private  int serviceId;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCarBrand() {
		return carBrand;
	}
	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAppointmentTime() {
		return appointmentTime;
	}
	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}
	public int getServiceId() {
		return serviceId;
	}
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}
	
	
	public AppointmentEnt() {
		super();
	}
	
	
	public AppointmentEnt(int userId, String userName, String sex, String carBrand, int carId, String tel,
			String appointmentTime, int serviceId) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.sex = sex;
		this.carBrand = carBrand;
		this.carId = carId;
		this.tel = tel;
		this.appointmentTime = appointmentTime;
		this.serviceId = serviceId;
	}
	
	
	public AppointmentEnt(String userName, String sex, String carBrand, int carId, String tel, String appointmentTime,
			int serviceId) {
		super();
		this.userName = userName;
		this.sex = sex;
		this.carBrand = carBrand;
		this.carId = carId;
		this.tel = tel;
		this.appointmentTime = appointmentTime;
		this.serviceId = serviceId;
	}
	@Override
	public String toString() {
		return "appointmentEnt [userId=" + userId + ", userName=" + userName + ", sex=" + sex + ", carBrand=" + carBrand
				+ ", carId=" + carId + ", tel=" + tel + ", appointmentTime=" + appointmentTime + ", serviceId="
				+ serviceId + "]";
	}
	
	
	
}
