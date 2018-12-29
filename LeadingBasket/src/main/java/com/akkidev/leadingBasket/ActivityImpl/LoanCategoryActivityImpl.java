package com.akkidev.leadingBasket.ActivityImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akkidev.leadingBasket.Activity.LoanCategoryActivity;
import com.akkidev.leadingBasket.entities.loan_subcategory;
import com.akkidev.leadingBasket.repository.LoanCategoryRepository;


@Service
@Transactional
public class LoanCategoryActivityImpl implements LoanCategoryActivity {

	
	@Autowired
	LoanCategoryRepository loanCategoryRepository;
	
	@Override
	public List<loan_subcategory> getHomeLoanCategories() {
		// TODO Auto-generated method stub
		return loanCategoryRepository.getHomeLoanCategories();
	}

	@Override
	public loan_subcategory getHomeLoanCategoryById(int id) {
		// TODO Auto-generated method stub
		return loanCategoryRepository.getHomeLoanCategoryById(id);
	}

	@Override
	public void deleteLoanCategoryById(int id) {
		loanCategoryRepository.deleteLoanCategoryById(id);
		
	}

	@Override
	public List<loan_subcategory> getMortgageLoan() {
		
		return loanCategoryRepository.getMortgageLoan();
	}

	@Override
	public loan_subcategory getMortgageLoanCategoryById(int id) {
		// TODO Auto-generated method stub
		return loanCategoryRepository.getMortgageLoanCategoryById(id);
	}
	

}
