package com.akkidev.leadingBasket.DaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akkidev.leadingBasket.Dao.LoanCategoryDao;
import com.akkidev.leadingBasket.entities.loan_subcategory;

@Service
@Transactional
public class LoanCategoryDaoImpl implements LoanCategoryDao {

	@Autowired
	EntityManager em;

	@Override
	public List<loan_subcategory> getLoanCategories(int id) {

		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<loan_subcategory> query = builder.createQuery(loan_subcategory.class);
		Root<loan_subcategory> form = query.from(loan_subcategory.class);
		query.select(form);
		query.where(builder.equal(form.get("cm"), id));
		return em.createQuery(query).getResultList();

	}

	@Override
	public loan_subcategory getHomeLoanCategoryById(int id) {

		return em.find(loan_subcategory.class, id);
	
	}

	@Override
	public void deleteLoanCategoryById(int id) {
		loan_subcategory loan = getHomeLoanCategoryById(id);
		em.remove(loan);
	}

	@Override
	public loan_subcategory getMortgageLoanCategoryById(int id) {
		// TODO Auto-generated method stub
		return em.find(loan_subcategory.class, id);
	}

}
