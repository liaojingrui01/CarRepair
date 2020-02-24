package com.gssx.entity;

import java.sql.Date;

public class InstockEnt {
	
private int	inId       ;
private String	inName     ;
private Date	inTime     ;
private int	partsId    ;
private int	inNum      ;

public int getInId() {
	return inId;
}
public void setInId(int inId) {
	this.inId = inId;
}
public String getInName() {
	return inName;
}
public void setInName(String inName) {
	this.inName = inName;
}
public Date getInTime() {
	return inTime;
}
public void setInTime(Date inTime) {
	this.inTime = inTime;
}
public int getPartsId() {
	return partsId;
}
public void setPartsId(int partsId) {
	this.partsId = partsId;
}
public int getInNum() {
	return inNum;
}
public void setInNum(int inNum) {
	this.inNum = inNum;
}
public InstockEnt(int inId, String inName, Date inTime, int partsId, int inNum) {
	super();
	this.inId = inId;
	this.inName = inName;
	this.inTime = inTime;
	this.partsId = partsId;
	this.inNum = inNum;
}
public InstockEnt() {
	super();
}
@Override
public String toString() {
	return "instockEnt [inId=" + inId + ", inName=" + inName + ", inTime=" + inTime + ", partsId=" + partsId
			+ ", inNum=" + inNum + "]";
}


}
