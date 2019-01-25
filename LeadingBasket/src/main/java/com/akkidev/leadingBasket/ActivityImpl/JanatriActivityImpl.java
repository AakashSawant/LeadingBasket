package com.akkidev.leadingBasket.ActivityImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akkidev.leadingBasket.Activity.JanatriActivity;
import com.akkidev.leadingBasket.entities.area_master;
import com.akkidev.leadingBasket.entities.city_master;
import com.akkidev.leadingBasket.entities.jantari_details;
import com.akkidev.leadingBasket.entities.property_master;
import com.akkidev.leadingBasket.entities.state_master;
import com.akkidev.leadingBasket.repository.JanatriRepository;

@Service
@Transactional
public class JanatriActivityImpl implements JanatriActivity {

	@Autowired
	JanatriRepository janRepo;
	
	@Override
	public List<jantari_details> getAllDetailsJanatri() {
		
		return janRepo.getAllDetailsJanatri();
	}

	@Override
	public state_master findRateByState(int stateid) {
		
		return janRepo.findRateByState(stateid);
	}

	@Override
	public city_master findRateBycity(int cityid) {
		
		return janRepo.findRateBycity(cityid);
	}

	@Override
	public area_master findRateByArea(int areaid) {
	
		return janRepo.findRateByArea(areaid);
	}

	@Override
	public property_master findRateByProperty(int PropertyId) {
	
		return janRepo.findRateByProperty(PropertyId);
	}

	@Override
	public jantari_details calculateJanatri(int state, int city, int area, int proType) {
	
		return janRepo.calculateJanatri(state, city, area, proType);
	}

	@Override
	public List<state_master> getAllStates() {
	
		return janRepo.getAllStates();
	}

	@Override
	public List<city_master> getAllCities() {
		
		return janRepo.getAllCities();
	}

	@Override
	public List<area_master> getAllAreas() {
	
		return janRepo.getAllAreas();
	}

	@Override
	public List<property_master> getAllProperties() {
		
		return janRepo.getAllProperties();
	}

}
