package com.gssx.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.gssx.dao.IAdminDao;
import com.gssx.entity.AdminEnt;
import com.gssx.util.DBUtils;

public class AdminImpl implements IAdminDao {
	
	 DBUtils db = new DBUtils();

	 //查询数据
	@Override
	public AdminEnt queryAdm(AdminEnt admEnt) {
	
		//定义接口对象
				Connection conn = null;
				PreparedStatement ps = null;
				ResultSet rs = null;
				
				//定义返回的对象 
				AdminEnt retEnt = null;
				
				//定义执行的sql语句
				StringBuffer sb = new StringBuffer();
				sb.append("select * from admintb where loginName=? and loginPwd=?");
				//添加其他条件
				//sb.append(" and .......");
				//通过工具类 获得对象
				conn = db.conn();

				try {
					 //赋值给预编译对象
					 ps = conn.prepareStatement(sb.toString());
					 //预编译对象 再给查询条件 赋值
					 ps.setString(1, admEnt.getLoginName());
					 ps.setString(2, admEnt.getLoginPwd());
					 //执行查询操作
					 rs=ps.executeQuery();
					 //取出  结果集中的第一条数据
					 if(rs.first()) {
						//对象赋值
						retEnt = new AdminEnt(  
							      rs.getString("loginName"),  
							      rs.getString("loginPwd"),
							      rs.getString("adminName") 
							      );

					 	}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return retEnt;
	}

	@Override
	public boolean updateAdm(AdminEnt admEnt) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean saveAdm(AdminEnt admEnt) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
