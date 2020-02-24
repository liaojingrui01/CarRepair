package com.gssx.backstageServlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gssx.dao.IStockDao;

import com.gssx.dao.impl.StockDaoImpl;

import com.gssx.entity.StockEnt;
import com.gssx.util.DBUtils;
import com.gssx.util.UploadUtil;




public class StockServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	IStockDao stoDao = new StockDaoImpl();


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	doPost(request, response);
	
	}

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
	
		String op = request.getParameter("op");
		if (("queryList").equals(op)) {
			queryCusInfo(request, response);
		}else if(("updateStock").equals(op)) {
			updateStock(request, response);
		}else if(("queryById").equals(op)) {
			queryById(request, response);
		}else if(("deleteStock").equals(op)) {
			deleteStock(request, response);
		}else if(("saveBanner").equals(op)) {
			saveBanner(request, response);
		}else if(("cusAdd").equals(op)) {
			cusAdd(request, response);
		}
		else if(("updateBan").equals(op)) {
			updateBan(request, response);
		}
    }
		/**
		 * ��ѯ �˿��б�
		 * 
		 * @param request
		 * @param response
		 * @throws ServletException
		 * @throws IOException
		 */
    public void queryCusInfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// ������������
			StockEnt stoEnt = new StockEnt();
			// ���ò�ѯ ����
			List<StockEnt> list = stoDao.queryList(stoEnt);

			// ����ѯ�����Ľ�� ���� ��������
			request.setAttribute("list", list);

			// ���� ��ת
			request.getRequestDispatcher("/backstage/peijian.jsp").forward(request, response);

		}
	
	/**
	 * �޸� �˿���Ϣ
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */   
    
    public void updateStock(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ��ȡ ��Ҫ�޸ĵ�����
		String partsId = request.getParameter("partsId");
		String partsName  = request.getParameter("partsName");
		String brand  = request.getParameter("brand");
		String enterprise  = request.getParameter("enterprise");
		String imge = request.getParameter("imge");
		String carType  = request.getParameter("carType");
		String typeNum  = request.getParameter("typeNum");
		String price  = request.getParameter("price");
		String effect  = request.getParameter("effect");
		String num = request.getParameter("num");
		
		//��װ �� ����ʵ����
		StockEnt stoEnt = new StockEnt(
				Integer.parseInt(partsId),
				partsName,
				brand,
				Double.parseDouble(enterprise), 
				imge, 
				carType, 
				typeNum, 
				Double.parseDouble(price), 
				effect, 
				Integer.parseInt(num));
		
		//�����޸ķ���
		boolean bool = stoDao.updateStock(stoEnt);
		
		if(bool) {
			//ˢ�� �б����
			queryCusInfo(request, response);
		}else {
			
		}
		
	}

	/**
	 * ͨ��ID��ѯ����
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	
	
	
	public void queryById(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//��ȡIDֵ
		String partsId =request.getParameter("partsId");
		StockEnt stoEnt = stoDao.queryById(Integer.parseInt(partsId));
		//���� ������ ��ת �� �޸Ľ���
		request.setAttribute("stoEnt", stoEnt);
		
		request.getRequestDispatcher("/backstage/peijianupdate.jsp").forward(request, response);
	}
	
	 
	
	
	 /**
	 * ɾ�� �˿���Ϣ
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	
	public void deleteStock(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//��ȡID
		String partsId =request.getParameter("partsId");
		//����ɾ�� ����
		boolean bool =	stoDao.deleteStock(Integer.parseInt(partsId));
		
		//�ж���ת
		if (bool) {
			//ɾ���ɹ��� ���¼��� �б����
			queryCusInfo(request, response);
		}else {
			//ɾ��ʧ�� ����...
		}

	}
/**
     * �˿���Ϣ ��� ����
*/
public void cusAdd(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	
	
	UploadUtil uploadUtil = new UploadUtil();

	HashMap<String, String> map = uploadUtil.upload(request);


//�����ӵĲ���
	String partsName  = request.getParameter("partsName");
	String brand  = request.getParameter("brand");
	String enterprise  = request.getParameter("enterprise");
	String imge = request.getParameter("imge");
	String carType  = request.getParameter("carType");
	String typeNum  = request.getParameter("typeNum");
	String price  = request.getParameter("price");
	String effect  = request.getParameter("effect");
	String num = request.getParameter("num");
//���� dao������ ���� ����
StockEnt stoEnt = new StockEnt();
//��������ת��

stoEnt.setPartsName(partsName);
stoEnt.setBrand(brand);
stoEnt.setEnterprise(Double.parseDouble(enterprise));
//stoEnt.setImge(imge);
stoEnt.setImge(map.get("imge"));
stoEnt.setCarType(carType);
stoEnt.setTypeNum(typeNum);
stoEnt.setPrice(Double.parseDouble(price));
stoEnt.setEffect(effect);
stoEnt.setNum(Integer.parseInt(num));

boolean bool = stoDao.saveStock(stoEnt);
if (bool) {
	//��ת ���ݵ�jsp ���� ��Ⱦ����(��ת ��Ϊ�ڲ���ת�������Դ��ݲ�����  ��  �ⲿ ��ת �����ݶ�ʧ��);
	queryCusInfo(request, response);
}else {
	
}

}

/**
 * ���ͼƬ
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
	String sql = "insert into stock(partsName,brand,enterprise,imge,carType,typeNum,price,effect,num) VALUES (?,?,?,?,?,?,?,?,?) ";
	// �������ݿ� Ԥ����ִ��
	conn = db.conn();
	try {
		ps = conn.prepareStatement(sql);
		// ��ֵ
		ps.setString(1, map.get("partsName"));
		ps.setString(2, map.get("brand"));
		ps.setString(3, map.get("enterprise"));
		ps.setString(4, map.get("imge"));
		ps.setString(5, map.get("carType"));
		ps.setString(6, map.get("typeNum"));
		ps.setString(7, map.get("price"));
		ps.setString(8, map.get("effect"));
		ps.setString(9, map.get("num"));
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
	queryCusInfo(request, response);
	
}

public void updateBan(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//��ȡ ��Ҫ�޸ĵ�����
		//String bannerId = request.getParameter("bannerId");
		//String bannerName = request.getParameter("bannerName");
		//String bannerImg = request.getParameter("bannerImg");
		UploadUtil uploadUtil = new UploadUtil();

		HashMap<String, String> map = uploadUtil.upload(request);
		
		
		//��װ �� ����ʵ����
		StockEnt stoEnt = new StockEnt(
				Integer.parseInt(map.get("partsId")),
				map.get("partsName"),
				map.get("brand"),
				Double.parseDouble(map.get("enterprise")) ,
				map.get("imge"),
				map.get("carType"),
				map.get("typeNum"),
				Double.parseDouble(map.get("price")),
				map.get("effect"),
				Integer.parseInt(map.get("num")));
		
		
		
		
		
		//�����޸ķ���
		boolean bool = stoDao.updateStock(stoEnt);
		if(bool) {
			//ˢ�� �б����
			queryCusInfo(request, response);
		}else {
			
		}
	}
	
}
