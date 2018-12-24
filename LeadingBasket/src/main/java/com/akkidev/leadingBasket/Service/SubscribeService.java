package com.akkidev.leadingBasket.Service;

import java.util.List;

import com.akkidev.leadingBasket.entities.subcribe;

public interface SubscribeService {

	public int addSubscriber(String sb);
	public List<subcribe> getListSub();
	public long getSubCount();
}
