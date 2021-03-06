package com.akkidev.leadingBasket.repository;

import java.util.List;

import com.akkidev.leadingBasket.entities.product_master;

public interface ProductRepo {

	public void addService(product_master services);

	public List<product_master> getServices();

	public product_master findServiceById(int id);

	public product_master update(product_master services);
	
	public void deleteService(int id);
}
