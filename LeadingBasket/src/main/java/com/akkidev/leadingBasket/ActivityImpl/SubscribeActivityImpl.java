package com.akkidev.leadingBasket.ActivityImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.akkidev.leadingBasket.Activity.SubcribeActivity;
import com.akkidev.leadingBasket.entities.subcribe;
import com.akkidev.leadingBasket.repository.SubscribeRepository;

@Service
@Transactional
public class SubscribeActivityImpl implements SubcribeActivity {

	@Autowired
	SubscribeRepository subRepo;
	
	@Override
	public int addSubscriber(String sb) {

return subRepo.addSubscriber(sb);
	}

	@Override
	public List<subcribe> getListSub() {
		
		return subRepo.getListSub();
	}

	@Override
	public long getSubCount() {
		return subRepo.getSubCount();
		
	}

}
