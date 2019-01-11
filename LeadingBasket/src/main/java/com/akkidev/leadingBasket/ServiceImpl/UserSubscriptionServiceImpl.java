package com.akkidev.leadingBasket.ServiceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akkidev.leadingBasket.Activity.UserSubscriptionActivity;
import com.akkidev.leadingBasket.Service.UserSubscriptionService;
import com.akkidev.leadingBasket.entities.user_master;
import com.akkidev.leadingBasket.entities.user_subscription;

@Service
@Transactional
public class UserSubscriptionServiceImpl implements UserSubscriptionService {

	@Autowired
	UserSubscriptionActivity userSubAct;
	
	@Override
	public user_subscription addUserSubscription(long amt) {
		// TODO Auto-generated method stub
		return userSubAct.addUserSubscription(amt);
	}

	@Override
	public List<user_subscription> getAllSubscription() {
		// TODO Auto-generated method stub
		return userSubAct.getAllSubscription();
	}

	@Override
	public user_subscription findSubscriptionById(int id) {
		return userSubAct.findSubscriptionById(id);
		
	}

	

}
