package com.gssx.dao;

import java.util.List;

import com.gssx.entity.ServicecarEnt;

public interface ICarDao {
	public List<ServicecarEnt> querylist();
	public ServicecarEnt queryById(int carId);
	public boolean add(ServicecarEnt carEnt);
	public boolean update(ServicecarEnt carEnt);
	public boolean delete(int carId);
	public List<ServicecarEnt> querylikeName(String name);
}
