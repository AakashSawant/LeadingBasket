package com.akkidev.leadingBasket.repositoryImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.akkidev.leadingBasket.Dao.LoanCategoryDao;
import com.akkidev.leadingBasket.entities.loan_subcategory;
import com.akkidev.leadingBasket.repository.LoanCategoryRepository;

@Repository
public class LoanCategoryRepositoryImpl implements LoanCategoryRepository {

	@Autowired
	LoanCategoryDao loanCategoryDao ;
	
	
	@Override
	public loan_subcategory getHomeLoanCategoryById(int id) {
		// TODO Auto-generated method stub
		return loanCategoryDao.getHomeLoanCategoryById(id);
	}

	@Override
	public void deleteLoanCategoryById(int id) {
		loanCategoryDao.deleteLoanCategoryById(id);
	}

	
	@Override
	public loan_subcategory getMortgageLoanCategoryById(int id) {
		// TODO Auto-generated method stub
		return loanCategoryDao.getMortgageLoanCategoryById(id);
	}

	@Override
	public List<loan_subcategory> getLoanCategories(int id) {
		// TODO Auto-generated method stub
		return loanCategoryDao.getLoanCategories(id);
	}

}
