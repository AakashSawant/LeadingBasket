package com.akkidev.leadingBasket.repositoryImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.akkidev.leadingBasket.Dao.JanatriDao;
import com.akkidev.leadingBasket.entities.area_master;
import com.akkidev.leadingBasket.entities.city_master;
import com.akkidev.leadingBasket.entities.jantari_details;
import com.akkidev.leadingBasket.entities.property_master;
import com.akkidev.leadingBasket.entities.state_master;
import com.akkidev.leadingBasket.repository.JanatriRepository;

@Repository
public class JanatriRepoImpl implements JanatriRepository {

	@Autowired
	JanatriDao janatriDao;

	@Override
	public List<jantari_details> getAllDetailsJanatri() {

		return janatriDao.getAllDetailsJanatri();
	}

	@Override
	public state_master findRateByState(int stateid) {

		return janatriDao.findRateByState(stateid);
	}

	@Override
	public city_master findRateBycity(int cityid) {

		return janatriDao.findRateBycity(cityid);
	}

	@Override
	public area_master findRateByArea(int areaid) {

		return janatriDao.findRateByArea(areaid);
	}

	@Override
	public property_master findRateByProperty(int PropertyId) {

		return janatriDao.findRateByProperty(PropertyId);
	}

	@Override
	public jantari_details calculateJanatri(int state, int city, int area, int proType) {

		return janatriDao.calculateJanatri(state, city, area, proType);
	}

	@Override
	public List<state_master> getAllStates() {
	
		return janatriDao.getAllStates();
	}

	@Override
	public List<city_master> getAllCities() {
		
		return janatriDao.getAllCities();
	}

	@Override
	public List<area_master> getAllAreas() {
		
		return janatriDao.getAllAreas();
	}

	@Override
	public List<property_master> getAllProperties() {
	
		return janatriDao.getAllProperties();
	}

}
