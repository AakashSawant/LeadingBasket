package com.akkidev.leadingBasket.Dao;

import java.util.List;

import com.akkidev.leadingBasket.entities.user_subscription_doc;

public interface UserSubscriptionDocumentDao {

	user_subscription_doc findById(int id);

	List<user_subscription_doc> findAll();

	List<user_subscription_doc> findAllByUserId(int id);

	void saveDocument(user_subscription_doc document);

	void deleteById(int id);
}
