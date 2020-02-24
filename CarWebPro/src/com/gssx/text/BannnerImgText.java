package com.gssx.text;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

import com.gssx.dao.IBannerImgDao;
import com.gssx.dao.impl.BannerDaoImpl;
import com.gssx.entity.BannerImgEnt;


public class BannnerImgText {
	// ��ں���
		public static void main(String[] args) throws ParseException {
			
			//���ò��Է���
			BannnerImgText at = new BannnerImgText();
			//at.queryCusEnt();
//			at.delete();
			//at.saveBan();
			//at.UpdateBan();
			at.queryList();
		}
		
		//��ѯ �����б�����
		public void queryList() {
			//��ýӿڶ���
			IBannerImgDao banImpl = new BannerDaoImpl();
			
			//���� �б��ѯ����
			BannerImgEnt bent = new BannerImgEnt();
			List<BannerImgEnt> list = banImpl.queryList(bent);
			
			//������� ����
			for (BannerImgEnt ben : list) {
				
				System.out.println(ben.getBannerName());
				
				System.out.println(ben.toString());
			}
		}
		
		//ɾ�� ����
		public void delete() {
			IBannerImgDao cusImpl = new BannerDaoImpl();
			boolean bool=cusImpl.deleteBan(7);
			if(bool) {
				System.out.println("�ɹ�");
			}else {
				System.out.println("ʧ��");
			}
		}
	
		//����ID��ѯ
		public void queryBan() {
			//ͬ�ӿ� ��� ʵ�������
			IBannerImgDao banImpl = new BannerDaoImpl();
			//���÷���
			BannerImgEnt banEnt= banImpl.queryById(4);
			//��������
			System.out.println(banEnt.toString());
			
		}
	
		
		//���淽��
		public void saveBan(){
			//��ȡ �ӿ� ����
			IBannerImgDao banImpl = new BannerDaoImpl();
			//���ַ��� ת��Ϊ date ��������
			/*
			 * SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); Date
			 * begTime = sdf.parse("2015-10-8 12:15:25"); Date endTime =
			 * sdf.parse("2015-10-8 12:15:25");
			 */
			
			//���� ʵ�����
			//BannerImgEnt banEnt = new BannerImgEnt(2,"������","������");
			BannerImgEnt banEnt = new BannerImgEnt();
			banEnt.setBannerImg("������");
			banEnt.setBannerName("������");
			//ִ�б��淽��
			boolean bool = banImpl.saveBan(banEnt);
			if (bool) {
				System.out.println("���� �˿� ���� �ɹ�������");
			}else {
				System.out.println("����ʧ�ܣ�����");
			}
		}

      
		//���ķ���
		public void UpdateBan() {
			IBannerImgDao banImpl = new BannerDaoImpl();
			BannerImgEnt banEnt = new BannerImgEnt(3,"111","111");
			boolean bool = banImpl.updateBan(banEnt);
			if (bool) {
				System.out.println("���� �˿� ���� �ɹ�������");
			}else {
				System.out.println("����ʧ�ܣ�����");
			}
			
		}
}
//
///**
//   * ��ѯ�������󷽷�
// */
//public void queryCusEnt() {
//	//ͬ�ӿ� ��� ʵ�������
//	IBannerImgDao cusImpl = new BannerDaoImpl();
//	
//	CustomerEnt cuen= new CustomerEnt();
//	cuen.setLast_name("BOX");
//	//��ѯ����
//	CustomerEnt cusEnt = cusImpl.queryCus(cuen);
//	
//	System.out.println("cusEnt===>"+cusEnt.toString());
//	
//}
//