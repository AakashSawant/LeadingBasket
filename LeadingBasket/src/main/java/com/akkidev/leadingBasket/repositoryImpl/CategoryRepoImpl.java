package com.akkidev.leadingBasket.repositoryImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.akkidev.leadingBasket.Dao.categoryDao;
import com.akkidev.leadingBasket.entities.category_master;
import com.akkidev.leadingBasket.repository.CategoryRepo;

@Repository
public class CategoryRepoImpl implements CategoryRepo {

	@Autowired
	categoryDao catDao;
	
	@Override
	public List<category_master> getCategories() {
		// TODO Auto-generated method stub
		return catDao.getCategories();
	}

	@Override
	public category_master getCategoryById(int id) {
		// TODO Auto-generated method stub
		return catDao.getCategoryById(id);
	}

	@Override
	public void deleteCategoryById(int id) {
		catDao.deleteCategoryById(id);		
	}

}
