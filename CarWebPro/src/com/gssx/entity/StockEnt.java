package com.gssx.entity;

public class StockEnt {
		
	private int partsId;
	private String partsName;
	private String brand;
	private double enterprise;
	private String imge;
	private String carType;
	private String typeNum;
	private double  price;
	private String effect;
	private int num;
	public int getPartsId() {
		return partsId;
	}
	public void setPartsId(int partsId) {
		this.partsId = partsId;
	}
	public String getPartsName() {
		return partsName;
	}
	public void setPartsName(String partsName) {
		this.partsName = partsName;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getEnterprise() {
		return enterprise;
	}
	public void setEnterprise(double enterprise) {
		this.enterprise = enterprise;
	}
	public String getImge() {
		return imge;
	}
	public void setImge(String imge) {
		this.imge = imge;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public String getTypeNum() {
		return typeNum;
	}
	public void setTypeNum(String typeNum) {
		this.typeNum = typeNum;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getEffect() {
		return effect;
	}
	public void setEffect(String effect) {
		this.effect = effect;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public StockEnt(int partsId, String partsName, String brand, double enterprise, String imge, String carType,
			String typeNum, double price, String effect, int num) {
		super();
		this.partsId = partsId;
		this.partsName = partsName;
		this.brand = brand;
		this.enterprise = enterprise;
		this.imge = imge;
		this.carType = carType;
		this.typeNum = typeNum;
		this.price = price;
		this.effect = effect;
		this.num = num;
	}
	public StockEnt(String partsName, String brand, double enterprise, String imge, String carType,
			String typeNum, double price, String effect, int num) {
		super();
		this.partsName = partsName;
		this.brand = brand;
		this.enterprise = enterprise;
		this.imge = imge;
		this.carType = carType;
		this.typeNum = typeNum;
		this.price = price;
		this.effect = effect;
		this.num = num;
	}	
	public StockEnt() {
		super();
	}
	@Override
	public String toString() {
		return "stockEnt [partsId=" + partsId + ", partsName=" + partsName + ", brand=" + brand + ", enterprise="
				+ enterprise + ", imge=" + imge + ", carType=" + carType + ", typeNum=" + typeNum + ", price=" + price
				+ ", effect=" + effect + ", num=" + num + "]";
	}
   

}
