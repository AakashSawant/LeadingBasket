package com.akkidev.leadingBasket.Dao;

import java.util.List;

import com.akkidev.leadingBasket.entities.area_master;
import com.akkidev.leadingBasket.entities.city_master;
import com.akkidev.leadingBasket.entities.jantari_details;
import com.akkidev.leadingBasket.entities.property_master;
import com.akkidev.leadingBasket.entities.state_master;

public interface JanatriDao {

	public List<jantari_details> getAllDetailsJanatri();
	
	public List<state_master> getAllStates();
	public state_master findRateByState(int stateid);
	
	public List<city_master> getAllCities();
	public city_master findRateBycity(int cityid);
	
	public List<area_master> getAllAreas();
	public area_master findRateByArea(int areaid);
	
	public List<property_master> getAllProperties();
	public property_master findRateByProperty(int PropertyId);
	
	public jantari_details calculateJanatri(int state,int city,int area,int proType);
}
