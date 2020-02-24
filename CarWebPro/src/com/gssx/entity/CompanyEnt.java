package com.gssx.entity;

public class CompanyEnt {
	
private int  cmId;
private String  cmName;
private String  cmAddress;
private String  call;
private String  tell;
private String  qq;
private String  contacts;
private String  email;
private String  cope;
private String  display;

public int getCmId() {
	return cmId;
}
public void setCmId(int cmId) {
	this.cmId = cmId;
}
public String getCmName() {
	return cmName;
}
public void setCmName(String cmName) {
	this.cmName = cmName;
}
public String getCmAddress() {
	return cmAddress;
}
public void setCmAddress(String cmAddress) {
	this.cmAddress = cmAddress;
}
public String getCall() {
	return call;
}
public void setCall(String call) {
	this.call = call;
}
public String getTell() {
	return tell;
}
public void setTell(String tell) {
	this.tell = tell;
}
public String getQq() {
	return qq;
}
public void setQq(String qq) {
	this.qq = qq;
}
public String getContacts() {
	return contacts;
}
public void setContacts(String contacts) {
	this.contacts = contacts;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCope() {
	return cope;
}
public void setCope(String cope) {
	this.cope = cope;
}
public String getDisplay() {
	return display;
}
public void setDisplay(String display) {
	this.display = display;
}

public CompanyEnt() {
	super();
}

public CompanyEnt(int cmId, String cmName, String cmAddress, String call, String tell, String qq, String contacts,
		String email, String cope, String display) {
	super();
	this.cmId = cmId;
	this.cmName = cmName;
	this.cmAddress = cmAddress;
	this.call = call;
	this.tell = tell;
	this.qq = qq;
	this.contacts = contacts;
	this.email = email;
	this.cope = cope;
	this.display = display;
}

@Override
public String toString() {
	return "CompanyEnt [cmId=" + cmId + ", cmName=" + cmName + ", cmAddress=" + cmAddress + ", call=" + call + ", tell="
			+ tell + ", qq=" + qq + ", contacts=" + contacts + ", email=" + email + ", cope=" + cope + ", display="
			+ display + "]";
}


}
