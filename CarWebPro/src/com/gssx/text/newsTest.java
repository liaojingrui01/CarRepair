package com.gssx.text;

import java.util.List;

import com.gssx.dao.INewsDao;
import com.gssx.dao.impl.NewsImpl;
import com.gssx.entity.NewsEnt;

public class newsTest {

	public static void main(String[] args) {
    newsTest at = new newsTest();
    //at.addNews();
    //at.updateCus();
    //at.deleteCus();
    //at.queryCusInfo();
    at.querybyid();
	}
	public void querybyid() {
		INewsDao newsDao = new NewsImpl();
		NewsEnt appEnt=new NewsEnt();
				appEnt=newsDao.queryById(2);
				System.out.println(appEnt.toString());
	}
	public void addNews() {
		
		INewsDao newsDao = new NewsImpl();
		NewsEnt appEnt = new NewsEnt(				
				"�𾪣�������Ȼ����������������", 
				"���շ���Ͷ��", 
				"2018-12-21", 
				666);
		boolean bool = newsDao.saveCus(appEnt);
		System.out.println(bool);
	}
	
	public void updateCus() {
		INewsDao newsDao = new NewsImpl();
		NewsEnt newsEnt = new NewsEnt(
				4, 
				"�𾪣�Ů�Ӿ�Ȼ������������", 
				"�������Ϲ���ȥ���齫", 
				"2019-11-20", 
				520
				);
		
		//�����޸ķ���
		boolean bool = newsDao.updateCus(newsEnt);
		System.out.println(bool);
	}
	
	public void deleteCus() {
		INewsDao newsDao = new NewsImpl();
		
		boolean bool =	newsDao.deleteCus(4);
		System.out.println(bool);
	}
	
	public void queryCusInfo() {
		INewsDao newsDao = new NewsImpl();
		NewsEnt newsEnt = new NewsEnt();
		List<NewsEnt> list = newsDao.queryList(newsEnt);
		System.out.println(list);
	}

}