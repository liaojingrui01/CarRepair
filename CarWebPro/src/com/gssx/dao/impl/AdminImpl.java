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

	 //��ѯ����
	@Override
	public AdminEnt queryAdm(AdminEnt admEnt) {
	
		//����ӿڶ���
				Connection conn = null;
				PreparedStatement ps = null;
				ResultSet rs = null;
				
				//���巵�صĶ��� 
				AdminEnt retEnt = null;
				
				//����ִ�е�sql���
				StringBuffer sb = new StringBuffer();
				sb.append("select * from admintb where loginName=? and loginPwd=?");
				//�����������
				//sb.append(" and .......");
				//ͨ�������� ��ö���
				conn = db.conn();

				try {
					 //��ֵ��Ԥ�������
					 ps = conn.prepareStatement(sb.toString());
					 //Ԥ������� �ٸ���ѯ���� ��ֵ
					 ps.setString(1, admEnt.getLoginName());
					 ps.setString(2, admEnt.getLoginPwd());
					 //ִ�в�ѯ����
					 rs=ps.executeQuery();
					 //ȡ��  ������еĵ�һ������
					 if(rs.first()) {
						//����ֵ
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
