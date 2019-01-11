package com.akkidev.leadingBasket.DaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
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
	
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<product_master> cq = builder.createQuery(product_master.class);
		Root<product_master> from = cq.from(product_master.class);
		cq.select(from);
		Query query = em.createQuery(cq);
		return query.getResultList();
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
