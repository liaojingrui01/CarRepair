package com.gssx.officialServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gssx.dao.IAppointmentDao;
import com.gssx.dao.impl.AppointmentDaoImpl;
import com.gssx.entity.AppointmentEnt;


@WebServlet("/qiantaiyuyueServlet")
public class qiantaiyuyueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IAppointmentDao appDao = new AppointmentDaoImpl();
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
    	response.setCharacterEncoding("utf-8");
    	
    	String op = request.getParameter("op");
    	if(("appAdd").equals(op)) {

    		appAdd(request, response);
    		}
	}
	
	public void appAdd(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		String userName = request.getParameter("userName");
		String sex = request.getParameter("sex");
		String carBrand = request.getParameter("carBrand");
		String carId = request.getParameter("carId");
		String tel = request.getParameter("tel");
		String appointmentTime = request.getParameter("appointmentTime");
		String serviceId = request.getParameter("serviceId");
		
		
		//封装 到 对象实体中
		AppointmentEnt appEnt = new AppointmentEnt(				
				userName, 
				sex, 
				carBrand, 
				Integer.parseInt(carId), 
				tel, 
				appointmentTime, 
				Integer.parseInt(serviceId)	);
		boolean bool = appDao.saveCus(appEnt);
		if (bool) {
    		//跳转 传递到jsp 界面 渲染数据(跳转 分为内部跳转：【可以传递参数】  和  外部 跳转 【数据丢失】);
			//request.setAttribute("retMsg","预约申请成功!!!!");
    		request.getRequestDispatcher("./carOfficial/success.jsp").forward(request, response);
		}else {
    		request.getRequestDispatcher("/error.jsp").forward(request, response);
		}
	}

}
