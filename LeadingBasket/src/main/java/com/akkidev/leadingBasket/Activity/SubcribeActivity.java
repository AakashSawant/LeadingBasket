package com.akkidev.leadingBasket.Activity;

import java.util.List;

import com.akkidev.leadingBasket.entities.subcribe;

public interface SubcribeActivity {

	public int addSubscriber(String sb);
	public List<subcribe> getListSub();
	public long getSubCount();
	public subcribe findSubByEmail(String email);
}
