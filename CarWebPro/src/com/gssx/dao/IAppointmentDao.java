package com.gssx.dao;

import java.util.List;

import com.gssx.entity.AppointmentEnt;


public interface IAppointmentDao {
	/**
	 * 添加预约信息
	 * @param cusEnt
	 * @return
	 */
	public boolean saveCus(AppointmentEnt appEnt);
	
	/**
	 * 删除预约信息
	 * @param customer_id
	 * @return
	 */
	public boolean deleteCus(int userId);
	
	/**
	 * 修改预约信息
	 * @param cusEnt
	 * @return
	 */
	public boolean updateCus(AppointmentEnt appEnt);
	
	/**
	 * 查找预约信息
	 * @param AppName
	 * @return
	 */
	public AppointmentEnt queryByName(String  AppName);
	
	
	public List<AppointmentEnt> queryList(AppointmentEnt cusEnt);
	public AppointmentEnt queryById(int userId);

}
