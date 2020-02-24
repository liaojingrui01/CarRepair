package com.gssx.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;


import com.gssx.entity.StockEnt;

public interface IStockDao {
	
	
	
	public boolean saveStock(StockEnt stoEnt);
	public boolean deleteStock(int partsId);
	public boolean updateStock(StockEnt stoEnt);
	//��ѯ ���� ���� �˿�ʵ�����
	public StockEnt queryCus(StockEnt stoEnt);
	/**
	 * ��ѯ������� ʹ�� ������Ϊ���ؽ�� ��Ŷ���˿Ͷ���
	 * 	list  map  set �ӿ�===> ÿ���ӿ� ��Ӧ����ʵ����;
	 */
	public List<StockEnt> queryList(StockEnt stoEnt);
	
	
	/**
	    * ������ѯ ��� �������� ���뼯����
	 */
	public List<Map<String, Object>> querCusAndAddres();
	/**
	 * ͨ��ID��ȡ ��������
	 * @param cus_id
	 * @return
	 */
	public StockEnt queryById(int sto_Id);
}
