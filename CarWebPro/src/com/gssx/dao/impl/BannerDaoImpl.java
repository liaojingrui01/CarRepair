package com.gssx.dao.impl;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gssx.dao.IBannerImgDao;
import com.gssx.entity.BannerImgEnt;
import com.gssx.entity.BannerImgEnt;
import com.gssx.util.DBUtils;


public class BannerDaoImpl implements IBannerImgDao {
	 //获取数据 库链接 公共类
	DBUtils db = new DBUtils();
		
	@Override
	public boolean saveBan(BannerImgEnt bannerEnt) {
		//定义链接对象
		java.sql.Connection conn = null;
		//定义预编译类
		PreparedStatement ps = null;
		//定义取出数据的 结果集
		ResultSet rs = null;
		//成功 失败状态
		boolean bool = false;
		//定义 需要执行的sql 语句
		String sql = "insert into bannerImg(bannerName,bannerImg ) VALUES (?,?)";
		//链接数据库 预编译执行
		conn = db.conn();
		try {
			ps = conn.prepareStatement(sql);
			//赋值
			ps.setString(1, bannerEnt.getBannerName());
			ps.setString(2, bannerEnt.getBannerImg());
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
	public boolean deleteBan(int bannerId) {
		//定 需要用到的接口 和 变量
				java.sql.Connection conn = null;
				PreparedStatement ps = null;
				
				String sql = "delete from bannerImg where BannerId=?";
				boolean bool = false;
				//获得链接 执行修改操作
				conn = db.conn();
				try {
					//预编译 
					ps = conn.prepareStatement(sql);
					// 给sql语句 的问号 赋值
					ps.setInt(1, bannerId);
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
	public boolean updateBan(BannerImgEnt bannerEnt) {
		//定 需要用到的接口 和 变量
		       Connection conn = null;
				PreparedStatement ps = null;
				String sql = "update bannerImg set bannerName=?, bannerImg=?  WHERE bannerId=?";
				
				boolean bool = false;
				
				//获得链接 执行修改操作
				conn = db.conn();
				
				try {
					//预编译 
					ps =conn.prepareStatement(sql);
					// 给sql语句 的问号 赋值
					ps.setString(1, bannerEnt.getBannerName());
					ps.setString(2, bannerEnt.getBannerImg());
					ps.setInt(3, bannerEnt.getBannerId());
					
					//执行 修改操作
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
	public IBannerImgDao queryBan(BannerImgEnt bannerEnt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BannerImgEnt> queryList(BannerImgEnt bannerEnt) {
		//定义接口变量
				Connection conn = null;
				PreparedStatement ps = null;
				ResultSet rs = null;
				
				//定义sql语句
				String sql = "select * from bannerImg";
				//定义返回的数据集合
				List<BannerImgEnt> list = new ArrayList<BannerImgEnt>();
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
						BannerImgEnt cusent = new BannerImgEnt(
								rs.getInt("bannerId"),  
								 rs.getString("bannerName"), 
								 rs.getString("bannerImg"));
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

	@Override
	public List<BannerImgEnt> querylist() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BannerImgEnt queryById(int bannerId) {
		//定义接口对象
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		//定义返回的对象 
		BannerImgEnt retEnt = null;
		
		//定义执行的sql语句
		StringBuffer sb = new StringBuffer();
		sb.append("select * from bannerImg where bannerId=?");
		//添加其他条件
		//sb.append(" and .......");
		//通过工具类 获得对象
		conn = (Connection) db.conn();
		
		try {
			 //赋值给预编译对象
			 ps = ((java.sql.Connection) conn).prepareStatement(sb.toString());
			 //预编译对象 再给查询条件 赋值
			 ps.setInt(1, bannerId);
			 //执行查询操作
			 rs=ps.executeQuery();
			 //取出  结果集中的第一条数据
			 if(rs.first()) {
				//对象赋值
				retEnt = new BannerImgEnt(rs.getInt("BannerId"),  
									
										 rs.getString("BannerImg"), 
										 rs.getString("BannerName"));
			 	}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return  retEnt;
	}

	private int BannerId() {
		// TODO Auto-generated method stub
		return 0;
	}

}
