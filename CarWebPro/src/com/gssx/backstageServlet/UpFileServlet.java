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
	 * �ϴ��ļ� ����
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
		// ������Ӧ���ݵ� ���� ����
		response.setContentType("text/html;charset=utf-8");
		// �����ص�ͼƬ ���� �������ݿ���
		// ��ȡ���� ������ ������
		DBUtils db = new DBUtils();
		// �������Ӷ���
		Connection conn = null;
		// ����Ԥ������
		PreparedStatement ps = null;
		// ����ȡ�����ݵ� �����
		ResultSet rs = null;
		// �ɹ� ʧ��״̬
		boolean bool = false;
		// ���� ��Ҫִ�е�sql ���
		String sql = "insert into bannerImg(bannerName,bannerImg)" + " VALUES (?,?)";
		// �������ݿ� Ԥ����ִ��
		conn = db.conn();
		try {
			ps = conn.prepareStatement(sql);
			// ��ֵ
			ps.setString(1, map.get("bannerName"));
			ps.setString(2, map.get("bannerImg"));
			/*
			 * ps.setString(4, cusEnt.getEmail()); ps.setInt(5, cusEnt.getAddress_id());
			 * ps.setInt(6, cusEnt.getActive()); ps.setString(7, cusEnt.getCreate_date());
			 * ps.setString(8, cusEnt.getLast_update());
			 */
			// �ж��Ƿ� ִ�гɹ�
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
	 * ��ʾ�ֲ�ͼƬ
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void showBanner(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ��ȡ���� ������ ������
		DBUtils db = new DBUtils();
		// ����ӿڱ���
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		// ����sql���
		String sql = "select * from bannerImg";
		// ���巵�ص����ݼ���
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
		// ����������
		request.setAttribute("list", list);
		request.getRequestDispatcher("/carOfficial/banner.jsp").forward(request, response);
	}

}
