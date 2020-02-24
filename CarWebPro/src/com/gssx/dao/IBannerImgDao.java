package com.gssx.dao;

import java.util.List;

import com.gssx.entity.BannerImgEnt;
import com.gssx.entity.StockEnt;

public interface IBannerImgDao {
	/**
	 * 增   删   改   查   分页  查询数据总条数   条件检索  .....
	 */
	public boolean saveBan(BannerImgEnt bannerEnt);
	public boolean deleteBan(int bannerId);
	public boolean updateBan(BannerImgEnt bannerEnt);
	//查询 方法 返回 顾客实体对象
	public IBannerImgDao queryBan(BannerImgEnt bannerEnt);
	
	/**
	 * 查询多个对象 使用 集合作为返回结果 存放多个顾客对象
	 * 	list  map  set 接口===> 每个接口 对应的有实现类;
	 */
	public List<BannerImgEnt> queryList(BannerImgEnt bannerEnt);
	
	
	/**
	    * 级联查询 多个 对象数据 存入集合中
	 */
	public List<BannerImgEnt> querylist();
	/**
	 * 通过ID获取 对象数据
	 * @param cus_id
	 * @return
	 */
	public BannerImgEnt queryById(int bannerId);


}
