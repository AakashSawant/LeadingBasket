package com.akkidev.leadingBasket.repository;

import java.util.List;

import com.akkidev.leadingBasket.entities.subcribe;

public interface SubscribeRepository {

	public int addSubscriber(String sb);
	public List<subcribe> getListSub();
	public long getSubCount();
}
