package com.gssx.dao;

import java.util.List;

import com.gssx.entity.NewsEnt;

public interface INewsDao {
	/**
	 * ������Ϣ
	 * @param cusEnt
	 * @return
	 */
	public boolean saveCus(NewsEnt appEnt);
	
	/**
	 * ɾ����Ϣ
	 * @param customer_id
	 * @return
	 */
	public boolean deleteCus(int newsId);
	
	/**
	 * �޸���Ϣ
	 * @param cusEnt
	 * @return
	 */
	public boolean updateCus(NewsEnt newsEnt);
	
	
	
	
	public List<NewsEnt> queryList(NewsEnt newsEnt);

	public NewsEnt queryById(int newsId);
}