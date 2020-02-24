package com.gssx.dao;

import java.util.List;

import com.gssx.entity.AppointmentEnt;


public interface IAppointmentDao {
	/**
	 * ���ԤԼ��Ϣ
	 * @param cusEnt
	 * @return
	 */
	public boolean saveCus(AppointmentEnt appEnt);
	
	/**
	 * ɾ��ԤԼ��Ϣ
	 * @param customer_id
	 * @return
	 */
	public boolean deleteCus(int userId);
	
	/**
	 * �޸�ԤԼ��Ϣ
	 * @param cusEnt
	 * @return
	 */
	public boolean updateCus(AppointmentEnt appEnt);
	
	/**
	 * ����ԤԼ��Ϣ
	 * @param AppName
	 * @return
	 */
	public AppointmentEnt queryByName(String  AppName);
	
	
	public List<AppointmentEnt> queryList(AppointmentEnt cusEnt);
	public AppointmentEnt queryById(int userId);

}
