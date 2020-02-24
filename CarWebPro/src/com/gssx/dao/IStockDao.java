package com.gssx.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;


import com.gssx.entity.StockEnt;

public interface IStockDao {
	
	
	
	public boolean saveStock(StockEnt stoEnt);
	public boolean deleteStock(int partsId);
	public boolean updateStock(StockEnt stoEnt);
	//查询 方法 返回 顾客实体对象
	public StockEnt queryCus(StockEnt stoEnt);
	/**
	 * 查询多个对象 使用 集合作为返回结果 存放多个顾客对象
	 * 	list  map  set 接口===> 每个接口 对应的有实现类;
	 */
	public List<StockEnt> queryList(StockEnt stoEnt);
	
	
	/**
	    * 级联查询 多个 对象数据 存入集合中
	 */
	public List<Map<String, Object>> querCusAndAddres();
	/**
	 * 通过ID获取 对象数据
	 * @param cus_id
	 * @return
	 */
	public StockEnt queryById(int sto_Id);
}
