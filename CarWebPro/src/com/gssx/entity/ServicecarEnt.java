package com.gssx.entity;

public class ServicecarEnt {
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public ServicecarEnt() {
		super();
	}
	public ServicecarEnt(int carId, String carName, String carImg) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.carImg = carImg;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	@Override
	public String toString() {
		return "servicecar [carId=" + carId + ", carName=" + carName + ", carImg=" + carImg + "]";
	}
	public String getCarImg() {
		return carImg;
	}
	public void setCarImg(String carImg) {
		this.carImg = carImg;
	}
	private int carId;
	private String carName;
	private String carImg;
}
