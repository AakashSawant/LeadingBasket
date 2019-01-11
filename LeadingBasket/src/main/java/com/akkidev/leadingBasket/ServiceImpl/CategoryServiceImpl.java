package com.akkidev.leadingBasket.ServiceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akkidev.leadingBasket.Activity.CategoryActivity;
import com.akkidev.leadingBasket.Service.CategoryService;
import com.akkidev.leadingBasket.entities.category_master;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryActivity catActivity;
	
	@Override
	public List<category_master> getCategories(int id) {
		// TODO Auto-generated method stub
		return catActivity.getCategories(id);
	}

	@Override
	public category_master getCategoryById(int id) {
		// TODO Auto-generated method stub
		return catActivity.getCategoryById(id);
	}

	@Override
	public void deleteCategoryById(int id) {
		catActivity.deleteCategoryById(id);		
	}

}
