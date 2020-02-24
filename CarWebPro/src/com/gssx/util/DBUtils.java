package com.gssx.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtils {

		//定义变量 链接数据库
		public static String url="jdbc:mysql://127.0.0.1:3306/car_repair?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8&useSSL=false";
		//需要使用gmt+8时区，需要写成GMT%2B8，否则会被解析为空
		//从MySQL 5.5.45+, 5.6.26+ and 5.7.6+    这些个版本以后就必须指定SSL 的值true或者false
		public static String user="root";
		public static String password="12345678";
		
		//验证驱动是否正常加载
		static {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				//将驱动类的class文件装载到内存中，并且形成一个描述此驱动类结构的Class类实例，并且初始化此驱动类，这样jvm就可以使用它了
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//数据链接方法
		public Connection conn() {
			Connection conn=null;
			try {
				conn=DriverManager.getConnection(url,user,password);
				
			}catch(SQLException e){
				e.printStackTrace();
			}
			return conn;
	    }
		
		//数据库关闭方法
		public void closeDB(ResultSet rs,PreparedStatement ps,Connection conn) {
			try {
				if(rs!=null)rs.close();
				if(ps!=null)ps.close();
				if(conn!=null)conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		//测试链接是否成功
		public static void main(String[] args) {
			DBUtils db=new DBUtils();
			Connection conn=db.conn();
			if(conn!=null) {
				db.closeDB(null, null, conn);
			}
			System.out.println("conn==>"+conn);
		}
		
}
