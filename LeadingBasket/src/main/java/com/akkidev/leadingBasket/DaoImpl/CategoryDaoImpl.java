package com.akkidev.leadingBasket.DaoImpl;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akkidev.leadingBasket.Dao.categoryDao;
import com.akkidev.leadingBasket.entities.category_master;

@Service
@Transactional
public class CategoryDaoImpl implements categoryDao {

	@Autowired
	EntityManager em;
	
	@Override
	public List<category_master> getCategories() {
		
		return em.createQuery("from category_master where product_id=1").getResultList();
	}

	@Override
	public category_master getCategoryById(int id) {
		
		return em.find(category_master.class, id);
	}

	@Override
	public void deleteCategoryById(int id) {
		em.remove(em.find(category_master.class, id));
	}

}
