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
	 //��ȡ���� ������ ������
	DBUtils db = new DBUtils();
		
	@Override
	public boolean saveBan(BannerImgEnt bannerEnt) {
		//�������Ӷ���
		java.sql.Connection conn = null;
		//����Ԥ������
		PreparedStatement ps = null;
		//����ȡ�����ݵ� �����
		ResultSet rs = null;
		//�ɹ� ʧ��״̬
		boolean bool = false;
		//���� ��Ҫִ�е�sql ���
		String sql = "insert into bannerImg(bannerName,bannerImg ) VALUES (?,?)";
		//�������ݿ� Ԥ����ִ��
		conn = db.conn();
		try {
			ps = conn.prepareStatement(sql);
			//��ֵ
			ps.setString(1, bannerEnt.getBannerName());
			ps.setString(2, bannerEnt.getBannerImg());
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
	public boolean deleteBan(int bannerId) {
		//�� ��Ҫ�õ��Ľӿ� �� ����
				java.sql.Connection conn = null;
				PreparedStatement ps = null;
				
				String sql = "delete from bannerImg where BannerId=?";
				boolean bool = false;
				//������� ִ���޸Ĳ���
				conn = db.conn();
				try {
					//Ԥ���� 
					ps = conn.prepareStatement(sql);
					// ��sql��� ���ʺ� ��ֵ
					ps.setInt(1, bannerId);
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
	public boolean updateBan(BannerImgEnt bannerEnt) {
		//�� ��Ҫ�õ��Ľӿ� �� ����
		       Connection conn = null;
				PreparedStatement ps = null;
				String sql = "update bannerImg set bannerName=?, bannerImg=?  WHERE bannerId=?";
				
				boolean bool = false;
				
				//������� ִ���޸Ĳ���
				conn = db.conn();
				
				try {
					//Ԥ���� 
					ps =conn.prepareStatement(sql);
					// ��sql��� ���ʺ� ��ֵ
					ps.setString(1, bannerEnt.getBannerName());
					ps.setString(2, bannerEnt.getBannerImg());
					ps.setInt(3, bannerEnt.getBannerId());
					
					//ִ�� �޸Ĳ���
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
		//����ӿڱ���
				Connection conn = null;
				PreparedStatement ps = null;
				ResultSet rs = null;
				
				//����sql���
				String sql = "select * from bannerImg";
				//���巵�ص����ݼ���
				List<BannerImgEnt> list = new ArrayList<BannerImgEnt>();
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
						BannerImgEnt cusent = new BannerImgEnt(
								rs.getInt("bannerId"),  
								 rs.getString("bannerName"), 
								 rs.getString("bannerImg"));
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
	public List<BannerImgEnt> querylist() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BannerImgEnt queryById(int bannerId) {
		//����ӿڶ���
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		//���巵�صĶ��� 
		BannerImgEnt retEnt = null;
		
		//����ִ�е�sql���
		StringBuffer sb = new StringBuffer();
		sb.append("select * from bannerImg where bannerId=?");
		//�����������
		//sb.append(" and .......");
		//ͨ�������� ��ö���
		conn = (Connection) db.conn();
		
		try {
			 //��ֵ��Ԥ�������
			 ps = ((java.sql.Connection) conn).prepareStatement(sb.toString());
			 //Ԥ������� �ٸ���ѯ���� ��ֵ
			 ps.setInt(1, bannerId);
			 //ִ�в�ѯ����
			 rs=ps.executeQuery();
			 //ȡ��  ������еĵ�һ������
			 if(rs.first()) {
				//����ֵ
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
