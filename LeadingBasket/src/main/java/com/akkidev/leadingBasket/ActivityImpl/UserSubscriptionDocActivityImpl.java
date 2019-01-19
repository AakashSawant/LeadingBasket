package com.akkidev.leadingBasket.ActivityImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akkidev.leadingBasket.Activity.UserSubscriptionDocumentActivity;
import com.akkidev.leadingBasket.entities.user_subscription_doc;
import com.akkidev.leadingBasket.repository.UserSubscriptionDocumentRepository;

@Service
@Transactional
public class UserSubscriptionDocActivityImpl implements UserSubscriptionDocumentActivity {

	@Autowired
	UserSubscriptionDocumentRepository docRepository;
	
	@Override
	public user_subscription_doc findById(int id) {
		
		return docRepository.findById(id);
	}

	@Override
	public List<user_subscription_doc> findAll() {
		// TODO Auto-generated method stub
		return docRepository.findAll();
	}

	@Override
	public List<user_subscription_doc> findAllByUserId(int id) {
	
		return docRepository.findAllByUserId(id);
	}

	@Override
	public user_subscription_doc saveDocument(int usID, String pdf_name, String photo_name) {
		// TODO Auto-generated method stub
		return docRepository.saveDocument(usID, pdf_name, photo_name);
	}

	@Override
	public user_subscription_doc deleteById(int id) {
		// TODO Auto-generated method stub
		return docRepository.deleteById(id);
	}

	
}
