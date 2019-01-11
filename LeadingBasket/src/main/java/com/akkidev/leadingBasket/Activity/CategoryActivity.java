package com.akkidev.leadingBasket.Activity;

import java.util.List;

import com.akkidev.leadingBasket.entities.category_master;

public interface CategoryActivity {

	public List<category_master> getCategories(int id);
	public category_master getCategoryById(int id);
	public void deleteCategoryById(int id);
}
