package com.gssx.dao;

import java.util.List;

import com.gssx.entity.BannerImgEnt;
import com.gssx.entity.StockEnt;

public interface IBannerImgDao {
	/**
	 * ��   ɾ   ��   ��   ��ҳ  ��ѯ����������   ��������  .....
	 */
	public boolean saveBan(BannerImgEnt bannerEnt);
	public boolean deleteBan(int bannerId);
	public boolean updateBan(BannerImgEnt bannerEnt);
	//��ѯ ���� ���� �˿�ʵ�����
	public IBannerImgDao queryBan(BannerImgEnt bannerEnt);
	
	/**
	 * ��ѯ������� ʹ�� ������Ϊ���ؽ�� ��Ŷ���˿Ͷ���
	 * 	list  map  set �ӿ�===> ÿ���ӿ� ��Ӧ����ʵ����;
	 */
	public List<BannerImgEnt> queryList(BannerImgEnt bannerEnt);
	
	
	/**
	    * ������ѯ ��� �������� ���뼯����
	 */
	public List<BannerImgEnt> querylist();
	/**
	 * ͨ��ID��ȡ ��������
	 * @param cus_id
	 * @return
	 */
	public BannerImgEnt queryById(int bannerId);


}
