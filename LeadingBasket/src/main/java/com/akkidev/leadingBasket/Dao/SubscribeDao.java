package com.akkidev.leadingBasket.Dao;

import java.util.List;

import com.akkidev.leadingBasket.entities.subcribe;


public interface SubscribeDao {

	public int addSubscriber(String sb);
	public List<subcribe> getListSub();
	public long getSubCount();
} 
