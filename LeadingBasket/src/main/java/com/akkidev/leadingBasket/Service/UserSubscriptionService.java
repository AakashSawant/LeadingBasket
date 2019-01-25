package com.akkidev.leadingBasket.Service;

import java.util.List;

import com.akkidev.leadingBasket.entities.user_master;
import com.akkidev.leadingBasket.entities.user_subscription;

public interface UserSubscriptionService {

	public user_subscription addUserSubscription(long amt,int id,int cid,int lsid,int bid);
	public List<user_subscription> getAllSubscription();
	public user_subscription findSubscriptionById(int id);
	public List<user_subscription> getAllSubByUserId(int id);
	
	

}
