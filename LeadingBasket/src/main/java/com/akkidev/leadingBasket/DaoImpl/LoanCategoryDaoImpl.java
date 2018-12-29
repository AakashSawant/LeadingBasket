package com.akkidev.leadingBasket.DaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
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
	public List<loan_subcategory> getHomeLoanCategories() {
		// TODO Auto-generated method stub
		return em.createQuery("from loan_subcategory where category_id=1").getResultList();
	}

	@Override
	public loan_subcategory getHomeLoanCategoryById(int id) {
	
		return em.find(loan_subcategory.class, id);
	}

	@Override
	public void deleteLoanCategoryById(int id) {
		loan_subcategory loan=getHomeLoanCategoryById(id);
		em.remove(loan);
	}

	@Override
	public List<loan_subcategory> getMortgageLoan() {
		
		return em.createQuery("from loan_subcategory where category_id=2").getResultList();
	}

	@Override
	public loan_subcategory getMortgageLoanCategoryById(int id) {
		// TODO Auto-generated method stub
		return  em.find(loan_subcategory.class, id);
	}

}
