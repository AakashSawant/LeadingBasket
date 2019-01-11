package com.akkidev.leadingBasket.ActivityImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akkidev.leadingBasket.Activity.CategoryActivity;
import com.akkidev.leadingBasket.entities.category_master;
import com.akkidev.leadingBasket.repository.CategoryRepo;

@Service
@Transactional
public class CategoryActivityImpl implements CategoryActivity {

	@Autowired
	CategoryRepo catRepo;
	
	@Override
	public List<category_master> getCategories(int id) {
		// TODO Auto-generated method stub
		return catRepo.getCategories(id);
	}

	@Override
	public category_master getCategoryById(int id) {
		// TODO Auto-generated method stub
		return catRepo.getCategoryById(id);
	}

	@Override
	public void deleteCategoryById(int id) {
	
		catRepo.deleteCategoryById(id);
		
	}

}
