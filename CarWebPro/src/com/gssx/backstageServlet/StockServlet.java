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
		 * 查询 顾客列表
		 * 
		 * @param request
		 * @param response
		 * @throws ServletException
		 * @throws IOException
		 */
    public void queryCusInfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// 创建条件对象
			StockEnt stoEnt = new StockEnt();
			// 调用查询 方法
			List<StockEnt> list = stoDao.queryList(stoEnt);

			// 将查询出来的结果 存入 作用域中
			request.setAttribute("list", list);

			// 界面 跳转
			request.getRequestDispatcher("/backstage/peijian.jsp").forward(request, response);

		}
	
	/**
	 * 修改 顾客信息
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */   
    
    public void updateStock(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 获取 需要修改的数据
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
		
		//封装 到 对象实体中
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
		
		//调用修改方法
		boolean bool = stoDao.updateStock(stoEnt);
		
		if(bool) {
			//刷新 列表界面
			queryCusInfo(request, response);
		}else {
			
		}
		
	}

	/**
	 * 通过ID查询对象
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	
	
	
	public void queryById(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//获取ID值
		String partsId =request.getParameter("partsId");
		StockEnt stoEnt = stoDao.queryById(Integer.parseInt(partsId));
		//存入 作用于 跳转 到 修改界面
		request.setAttribute("stoEnt", stoEnt);
		
		request.getRequestDispatcher("/backstage/peijianupdate.jsp").forward(request, response);
	}
	
	 
	
	
	 /**
	 * 删除 顾客信息
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	
	public void deleteStock(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//获取ID
		String partsId =request.getParameter("partsId");
		//调用删除 方法
		boolean bool =	stoDao.deleteStock(Integer.parseInt(partsId));
		
		//判断跳转
		if (bool) {
			//删除成功后 重新加载 列表界面
			queryCusInfo(request, response);
		}else {
			//删除失败 界面...
		}

	}
/**
     * 顾客信息 添加 方法
*/
public void cusAdd(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	
	
	UploadUtil uploadUtil = new UploadUtil();

	HashMap<String, String> map = uploadUtil.upload(request);


//获得添加的参数
	String partsName  = request.getParameter("partsName");
	String brand  = request.getParameter("brand");
	String enterprise  = request.getParameter("enterprise");
	String imge = request.getParameter("imge");
	String carType  = request.getParameter("carType");
	String typeNum  = request.getParameter("typeNum");
	String price  = request.getParameter("price");
	String effect  = request.getParameter("effect");
	String num = request.getParameter("num");
//调用 dao层的添加 数据 方法
StockEnt stoEnt = new StockEnt();
//数据类型转换

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
	//跳转 传递到jsp 界面 渲染数据(跳转 分为内部跳转：【可以传递参数】  和  外部 跳转 【数据丢失】);
	queryCusInfo(request, response);
}else {
	
}

}

/**
 * 添加图片
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
	String sql = "insert into stock(partsName,brand,enterprise,imge,carType,typeNum,price,effect,num) VALUES (?,?,?,?,?,?,?,?,?) ";
	// 链接数据库 预编译执行
	conn = db.conn();
	try {
		ps = conn.prepareStatement(sql);
		// 赋值
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
		// 判断是否 执行成功
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
		//获取 需要修改的数据
		//String bannerId = request.getParameter("bannerId");
		//String bannerName = request.getParameter("bannerName");
		//String bannerImg = request.getParameter("bannerImg");
		UploadUtil uploadUtil = new UploadUtil();

		HashMap<String, String> map = uploadUtil.upload(request);
		
		
		//封装 到 对象实体中
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
		
		
		
		
		
		//调用修改方法
		boolean bool = stoDao.updateStock(stoEnt);
		if(bool) {
			//刷新 列表界面
			queryCusInfo(request, response);
		}else {
			
		}
	}
	
}
