package com.gssx.backstageServlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gssx.dao.IAppointmentDao;
import com.gssx.dao.impl.AppointmentDaoImpl;
import com.gssx.entity.AppointmentEnt;





public class AppServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	IAppointmentDao appDao = new AppointmentDaoImpl();
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
    	response.setCharacterEncoding("utf-8");
    	
    	String op = request.getParameter("op");
    	if (("deleteCus").equals(op)) {
    		deleteCus(request, response);
		}else if(("updateCus").equals(op)) {
			updateCus(request, response);
		}else if(("queryByName").equals(op)) {
			queryByName(request, response);
		}else if(("queryById").equals(op)) {
			queryById(request, response);
		}
		else if(("queryCusInfo").equals(op)){
			queryCusInfo(request, response);
		}
		
	}
	     
	
	

		/**
		 * 修改 顾客信息
		 * 
		 * @param request
		 * @param response
		 * @throws ServletException
		 * @throws IOException
		 */
		public void updateCus(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			
			
			
			// 获取 需要修改的数据
			String userId = request.getParameter("userId");
			String userName = request.getParameter("userName");
			String sex = request.getParameter("sex");
			String carBrand = request.getParameter("carBrand");
			String carId = request.getParameter("carId");
			String tel = request.getParameter("tel");
			String appointmentTime = request.getParameter("appointmentTime");
			String serviceId = request.getParameter("serviceId");
			
			
			//封装 到 对象实体中
			AppointmentEnt cusEnt = new AppointmentEnt(
					Integer.parseInt(userId), 
					userName, 
					sex, 
					carBrand, 
					Integer.parseInt(carId), 
					tel, 
					appointmentTime, 
					Integer.parseInt(serviceId)	);
			
			//调用修改方法
			boolean bool = appDao.updateCus(cusEnt);
			
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
		
		public void queryByName(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			//获取ID值
			String appName =request.getParameter("appName");
			AppointmentEnt cusEnt = appDao.queryByName("appName");
			//存入 作用于 跳转 到 修改界面
			request.setAttribute("cusEnt", cusEnt);
			
			//request.getRequestDispatcher("/cus_update.jsp").forward(request, response);
		}
		
		/**
		 * 删除 顾客信息
		 * @param request
		 * @param response
		 * @throws ServletException
		 * @throws IOException
		 */
		public void deleteCus(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			//获取ID
			String userId =request.getParameter("userId");
			//调用删除 方法
			boolean bool =	appDao.deleteCus(Integer.parseInt(userId));
			
			//判断跳转
			if (bool) {
				//删除成功后 重新加载 列表界面
				queryCusInfo(request, response);
			}else {
				//删除失败 界面...
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
		public void queryCusInfo(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			// 创建条件对象
			AppointmentEnt cusEnt = new AppointmentEnt();
			// 调用查询 方法
			List<AppointmentEnt> list = appDao.queryList(cusEnt);

			// 将查询出来的结果 存入 作用域中
			request.setAttribute("list", list);

			// 界面 跳转
			request.getRequestDispatcher("./backstage/topic.jsp").forward(request, response);

		}
		public void queryById(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			//获取ID值
			String userId =request.getParameter("userId");
			
			AppointmentEnt appEnt = appDao.queryById(Integer.parseInt(userId));
			//存入 作用于 跳转 到 修改界面
			request.setAttribute("appEnt", appEnt);
			
			request.getRequestDispatcher("./backstage/topicupdate.jsp").forward(request, response);
		}
		
}
