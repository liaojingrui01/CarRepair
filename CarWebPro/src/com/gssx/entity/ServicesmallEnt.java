package com.gssx.entity;

public class ServicesmallEnt {
	private int serviceId;
	private String serviceName;
	private double price;
	private String remark;
	private String serviceType;

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	@Override
	public String toString() {
		return "servicesmallEnt [serviceId=" + serviceId + ", serviceName=" + serviceName + ", price=" + price
				+ ", remark=" + remark + ", serviceType=" + serviceType + "]";
	}

	public ServicesmallEnt() {
		super();
	}

	public ServicesmallEnt(int serviceId, String serviceName, double price, String remark, String serviceType) {
		super();
		this.serviceId = serviceId;
		this.serviceName = serviceName;
		this.price = price;
		this.remark = remark;
		this.serviceType = serviceType;
	}

}
