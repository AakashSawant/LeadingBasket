package com.akkidev.leadingBasket.repositoryImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.akkidev.leadingBasket.Dao.SubscribeDao;
import com.akkidev.leadingBasket.entities.subcribe;
import com.akkidev.leadingBasket.repository.SubscribeRepository;

@Repository
public class SubscribeRepositoryImpl implements SubscribeRepository {

	@Autowired
	SubscribeDao subDao;
	
	@Override
	public int addSubscriber(String sb) {
		return subDao.addSubscriber(sb);
		
	}

	@Override
	public List<subcribe> getListSub() {
		
		return subDao.getListSub();
	}

	@Override
	public long getSubCount() {
		return subDao.getSubCount();
		
	}

}
