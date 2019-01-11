package com.akkidev.leadingBasket.Activity;

import java.util.List;

import com.akkidev.leadingBasket.entities.loan_subcategory;

public interface LoanCategoryActivity {
	
	public List<loan_subcategory> getLoanCategories(int id);
	public loan_subcategory getHomeLoanCategoryById(int id);
	public loan_subcategory getMortgageLoanCategoryById(int id);
	public void deleteLoanCategoryById(int id);
}
