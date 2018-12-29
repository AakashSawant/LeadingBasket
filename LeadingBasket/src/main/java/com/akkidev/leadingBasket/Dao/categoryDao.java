package com.akkidev.leadingBasket.Dao;

import java.util.List;

import com.akkidev.leadingBasket.entities.category_master;

public interface categoryDao {

	public List<category_master> getCategories();
	public category_master getCategoryById(int id);
	public void deleteCategoryById(int id);
}
