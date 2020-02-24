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

		        //�������Ӷ���
				Connection conn = null;
				//����Ԥ������
				PreparedStatement ps = null;
				//����ȡ�����ݵ� �����
				ResultSet rs = null;
				//�ɹ� ʧ��״̬
				boolean bool = false;
				//���� ��Ҫִ�е�sql ���
				String sql = "insert into stock(partsName,brand,enterprise,imge,carType,typeNum,price,effect,num)"
						   + " VALUES (?,?,?,?,?,?,?,?,?)";//,?,?,?,?,?   ,email,address_id,active,create_date,last_update
				//�������ݿ� Ԥ����ִ��
				conn = db.conn();
				try {
					ps = conn.prepareStatement(sql);
					//��ֵ
				
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
					//�ж��Ƿ� ִ�гɹ�
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
		//�� ��Ҫ�õ��Ľӿ� �� ����
		Connection conn = null;
		PreparedStatement ps = null;
		
		String sql = "delete from stock where partsId=?";
		boolean bool = false;
		//������� ִ���޸Ĳ���
		conn = db.conn();
		try {
			//Ԥ���� 
			ps = conn.prepareStatement(sql);
			// ��sql��� ���ʺ� ��ֵ
			ps.setInt(1, partsId);
			//ִ�� �޲���
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
		//�� ��Ҫ�õ��Ľӿ� �� ����
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
		
		//������� ִ���޸Ĳ���
		conn = db.conn();
		
		try {
			//Ԥ���� 
			ps = conn.prepareStatement(sql);
			// ��sql��� ���ʺ� ��ֵ
			
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
			
			//ִ�� �޲���
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
		//����ӿڱ���
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		//����sql���
		String sql = "select * from stock";
		//���巵�ص����ݼ���
		List<StockEnt> list = new ArrayList<StockEnt>();
		//��ʼ���Ӳ�ѯ
		conn =	db.conn();
		try {
			ps = conn.prepareStatement(sql);
			//��ֵ����
			//ps.setString(parameterIndex, x);
			//ִ�в���
			rs = ps.executeQuery();
			while(rs.next()) {
				//����ѯ������ ���� cusent������
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
				//��map���� ���� list ������;
				list.add(stoent);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			db.closeDB(rs, ps, conn);
		}
		//���� �����
		return list;
	}


	@Override
	public List<Map<String, Object>> querCusAndAddres() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StockEnt queryById(int partsId) {
		//����ӿڶ���
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		//���巵�صĶ��� 
		StockEnt stoEnt = null;
		
		//����ִ�е�sql���
		StringBuffer sb = new StringBuffer();
		sb.append("select * from stock where partsId=?");
		//�����������
		//sb.append(" and .......");
		//ͨ�������� ��ö���
		conn = db.conn();
		
		try {
			 //��ֵ��Ԥ�������
			 ps = conn.prepareStatement(sb.toString());
			 //Ԥ������� �ٸ���ѯ���� ��ֵ
			 ps.setInt(1, partsId);
			 //ִ�в�ѯ����
			 rs=ps.executeQuery();
			 //ȡ��  ������еĵ�һ������
			 if(rs.first()) {
				//����ֵ
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
