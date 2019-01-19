package com.akkidev.leadingBasket.repositoryImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.akkidev.leadingBasket.Dao.UserSubscriptionDocumentDao;
import com.akkidev.leadingBasket.entities.user_subscription_doc;
import com.akkidev.leadingBasket.repository.UserSubscriptionDocumentRepository;

@Repository
public class UserSubscriptionDocumentRepoImpl implements UserSubscriptionDocumentRepository {

	@Autowired
	UserSubscriptionDocumentDao docDao;

	@Override
	public user_subscription_doc findById(int id) {

		return docDao.findById(id);
	}

	@Override
	public List<user_subscription_doc> findAll() {

		return docDao.findAll();
	}

	@Override
	public List<user_subscription_doc> findAllByUserId(int id) {

		return docDao.findAllByUserId(id);
	}

	@Override
	public user_subscription_doc saveDocument(int usID, String pdf_name, String photo_name) {

		return docDao.saveDocument(usID, pdf_name, photo_name);
	}

	@Override
	public user_subscription_doc deleteById(int id) {

		return docDao.deleteById(id);
	}

}
