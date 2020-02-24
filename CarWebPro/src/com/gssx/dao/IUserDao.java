package com.gssx.dao;

import com.gssx.entity.AdminEnt;

public interface IUserDao {
	
	public AdminEnt queryAdmin(String name,String pwd);

	
	public AdminEnt queryAdmin(int adminId);
	
	//.......
}
