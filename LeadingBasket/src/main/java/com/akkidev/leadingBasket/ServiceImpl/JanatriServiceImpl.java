package com.akkidev.leadingBasket.ServiceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akkidev.leadingBasket.Activity.JanatriActivity;
import com.akkidev.leadingBasket.Service.JanatriService;
import com.akkidev.leadingBasket.entities.area_master;
import com.akkidev.leadingBasket.entities.city_master;
import com.akkidev.leadingBasket.entities.jantari_details;
import com.akkidev.leadingBasket.entities.property_master;
import com.akkidev.leadingBasket.entities.state_master;

@Service
@Transactional
public class JanatriServiceImpl implements JanatriService {

	@Autowired
	JanatriActivity janAct;
	
	@Override
	public List<jantari_details> getAllDetailsJanatri() {
		
		return janAct.getAllDetailsJanatri();
	}

	@Override
	public state_master findRateByState(int stateid) {
		
		return janAct.findRateByState(stateid);
	}

	@Override
	public city_master findRateBycity(int cityid) {

		return janAct.findRateBycity(cityid);
	}

	@Override
	public area_master findRateByArea(int areaid) {
	
		return janAct.findRateByArea(areaid);
	}

	@Override
	public property_master findRateByProperty(int PropertyId) {
		
		return janAct.findRateByProperty(PropertyId);
	}

	@Override
	public jantari_details calculateJanatri(int state, int city, int area, int proType) {
		
		return janAct.calculateJanatri(state, city, area, proType);
	}

	@Override
	public List<state_master> getAllStates() {
	
		return janAct.getAllStates();
	}

	@Override
	public List<city_master> getAllCities() {
	
		return janAct.getAllCities();
	}

	@Override
	public List<area_master> getAllAreas() {
	
		return janAct.getAllAreas();
	}

	@Override
	public List<property_master> getAllProperties() {
	
		return janAct.getAllProperties();
	}

}
