package com.gssx.entity;

public class StorageEnt {
	private int storageId   ;
	private String storageName ;
	private String remark      ;
	
	
	public int getStorageId() {
		return storageId;
	}
	public void setStorageId(int storageId) {
		this.storageId = storageId;
	}
	public String getStorageName() {
		return storageName;
	}
	public void setStorageName(String storageName) {
		this.storageName = storageName;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public StorageEnt(int storageId, String storageName, String remark) {
		super();
		this.storageId = storageId;
		this.storageName = storageName;
		this.remark = remark;
	}
	public StorageEnt() {
		super();
	}
	@Override
	public String toString() {
		return "StorageEnt [storageId=" + storageId + ", storageName=" + storageName + ", remark=" + remark + "]";
	}
	
	

}
