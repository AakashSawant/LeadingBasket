package com.akkidev.leadingBasket.ServiceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akkidev.leadingBasket.ActivityImpl.SubscribeActivityImpl;
import com.akkidev.leadingBasket.Service.SubscribeService;
import com.akkidev.leadingBasket.entities.subcribe;

@Service
@Transactional
public class SubscribeServiceImpl implements SubscribeService {

	@Autowired
	SubscribeActivityImpl subServiceImpl;
	
	@Override
	public int addSubscriber(String sb) {
				
		return subServiceImpl.addSubscriber(sb);
		
	}

	@Override
	public List<subcribe> getListSub() {
		
		return subServiceImpl.getListSub();
	}

	@Override
	public long getSubCount() {
		return subServiceImpl.getSubCount();
		
	}

	@Override
	public subcribe findSubByEmail(String email) {
		// TODO Auto-generated method stub
		return subServiceImpl.findSubByEmail(email);
	}

}
