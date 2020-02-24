package com.gssx.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.gssx.dao.IAppointmentDao;
import com.gssx.entity.AppointmentEnt;

import com.gssx.entity.AppointmentEnt;
import com.gssx.util.DBUtils;

public class AppointmentDaoImpl implements IAppointmentDao{
	
	//获取数据 库链接 公共类
		DBUtils db = new DBUtils();

	@Override
	public boolean saveCus(AppointmentEnt appEnt) {
		//定义链接对象
				Connection conn = null;
				//定义预编译类
				PreparedStatement ps = null;
				//定义取出数据的 结果集
				ResultSet rs = null;
				//成功 失败状态
				boolean bool = false;
				//定义 需要执行的sql 语句
				String sql = "INSERT INTO appointment (userName, sex, carBrand, carId,tel,appointmentTime,serviceId)\r\n" + 
						"VALUES (?,?,?,?,?,?,?)";
				//链接数据库 预编译执行
				conn = db.conn();
				try {
					ps = conn.prepareStatement(sql);
					//赋值
					ps.setString(1, appEnt.getUserName());
					ps.setString(2, appEnt.getSex());
					ps.setString(3, appEnt.getCarBrand());
					ps.setInt(4, appEnt.getCarId());
					ps.setString(5, appEnt.getTel());
					ps.setString(6, appEnt.getAppointmentTime());
					ps.setInt(7, appEnt.getServiceId());
				
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
	public boolean deleteCus(int userId) {//定 需要用到的接口 和 变量
		Connection conn = null;
		PreparedStatement ps = null;
		
		String sql = "delete from appointment where userId=?";
		boolean bool = false;
		//获得链接 执行修改操作
		conn = db.conn();
		try {
			//预编译 
			ps = conn.prepareStatement(sql);
			// 给sql语句 的问号 赋值
			ps.setInt(1, userId);
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
	public boolean updateCus(AppointmentEnt appEnt) {//定 需要用到的接口 和 变量
		Connection conn = null;
		PreparedStatement ps = null;
		

		
		String sql = "update appointment set \r\n" + 
				"    userName =?,\r\n" + 
				"		sex =?,\r\n" + 
				"		carBrand=?,\r\n" + 
				"		carId =?,\r\n" + 
				"		tel =?,\r\n" + 
				"		appointmentTime =?,\r\n" + 
				"		serviceId =? WHERE userId=?";
		
		boolean bool = false;
		
		//获得链接 执行修改操作
		conn = db.conn();
		
		try {
			//预编译 
			ps = conn.prepareStatement(sql);
			// 给sql语句 的问号 赋值
			ps.setString(1, appEnt.getUserName());
			ps.setString(2, appEnt.getSex());
			ps.setString(3, appEnt.getCarBrand());
			ps.setInt(4, appEnt.getCarId());
			ps.setString(5, appEnt.getTel());
			ps.setString(6, appEnt.getAppointmentTime());
			ps.setInt(7, appEnt.getServiceId());
			
			ps.setInt(8, appEnt.getUserId());
			
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
	public AppointmentEnt queryByName(String AppName) {//定义接口对象
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		//定义返回的对象 
		AppointmentEnt retEnt = null;
		
		//定义执行的sql语句
		StringBuffer sb = new StringBuffer();
		sb.append("select * from appointment where userName=?");
		//添加其他条件
		//sb.append(" and .......");
		//通过工具类 获得对象
		conn = db.conn();

	
		try {
			 //赋值给预编译对象
			 ps = conn.prepareStatement(sb.toString());
			 //预编译对象 再给查询条件 赋值
			 ps.setString(1, AppName);
			 //执行查询操作
			 rs=ps.executeQuery();
			 //取出  结果集中的第一条数据
			 if(rs.first()) {
				//对象赋值
				retEnt = new AppointmentEnt(rs.getString("userName"),  
										    rs.getString("sex"),  
										 rs.getString("carBrand"), 
										 rs.getInt("carId"), 
										 rs.getString("tel"), 
										    rs.getString("appointmentTime"), 
										    rs.getInt("serviceId") );
			 	}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return retEnt;
	}
	public List<AppointmentEnt> queryList(AppointmentEnt cusEnt) {
		//定义接口变量
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		//定义sql语句
		String sql = "select * from appointment";
		//定义返回的数据集合
		List<AppointmentEnt> list = new ArrayList<AppointmentEnt>();
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
		

				AppointmentEnt cusent = new AppointmentEnt(
						rs.getInt("userId"),  
						 rs.getString("userName"),  
						 rs.getString("sex"), 
						 rs.getString("carBrand"), 
						 rs.getInt("carId"), 
						 rs.getString("tel"), 
						 rs.getString("appointmentTime"),
						 rs.getInt("serviceId")
						 );
				//将map对象 存入 list 集合中;
				list.add(cusent);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			db.closeDB(rs, ps, conn);
		}
		//返回 结果集
		return list;
	}
	public AppointmentEnt queryById(int userId) {
		//定义接口对象
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		//定义返回的对象 
		AppointmentEnt retEnt = null;
		
		//定义执行的sql语句
		StringBuffer sb = new StringBuffer();
		sb.append("select * from appointment where userId=?");
		//添加其他条件
		//sb.append(" and .......");
		//通过工具类 获得对象
		conn = db.conn();
		
		try {
			 //赋值给预编译对象
			 ps = conn.prepareStatement(sb.toString());
			 //预编译对象 再给查询条件 赋值
			 ps.setInt(1, userId);
			 //执行查询操作
			 rs=ps.executeQuery();
			 //取出  结果集中的第一条数据
			 if(rs.first()) {
				//对象赋值
				retEnt = new AppointmentEnt(rs.getInt("userId"),  
										 rs.getString("userName"),  
										 rs.getString("sex"), 
										 rs.getString("carBrand"), 
										 rs.getInt("carId"), 
										 rs.getString("tel"), 
										 rs.getString("appointmentTime"),
										 rs.getInt("serviceId"));
			 	}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return retEnt;
	}
}
