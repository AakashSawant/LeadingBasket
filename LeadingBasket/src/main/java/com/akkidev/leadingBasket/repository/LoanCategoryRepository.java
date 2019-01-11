package com.akkidev.leadingBasket.repository;

import java.util.List;

import com.akkidev.leadingBasket.entities.loan_subcategory;

public interface LoanCategoryRepository {

	
	public List<loan_subcategory> getLoanCategories(int id);
	public loan_subcategory getHomeLoanCategoryById(int id);
	public loan_subcategory getMortgageLoanCategoryById(int id);
	public void deleteLoanCategoryById(int id);
}
