package com.akkidev.leadingBasket.DaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

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
	public List<category_master> getCategories(int id) {

		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<category_master> query = builder.createQuery(category_master.class);
		Root<category_master> root = query.from(category_master.class);
		query.select(root).where(builder.equal(root.get("ms"), id));
		return em.createQuery(query).getResultList();
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
