package com.akkidev.leadingBasket.repositoryImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.akkidev.leadingBasket.Dao.UserSubscriptionDocumentDao;
import com.akkidev.leadingBasket.entities.user_subscription_doc;
import com.akkidev.leadingBasket.repository.UserSubscriptionDocumentRepository;

@Repository
public class UserSubscriptionDocumentRepoImpl implements UserSubscriptionDocumentRepository{

	@Autowired
	UserSubscriptionDocumentDao docDao;
	
	@Override
	public user_subscription_doc findById(int id) {
		// TODO Auto-generated method stub
		return docDao.findById(id);
	}

	@Override
	public List<user_subscription_doc> findAll() {
		// TODO Auto-generated method stub
		return docDao.findAll();
	}

	@Override
	public List<user_subscription_doc> findAllByUserId(int id) {
		// TODO Auto-generated method stub
		return docDao.findAllByUserId(id);
	}

	@Override
	public void saveDocument(user_subscription_doc document) {
		docDao.saveDocument(document);		
	}

	@Override
	public void deleteById(int id) {
	docDao.deleteById(id);
		
	}

}
