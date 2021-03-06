package com.akkidev.leadingBasket.ServiceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akkidev.leadingBasket.Activity.UserSubscriptionDocumentActivity;
import com.akkidev.leadingBasket.Service.UserSubscriptionDocService;
import com.akkidev.leadingBasket.entities.user_subscription_doc;

@Service
@Transactional
public class UserDocServiceImpl implements UserSubscriptionDocService {

	@Autowired
	UserSubscriptionDocumentActivity docActivity;

	@Override
	public user_subscription_doc findById(int id) {

		return docActivity.findById(id);
	}

	@Override
	public List<user_subscription_doc> findAll() {

		return docActivity.findAll();
	}

	@Override
	public List<user_subscription_doc> findAllByUserId(int id) {

		return docActivity.findAllByUserId(id);
	}

	@Override
	public user_subscription_doc saveDocument(int usID, String pdf_name, String photo_name) {

		return docActivity.saveDocument(usID, pdf_name, photo_name);
	}

	@Override
	public user_subscription_doc deleteById(int id) {

		return docActivity.deleteById(id);
	}

}
