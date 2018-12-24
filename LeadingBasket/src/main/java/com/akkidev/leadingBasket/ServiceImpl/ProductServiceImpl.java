package com.akkidev.leadingBasket.ServiceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akkidev.leadingBasket.ActivityImpl.ProductActivityimpl;
import com.akkidev.leadingBasket.Service.ProductService;
import com.akkidev.leadingBasket.entities.product_master;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductActivityimpl prAct;
	
	@Override
	public void addService(product_master services) {
		prAct.addService(services);
		
	}

	@Override
	public List<product_master> getServices() {
		
		return prAct.getServices();
	}

	@Override
	public product_master findServiceById(int id) {
		// TODO Auto-generated method stub
		return prAct.findServiceById(id);
	}

	@Override
	public product_master update(product_master services) {
		// TODO Auto-generated method stub
		return prAct.update(services);
	}

	@Override
	public void deleteService(int id) {
		prAct.deleteService(id);
		
	}

}
