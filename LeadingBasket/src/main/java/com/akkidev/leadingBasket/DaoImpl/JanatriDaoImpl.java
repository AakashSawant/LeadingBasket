package com.akkidev.leadingBasket.DaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akkidev.leadingBasket.Dao.JanatriDao;
import com.akkidev.leadingBasket.entities.area_master;
import com.akkidev.leadingBasket.entities.city_master;
import com.akkidev.leadingBasket.entities.jantari_details;
import com.akkidev.leadingBasket.entities.property_master;
import com.akkidev.leadingBasket.entities.state_master;

@Service
@Transactional
public class JanatriDaoImpl implements JanatriDao {

	@Autowired
	EntityManager em;

	@Override
	public List<jantari_details> getAllDetailsJanatri() {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<jantari_details> query = builder.createQuery(jantari_details.class);
		Root<jantari_details> root = query.from(jantari_details.class);
		query.select(root);
		return em.createQuery(query).getResultList();
	}

	@Override
	public state_master findRateByState(int stateid) {

		return em.find(state_master.class, stateid);
	}

	@Override
	public city_master findRateBycity(int cityid) {

		return em.find(city_master.class, cityid);
	}

	@Override
	public area_master findRateByArea(int areaid) {

		return em.find(area_master.class, areaid);
	}

	public property_master findRateByProperty(int PropertyId) {
		return em.find(property_master.class, PropertyId);
	}

	public jantari_details calculateJanatri(int state, int city, int area, int proType) {

		return null;
	}

	@Override
	public List<state_master> getAllStates() {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<state_master> query = builder.createQuery(state_master.class);
		Root<state_master> root = query.from(state_master.class);
		query.select(root);
		return em.createQuery(query).getResultList();

	}

	@Override
	public List<city_master> getAllCities() {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<city_master> query = builder.createQuery(city_master.class);
		Root<city_master> root = query.from(city_master.class);
		query.select(root);
		return em.createQuery(query).getResultList();
	}

	@Override
	public List<area_master> getAllAreas() {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<area_master> query = builder.createQuery(area_master.class);
		Root<area_master> root = query.from(area_master.class);
		query.select(root);
		return em.createQuery(query).getResultList();
	}

	@Override
	public List<property_master> getAllProperties() {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<property_master> query = builder.createQuery(property_master.class);
		Root<property_master> root = query.from(property_master.class);
		query.select(root);
		return em.createQuery(query).getResultList();
	}

}
