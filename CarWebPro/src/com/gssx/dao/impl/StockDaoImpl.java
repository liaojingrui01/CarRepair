package com.gssx.dao.impl;




import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.gssx.dao.IStockDao;
import com.gssx.util.DBUtils;

import com.gssx.entity.StockEnt;

public class StockDaoImpl implements IStockDao {
	
	DBUtils db = new DBUtils();

	@Override
	public boolean saveStock(StockEnt stoEnt) {

		        //定义链接对象
				Connection conn = null;
				//定义预编译类
				PreparedStatement ps = null;
				//定义取出数据的 结果集
				ResultSet rs = null;
				//成功 失败状态
				boolean bool = false;
				//定义 需要执行的sql 语句
				String sql = "insert into stock(partsName,brand,enterprise,imge,carType,typeNum,price,effect,num)"
						   + " VALUES (?,?,?,?,?,?,?,?,?)";//,?,?,?,?,?   ,email,address_id,active,create_date,last_update
				//链接数据库 预编译执行
				conn = db.conn();
				try {
					ps = conn.prepareStatement(sql);
					//赋值
				
					ps.setString(1, stoEnt.getPartsName());
					ps.setString(2, stoEnt.getBrand());
					ps.setDouble(3, stoEnt.getEnterprise());
					ps.setString(4, stoEnt.getImge());
					ps.setString(5, stoEnt.getCarType());
					ps.setString(6, stoEnt.getTypeNum());
					ps.setDouble(7, stoEnt.getPrice());
					ps.setString(8, stoEnt.getEffect());
					ps.setInt(9, stoEnt.getNum());
				
					/*
					 * ps.setString(4, cusEnt.getEmail()); ps.setInt(5, cusEnt.getAddress_id());
					 * ps.setInt(6, cusEnt.getActive()); ps.setString(7, cusEnt.getCreate_date());
					 * ps.setString(8, cusEnt.getLast_update());
					 */
					//判断是否 执行成功
					int upNum = ps.executeUpdate();
					if(upNum>0) {
						bool = true;
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return bool;
	}

	@Override
	public boolean deleteStock(int partsId) {
		//定 需要用到的接口 和 变量
		Connection conn = null;
		PreparedStatement ps = null;
		
		String sql = "delete from stock where partsId=?";
		boolean bool = false;
		//获得链接 执行修改操作
		conn = db.conn();
		try {
			//预编译 
			ps = conn.prepareStatement(sql);
			// 给sql语句 的问号 赋值
			ps.setInt(1, partsId);
			//执行 修操作
			int renum = ps.executeUpdate();
			if (renum>0) {
				bool = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bool;
	}

	@Override
	public boolean updateStock(StockEnt stoEnt) {
		//定 需要用到的接口 和 变量
		Connection conn = null;
		PreparedStatement ps = null;
		
		String sql = "update stock set \r\n" + 
				"	partsName   =?,\r\n" + 
				"	brand =?,\r\n" + 
				"	enterprise  =?,\r\n" + 
				"	imge      =?,\r\n" + 
				"	carType =?,\r\n" + 
				"	typeNum     =?,\r\n" + 
				"	price     =?,\r\n" + 
				"	effect=?,\r\n" + 
				"	num=? WHERE partsId=?";
		
		boolean bool = false;
		
		//获得链接 执行修改操作
		conn = db.conn();
		
		try {
			//预编译 
			ps = conn.prepareStatement(sql);
			// 给sql语句 的问号 赋值
			
			ps.setString(1, stoEnt.getPartsName());
			ps.setString(2, stoEnt.getBrand());
			ps.setDouble(3, stoEnt.getEnterprise());
			ps.setString(4, stoEnt.getImge());
			ps.setString(5, stoEnt.getCarType());
			ps.setString(6, stoEnt.getTypeNum());
			ps.setDouble(7, stoEnt.getPrice());
			ps.setString(8, stoEnt.getEffect());
			ps.setInt(9, stoEnt.getNum());
			ps.setInt(10, stoEnt.getPartsId());
			
			//执行 修操作
			int renum = ps.executeUpdate();
			if (renum>0) {
				bool = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return bool;
	}

	@Override
	public StockEnt queryCus(StockEnt stoEnt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StockEnt> queryList(StockEnt stoEnt) {
		//定义接口变量
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		//定义sql语句
		String sql = "select * from stock";
		//定义返回的数据集合
		List<StockEnt> list = new ArrayList<StockEnt>();
		//开始连接查询
		conn =	db.conn();
		try {
			ps = conn.prepareStatement(sql);
			//赋值操作
			//ps.setString(parameterIndex, x);
			//执行操作
			rs = ps.executeQuery();
			while(rs.next()) {
				//将查询的数据 存入 cusent对象中
				StockEnt stoent = new StockEnt(
						 rs.getInt("partsId"),  
						 rs.getString("partsName"),  
						 rs.getString("brand"), 
						 rs.getDouble("enterprise"), 
						 rs.getString("imge"), 
						 rs.getString("carType"),
						 rs.getString("typeNum"), 
						 rs.getDouble("price"),
						 rs.getString("effect"), 
						 rs.getInt("num"));
				//将map对象 存入 list 集合中;
				list.add(stoent);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			db.closeDB(rs, ps, conn);
		}
		//返回 结果集
		return list;
	}


	@Override
	public List<Map<String, Object>> querCusAndAddres() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StockEnt queryById(int partsId) {
		//定义接口对象
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		//定义返回的对象 
		StockEnt stoEnt = null;
		
		//定义执行的sql语句
		StringBuffer sb = new StringBuffer();
		sb.append("select * from stock where partsId=?");
		//添加其他条件
		//sb.append(" and .......");
		//通过工具类 获得对象
		conn = db.conn();
		
		try {
			 //赋值给预编译对象
			 ps = conn.prepareStatement(sb.toString());
			 //预编译对象 再给查询条件 赋值
			 ps.setInt(1, partsId);
			 //执行查询操作
			 rs=ps.executeQuery();
			 //取出  结果集中的第一条数据
			 if(rs.first()) {
				//对象赋值
				 stoEnt = new StockEnt  (rs.getInt("partsId"),  
										 rs.getString("partsName"),  
										 rs.getString("brand"), 
										 rs.getDouble("enterprise"), 
										 rs.getString("imge"), 
										 rs.getString("carType"),
										 rs.getString("typeNum"), 
										 rs.getDouble("price"),
										 rs.getString("effect"), 
										 rs.getInt("num"));
			 	}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return stoEnt;
	}
	
	

}
