package com.akkidev.leadingBasket.repositoryImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.akkidev.leadingBasket.Dao.ProductDao;
import com.akkidev.leadingBasket.ServiceImpl.ProductServiceImpl;
import com.akkidev.leadingBasket.entities.product_master;
import com.akkidev.leadingBasket.repository.ProductRepo;

@Repository
public class ProductRepoImpl implements ProductRepo {

	@Autowired
	ProductDao productDao;
	
	@Override
	public void addService(product_master services) {
		productDao.addService(services);
		
	}

	@Override
	public List<product_master> getServices() {
		
		return productDao.getServices();
	}

	@Override
	public product_master findServiceById(int id) {
		// TODO Auto-generated method stub
		return productDao.findServiceById(id);
	}

	@Override
	public product_master update(product_master services) {
		
		return productDao.update(services);
	}

	@Override
	public void deleteService(int id) {
		productDao.deleteService(id);
		
	}
}
