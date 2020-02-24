package com.gssx.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gssx.dao.INewsDao;
import com.gssx.entity.NewsEnt;
import com.gssx.util.DBUtils;

public class NewsImpl  implements  INewsDao{
	
	DBUtils db = new DBUtils();

	@Override
	public boolean saveCus(NewsEnt NewsEnt) {
		Connection conn = null;
		//����Ԥ������
		PreparedStatement ps = null;
		//����ȡ�����ݵ� �����
		ResultSet rs = null;
		//�ɹ� ʧ��״̬
		boolean bool = false;
		//���� ��Ҫִ�е�sql ���
		String sql = "INSERT INTO news (tiltle, countent, releaseTime, staffId)\r\n" + 
				"VALUES (?,?,?,?)";
		//�������ݿ� Ԥ����ִ��
		conn = db.conn();
		try {
			ps = conn.prepareStatement(sql);
			//��ֵ
			ps.setString(1, NewsEnt.getTiltle());
			ps.setString(2, NewsEnt.getCountent());
			ps.setString(3, NewsEnt.getReleaseTime());
			ps.setInt(4, NewsEnt.getStaffId());
			
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
	public boolean deleteCus(int newsId) {
		Connection conn = null;
		PreparedStatement ps = null;
		
		String sql = "delete from news where newsId=?";
		boolean bool = false;
		//������� ִ���޸Ĳ���
		conn = db.conn();
		try {
			//Ԥ���� 
			ps = conn.prepareStatement(sql);
			// ��sql��� ���ʺ� ��ֵ
			ps.setInt(1, newsId);
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
	public boolean updateCus(NewsEnt newsEnt) {
		Connection conn = null;
		PreparedStatement ps = null;
		

		
		String sql = "update news set \r\n" + 
				"    tiltle =?,\r\n" + 
				"		countent =?,\r\n" + 
				"		releaseTime=?,\r\n" + 
				"		staffId =? WHERE newsId=?";
		
		boolean bool = false;
		
		//������� ִ���޸Ĳ���
		conn = db.conn();
		
		try {
			//Ԥ���� 
			ps = conn.prepareStatement(sql);
			// ��sql��� ���ʺ� ��ֵ
			ps.setString(1, newsEnt.getTiltle());
			ps.setString(2, newsEnt.getCountent());
			ps.setString(3, newsEnt.getReleaseTime());
			ps.setInt(4, newsEnt.getStaffId());
			
			ps.setInt(5, newsEnt.getNewsId());
			
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

	
	public List<NewsEnt> queryList(NewsEnt newsEnt) {
		//����ӿڱ���
				Connection conn = null;
				PreparedStatement ps = null;
				ResultSet rs = null;
				
				//����sql���
				String sql = "select * from news";
				//���巵�ص����ݼ���
				List<NewsEnt> list = new ArrayList<NewsEnt>();
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
				

						NewsEnt cusent = new NewsEnt(
								rs.getInt("newsId"),  
								 rs.getString("tiltle"),  
								 rs.getString("countent"), 
								 rs.getString("releaseTime"), 
								 rs.getInt("staffId")
								 );
						//��map���� ���� list ������;
						list.add(cusent);
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
	public NewsEnt queryById(int newsId) {
		//����ӿڶ���
				Connection conn = null;
				PreparedStatement ps = null;
				ResultSet rs = null;
		
		 //���巵�صĶ��� 
		       NewsEnt newsEnt = new NewsEnt();
		 
				
				//����ִ�е�sql���
		       String sql = "select * from news where newsId=?";
				//������������
				//sb.append(" and .......");
				//ͨ�������� ��ö���
				conn=db.conn();	
				
				try {
					 //��ֵ��Ԥ�������
					ps = conn.prepareStatement(sql);
					 //Ԥ������� �ٸ���ѯ���� ��ֵ
					 ps.setInt(1, newsId);
					 //ִ�в�ѯ����
					 rs=ps.executeQuery();
					 //ȡ��  ������еĵ�һ������
					 if(rs.first()) {
						//����ֵ
						 newsEnt.setNewsId(rs.getInt("newsId"));
						 newsEnt.setCountent(rs.getString("countent"));
						 newsEnt.setTiltle(rs.getString("tiltle"));
						 newsEnt.setStaffId(rs.getInt("staffid"));
						 newsEnt.setReleaseTime(rs.getString("releaseTime"));
					 	}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return  newsEnt;
	}

	
}