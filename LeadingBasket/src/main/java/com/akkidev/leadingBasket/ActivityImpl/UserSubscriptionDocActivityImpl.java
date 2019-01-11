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
		// TODO Auto-generated method stub
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
	public void saveDocument(user_subscription_doc document) {
		docRepository.saveDocument(document);
		
	}

	@Override
	public void deleteById(int id) {
		docRepository.deleteById(id);
		
	}

}
