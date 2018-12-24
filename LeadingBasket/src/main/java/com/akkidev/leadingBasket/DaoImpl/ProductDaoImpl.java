package com.akkidev.leadingBasket.DaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.akkidev.leadingBasket.Dao.ProductDao;
import com.akkidev.leadingBasket.entities.product_master;

@Service
@Transactional
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private EntityManager em;

	@Override
	public void addService(product_master services) {

		em.persist(services);
	}

	@Override
	public List<product_master> getServices() {
	
		return em.createQuery("from product_master").getResultList();
	}

	@Override
	public product_master findServiceById(int id) {
	
		return em.find(product_master.class, id);
	}

	@Override
	public product_master update(product_master services) {

		return em.merge(services);
	}

	@Override
	public void deleteService(int id) {
		product_master pt = findServiceById(id);
		em.remove(pt);
	}

}
