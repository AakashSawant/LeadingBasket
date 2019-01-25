package com.akkidev.leadingBasket.ActivityImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akkidev.leadingBasket.Activity.UserSubscriptionActivity;
import com.akkidev.leadingBasket.entities.user_master;
import com.akkidev.leadingBasket.entities.user_subscription;
import com.akkidev.leadingBasket.repository.UserSubscriptionRepository;

@Service
@Transactional
public class UserSubscriptionActivityImpl implements UserSubscriptionActivity {

	@Autowired
	UserSubscriptionRepository userSubRepo;
	
	@Override
	public user_subscription addUserSubscription(long amt,int id,int cid,int lsid,int bid) {
		 
		return userSubRepo.addUserSubscription(amt, id, cid, lsid, bid);
	}

	@Override
	public List<user_subscription> getAllSubscription() {
		
		return userSubRepo.getAllSubscription();
	}

	@Override
	public user_subscription findSubscriptionById(int id) {
		return userSubRepo.findSubscriptionById(id);
		
	}

	@Override
	public List<user_subscription> getAllSubByUserId(int id) {
		// TODO Auto-generated method stub
		return userSubRepo.getAllSubByUserId(id);
	}



}
