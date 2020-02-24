package com.gssx.entity;

public class OutstockEnt {

private int	outId;
private String	takeName;
private String	outTime;
private String	outReason;
private int	partsId  ;
private int	outNum   ;
public int getOutId() {
	return outId;
}
public void setOutId(int outId) {
	this.outId = outId;
}
public String getTakeName() {
	return takeName;
}
public void setTakeName(String takeName) {
	this.takeName = takeName;
}
public String getOutTime() {
	return outTime;
}
public void setOutTime(String outTime) {
	this.outTime = outTime;
}
public String getOutReason() {
	return outReason;
}
public void setOutReason(String outReason) {
	this.outReason = outReason;
}
public int getPartsId() {
	return partsId;
}
public void setPartsId(int partsId) {
	this.partsId = partsId;
}
public int getOutNum() {
	return outNum;
}
public void setOutNum(int outNum) {
	this.outNum = outNum;
}

public OutstockEnt() {
	super();
}

public OutstockEnt(int outId, String takeName, String outTime, String outReason, int partsId, int outNum) {
	super();
	this.outId = outId;
	this.takeName = takeName;
	this.outTime = outTime;
	this.outReason = outReason;
	this.partsId = partsId;
	this.outNum = outNum;
}

@Override
public String toString() {
	return "OutstockEnt [outId=" + outId + ", takeName=" + takeName + ", outTime=" + outTime + ", outReason="
			+ outReason + ", partsId=" + partsId + ", outNum=" + outNum + "]";
}


}
