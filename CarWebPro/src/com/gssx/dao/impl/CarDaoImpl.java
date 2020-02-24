package com.gssx.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gssx.dao.ICarDao;
import com.gssx.entity.ServicecarEnt;
import com.gssx.util.DBUtils;

public class CarDaoImpl implements ICarDao{
	
	DBUtils db=new DBUtils();
	
	@Override
	public List<ServicecarEnt> querylist() {
		Connection conn =null;
		PreparedStatement ps =null;
		ResultSet rs=null;
		List<ServicecarEnt> list=new ArrayList<ServicecarEnt>();
		String sql="select * from servicecar";		
		conn=db.conn();	
		try {
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				ServicecarEnt carEnt =new ServicecarEnt(rs.getInt("carId"),rs.getString("carName"),rs.getString("carImg"));
				list.add(carEnt);				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean add(ServicecarEnt carEnt) {
		//�������Ӷ���
		Connection conn =null;
		//����Ԥ������
		PreparedStatement ps =null;
		//����ȡ�����ݵĽ����
		ResultSet rs=null;
		//����ɹ�ʧ��״̬
		boolean bool=false;
		//������Ҫִ�е�sql���
		String sql="insert into servicecar(carName,carImg)"
					+"values(?,?)";		
		//�������ݿ� Ԥ����ִ��
		conn=db.conn();	
		
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, carEnt.getCarName());
			ps.setString(2, carEnt.getCarImg());
			int upNum=ps.executeUpdate();
			if(upNum>0) {
				bool=true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			db.closeDB(rs, ps, conn);
		}

		return bool;
	}

	@Override
	public boolean update(ServicecarEnt carEnt) {
		Connection conn =null;
		PreparedStatement ps =null;
		boolean bool=false;
		String sql="update servicecar set carImg=?,carName=? WHERE carId=?";
		conn=db.conn();	
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, carEnt.getCarImg());
			ps.setString(2, carEnt.getCarName());
			ps.setInt(3, carEnt.getCarId());
			int upNum=ps.executeUpdate();
			if(upNum>0) {
				bool=true;
			}			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			db.closeDB(null,ps, conn);
		}
		return bool;
	}

	@Override
	public boolean delete(int carId) {
		//�������Ӷ���
		Connection conn =null;
		//����Ԥ������
		PreparedStatement ps =null;
		//����ɹ�ʧ��״̬
		boolean bool=false;
		//������Ҫִ�е�sql���
		String sql="delete from servicecar WHERE carId=?";		
		//�������ݿ� Ԥ����ִ��
		conn=db.conn();	
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1,carId);
			int upNum=ps.executeUpdate();
			if(upNum>0) {
				bool=true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			db.closeDB(null,ps, conn);
		}
		
		return bool;
	}
	
	public ServicecarEnt queryById(int carId) {
		Connection conn =null;
		PreparedStatement ps =null;
		ResultSet rs=null;
		ServicecarEnt carEnt=null;
		String sql="select * from servicecar where carId=?";
		conn=db.conn();	
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1,carId);
			rs=ps.executeQuery();
			//carEnt.setCarId(rs.getInt("carId"));
			if(rs.first()) {
				carEnt=new ServicecarEnt(rs.getInt("carId"),rs.getString("carName"),rs.getString("carImg"));
			}
			

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			db.closeDB(null,ps, conn);
		}			
		return carEnt;
	}

	public List<ServicecarEnt> querylikeName(String name) {
		Connection conn =null;
		PreparedStatement ps =null;
		ResultSet rs=null;
		List<ServicecarEnt> list=new ArrayList<ServicecarEnt>();
		String sql="select * from servicecar where carName like ? ";
		conn=db.conn();	
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, '%'+name+'%');
			rs=ps.executeQuery();
			while(rs.next()) {
				ServicecarEnt carEnt =new ServicecarEnt(rs.getInt("carId"),rs.getString("carName"),rs.getString("carImg"));
				list.add(carEnt);				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			db.closeDB(null,ps, conn);
		}			
		return list;		
		
		
	}
}
