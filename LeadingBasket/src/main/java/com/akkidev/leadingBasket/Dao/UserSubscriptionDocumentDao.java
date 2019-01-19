package com.akkidev.leadingBasket.Dao;

import java.util.List;

import com.akkidev.leadingBasket.entities.user_subscription_doc;

public interface UserSubscriptionDocumentDao {

	user_subscription_doc findById(int id);

	List<user_subscription_doc> findAll();

	List<user_subscription_doc> findAllByUserId(int id);

	public user_subscription_doc saveDocument(int usID,String pdf_name,String photo_name);

	user_subscription_doc deleteById(int id);
}
