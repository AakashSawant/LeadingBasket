package com.akkidev.leadingBasket.ActivityImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akkidev.leadingBasket.Activity.ProductActivity;
import com.akkidev.leadingBasket.entities.product_master;
import com.akkidev.leadingBasket.repositoryImpl.ProductRepoImpl;


@Service
public class ProductActivityimpl implements ProductActivity {

	@Autowired
	ProductRepoImpl prImpl;
	
	@Override
	public void addService(product_master services) {
		prImpl.addService(services);
		
	}

	@Override
	public List<product_master> getServices() {
		
		return prImpl.getServices();
	}

	@Override
	public product_master findServiceById(int id) {
		// TODO Auto-generated method stub
		return prImpl.findServiceById(id);
	}

	@Override
	public product_master update(product_master services) {
		
		return prImpl.update(services);
	}

	@Override
	public void deleteService(int id) {
		prImpl.deleteService(id);		
	}

}
