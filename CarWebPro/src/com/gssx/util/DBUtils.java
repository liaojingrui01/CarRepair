package com.gssx.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtils {

		//������� �������ݿ�
		public static String url="jdbc:mysql://127.0.0.1:3306/car_repair?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8&useSSL=false";
		//��Ҫʹ��gmt+8ʱ������Ҫд��GMT%2B8������ᱻ����Ϊ��
		//��MySQL 5.5.45+, 5.6.26+ and 5.7.6+    ��Щ���汾�Ժ�ͱ���ָ��SSL ��ֵtrue����false
		public static String user="root";
		public static String password="12345678";
		
		//��֤�����Ƿ���������
		static {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				//���������class�ļ�װ�ص��ڴ��У������γ�һ��������������ṹ��Class��ʵ�������ҳ�ʼ���������࣬����jvm�Ϳ���ʹ������
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//�������ӷ���
		public Connection conn() {
			Connection conn=null;
			try {
				conn=DriverManager.getConnection(url,user,password);
				
			}catch(SQLException e){
				e.printStackTrace();
			}
			return conn;
	    }
		
		//���ݿ�رշ���
		public void closeDB(ResultSet rs,PreparedStatement ps,Connection conn) {
			try {
				if(rs!=null)rs.close();
				if(ps!=null)ps.close();
				if(conn!=null)conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		//���������Ƿ�ɹ�
		public static void main(String[] args) {
			DBUtils db=new DBUtils();
			Connection conn=db.conn();
			if(conn!=null) {
				db.closeDB(null, null, conn);
			}
			System.out.println("conn==>"+conn);
		}
		
}
