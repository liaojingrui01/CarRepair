package com.gssx.entity;

public class RecruitEnt {

private int	recruitId;
private String	recruitName;
private String	sex;
private String	carded;
private String	position;

public int getRecruitId() {
	return recruitId;
}
public void setRecruitId(int recruitId) {
	this.recruitId = recruitId;
}
public String getRecruitName() {
	return recruitName;
}
public void setRecruitName(String recruitName) {
	this.recruitName = recruitName;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public String getCarded() {
	return carded;
}
public void setCarded(String carded) {
	this.carded = carded;
}
public String getPosition() {
	return position;
}
public void setPosition(String position) {
	this.position = position;
}

public RecruitEnt() {
	super();
}
public RecruitEnt(int recruitId, String recruitName, String sex, String carded, String position) {
	super();
	this.recruitId = recruitId;
	this.recruitName = recruitName;
	this.sex = sex;
	this.carded = carded;
	this.position = position;
}

@Override
public String toString() {
	return "RecruitEnt [recruitId=" + recruitId + ", recruitName=" + recruitName + ", sex=" + sex + ", carded=" + carded
			+ ", position=" + position + "]";
}


}
