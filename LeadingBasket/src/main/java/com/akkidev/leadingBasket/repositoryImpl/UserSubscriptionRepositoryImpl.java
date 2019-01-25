package com.akkidev.leadingBasket.repositoryImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.akkidev.leadingBasket.Dao.UserSubscriptionDao;
import com.akkidev.leadingBasket.entities.user_master;
import com.akkidev.leadingBasket.entities.user_subscription;
import com.akkidev.leadingBasket.repository.UserSubscriptionRepository;

@Repository
public class UserSubscriptionRepositoryImpl implements UserSubscriptionRepository {

	@Autowired
	UserSubscriptionDao userSubDao;
	
	@Override
	public user_subscription addUserSubscription(long amt,int id,int cid,int lsid,int bid) {
		// TODO Auto-generated method stub
		return userSubDao.addUserSubscription(amt, id, cid, lsid, bid);
	}

	@Override
	public List<user_subscription> getAllSubscription() {
		
		return userSubDao.getAllSubscription();
	}

	@Override
	public user_subscription findSubscriptionById(int id) {
		return userSubDao.findSubscriptionById(id);
		
	}

	@Override
	public List<user_subscription> getAllSubByUserId(int id) {
		// TODO Auto-generated method stub
		return userSubDao.getAllSubByUserId(id);
	}

	
}
