package com.gssx.backstageServlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gssx.dao.impl.BannerImpl;
import com.gssx.util.DBUtils;
import com.gssx.util.UploadUtil;

public class UpFileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String op = request.getParameter("op");
		if ("saveImg".equals(op)) {
			saveBanner(request, response);
		} else if ("showImg".equals(op)) {
			showBanner(request, response);
		}
	}

	/**
	 * 上传文件 方法
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void saveBanner(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UploadUtil uploadUtil = new UploadUtil();

		HashMap<String, String> map = uploadUtil.upload(request);
		// 设置响应数据的 内容 类型
		response.setContentType("text/html;charset=utf-8");
		// 将返回的图片 名称 存入数据库中
		// 获取数据 库链接 公共类
		DBUtils db = new DBUtils();
		// 定义链接对象
		Connection conn = null;
		// 定义预编译类
		PreparedStatement ps = null;
		// 定义取出数据的 结果集
		ResultSet rs = null;
		// 成功 失败状态
		boolean bool = false;
		// 定义 需要执行的sql 语句
		String sql = "insert into bannerImg(bannerName,bannerImg)" + " VALUES (?,?)";
		// 链接数据库 预编译执行
		conn = db.conn();
		try {
			ps = conn.prepareStatement(sql);
			// 赋值
			ps.setString(1, map.get("bannerName"));
			ps.setString(2, map.get("bannerImg"));
			/*
			 * ps.setString(4, cusEnt.getEmail()); ps.setInt(5, cusEnt.getAddress_id());
			 * ps.setInt(6, cusEnt.getActive()); ps.setString(7, cusEnt.getCreate_date());
			 * ps.setString(8, cusEnt.getLast_update());
			 */
			// 判断是否 执行成功
			int upNum = ps.executeUpdate();
			if (upNum > 0) {
				bool = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		response.getWriter().println(map.toString());
		showBanner(request, response);
		
	}

	/**
	 * 显示轮播图片
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void showBanner(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 获取数据 库链接 公共类
		DBUtils db = new DBUtils();
		// 定义接口变量
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		// 定义sql语句
		String sql = "select * from bannerImg";
		// 定义返回的数据集合
		List<BannerImpl> list = new ArrayList<BannerImpl>();
		conn = db.conn();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				BannerImpl bent = new BannerImpl(rs.getString("bannerName"), rs.getString("bannerImg"));
				list.add(bent);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.closeDB(rs, ps, conn);
		}
		// 存入作用域
		request.setAttribute("list", list);
		request.getRequestDispatcher("/carOfficial/banner.jsp").forward(request, response);
	}

}
