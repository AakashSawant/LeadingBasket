package com.akkidev.leadingBasket.repository;

import java.util.List;

import com.akkidev.leadingBasket.entities.user_master;
import com.akkidev.leadingBasket.entities.user_subscription;

public interface UserSubscriptionRepository {

	public user_subscription addUserSubscription(long amt);
	public List<user_subscription> getAllSubscription();
	public user_subscription findSubscriptionById(int id);

}
