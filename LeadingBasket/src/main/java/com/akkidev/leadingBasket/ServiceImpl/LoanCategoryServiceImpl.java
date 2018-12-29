package com.akkidev.leadingBasket.ServiceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akkidev.leadingBasket.Activity.LoanCategoryActivity;
import com.akkidev.leadingBasket.Service.LoanCategoryService;
import com.akkidev.leadingBasket.entities.loan_subcategory;

@Service
@Transactional
public class LoanCategoryServiceImpl implements LoanCategoryService {

	@Autowired
	LoanCategoryActivity loanCategoryActivity;
	
	
	@Override
	public void deleteLoanCategoryById(int id) {
		loanCategoryActivity.deleteLoanCategoryById(id);
		
	}

	@Override
	public List<loan_subcategory> getMortgageLoan() {
		// TODO Auto-generated method stub
		return loanCategoryActivity.getMortgageLoan();
	}

	@Override
	public loan_subcategory getMortgageLoanCategoryById(int id) {
		// TODO Auto-generated method stub
		return loanCategoryActivity.getMortgageLoanCategoryById(id);
	}

	@Override
	public List<loan_subcategory> getHomeLoanCategories() {
		// TODO Auto-generated method stub
		return loanCategoryActivity.getHomeLoanCategories();
	}

	@Override
	public loan_subcategory getHomeLoanCategoryById(int id) {
		// TODO Auto-generated method stub
		return loanCategoryActivity.getHomeLoanCategoryById(id);
	}

}
