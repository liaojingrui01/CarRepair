package com.gssx.text;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

import com.gssx.dao.IBannerImgDao;
import com.gssx.dao.impl.BannerDaoImpl;
import com.gssx.entity.BannerImgEnt;


public class BannnerImgText {
	// 入口函数
		public static void main(String[] args) throws ParseException {
			
			//调用测试方法
			BannnerImgText at = new BannnerImgText();
			//at.queryCusEnt();
//			at.delete();
			//at.saveBan();
			//at.UpdateBan();
			at.queryList();
		}
		
		//查询 集合列表数据
		public void queryList() {
			//获得接口对象
			IBannerImgDao banImpl = new BannerDaoImpl();
			
			//调用 列表查询方法
			BannerImgEnt bent = new BannerImgEnt();
			List<BannerImgEnt> list = banImpl.queryList(bent);
			
			//遍历输出 数据
			for (BannerImgEnt ben : list) {
				
				System.out.println(ben.getBannerName());
				
				System.out.println(ben.toString());
			}
		}
		
		//删除 数据
		public void delete() {
			IBannerImgDao cusImpl = new BannerDaoImpl();
			boolean bool=cusImpl.deleteBan(7);
			if(bool) {
				System.out.println("成功");
			}else {
				System.out.println("失败");
			}
		}
	
		//按照ID查询
		public void queryBan() {
			//同接口 获得 实现类对象
			IBannerImgDao banImpl = new BannerDaoImpl();
			//调用方法
			BannerImgEnt banEnt= banImpl.queryById(4);
			//遍历数据
			System.out.println(banEnt.toString());
			
		}
	
		
		//保存方法
		public void saveBan(){
			//获取 接口 对象
			IBannerImgDao banImpl = new BannerDaoImpl();
			//将字符串 转换为 date 数据类型
			/*
			 * SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); Date
			 * begTime = sdf.parse("2015-10-8 12:15:25"); Date endTime =
			 * sdf.parse("2015-10-8 12:15:25");
			 */
			
			//创建 实体对象
			//BannerImgEnt banEnt = new BannerImgEnt(2,"王狗蛋","王蛋蛋");
			BannerImgEnt banEnt = new BannerImgEnt();
			banEnt.setBannerImg("王狗蛋");
			banEnt.setBannerName("王蛋蛋");
			//执行保存方法
			boolean bool = banImpl.saveBan(banEnt);
			if (bool) {
				System.out.println("保存 顾客 数据 成功！！！");
			}else {
				System.out.println("保存失败！！！");
			}
		}

      
		//更改方法
		public void UpdateBan() {
			IBannerImgDao banImpl = new BannerDaoImpl();
			BannerImgEnt banEnt = new BannerImgEnt(3,"111","111");
			boolean bool = banImpl.updateBan(banEnt);
			if (bool) {
				System.out.println("更改 顾客 数据 成功！！！");
			}else {
				System.out.println("更改失败！！！");
			}
			
		}
}
//
///**
//   * 查询单个对象方法
// */
//public void queryCusEnt() {
//	//同接口 获得 实现类对象
//	IBannerImgDao cusImpl = new BannerDaoImpl();
//	
//	CustomerEnt cuen= new CustomerEnt();
//	cuen.setLast_name("BOX");
//	//查询对象
//	CustomerEnt cusEnt = cusImpl.queryCus(cuen);
//	
//	System.out.println("cusEnt===>"+cusEnt.toString());
//	
//}
//