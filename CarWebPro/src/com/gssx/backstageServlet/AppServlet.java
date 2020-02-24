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
		 * �޸� �˿���Ϣ
		 * 
		 * @param request
		 * @param response
		 * @throws ServletException
		 * @throws IOException
		 */
		public void updateCus(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			
			
			
			// ��ȡ ��Ҫ�޸ĵ�����
			String userId = request.getParameter("userId");
			String userName = request.getParameter("userName");
			String sex = request.getParameter("sex");
			String carBrand = request.getParameter("carBrand");
			String carId = request.getParameter("carId");
			String tel = request.getParameter("tel");
			String appointmentTime = request.getParameter("appointmentTime");
			String serviceId = request.getParameter("serviceId");
			
			
			//��װ �� ����ʵ����
			AppointmentEnt cusEnt = new AppointmentEnt(
					Integer.parseInt(userId), 
					userName, 
					sex, 
					carBrand, 
					Integer.parseInt(carId), 
					tel, 
					appointmentTime, 
					Integer.parseInt(serviceId)	);
			
			//�����޸ķ���
			boolean bool = appDao.updateCus(cusEnt);
			
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
		
		public void queryByName(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			//��ȡIDֵ
			String appName =request.getParameter("appName");
			AppointmentEnt cusEnt = appDao.queryByName("appName");
			//���� ������ ��ת �� �޸Ľ���
			request.setAttribute("cusEnt", cusEnt);
			
			//request.getRequestDispatcher("/cus_update.jsp").forward(request, response);
		}
		
		/**
		 * ɾ�� �˿���Ϣ
		 * @param request
		 * @param response
		 * @throws ServletException
		 * @throws IOException
		 */
		public void deleteCus(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			//��ȡID
			String userId =request.getParameter("userId");
			//����ɾ�� ����
			boolean bool =	appDao.deleteCus(Integer.parseInt(userId));
			
			//�ж���ת
			if (bool) {
				//ɾ���ɹ��� ���¼��� �б����
				queryCusInfo(request, response);
			}else {
				//ɾ��ʧ�� ����...
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
		public void queryCusInfo(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			// ������������
			AppointmentEnt cusEnt = new AppointmentEnt();
			// ���ò�ѯ ����
			List<AppointmentEnt> list = appDao.queryList(cusEnt);

			// ����ѯ�����Ľ�� ���� ��������
			request.setAttribute("list", list);

			// ���� ��ת
			request.getRequestDispatcher("./backstage/topic.jsp").forward(request, response);

		}
		public void queryById(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			//��ȡIDֵ
			String userId =request.getParameter("userId");
			
			AppointmentEnt appEnt = appDao.queryById(Integer.parseInt(userId));
			//���� ������ ��ת �� �޸Ľ���
			request.setAttribute("appEnt", appEnt);
			
			request.getRequestDispatcher("./backstage/topicupdate.jsp").forward(request, response);
		}
		
}
