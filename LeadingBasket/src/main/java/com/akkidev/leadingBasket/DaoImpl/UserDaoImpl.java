package com.akkidev.leadingBasket.DaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import com.akkidev.leadingBasket.Dao.UserDao;
import com.akkidev.leadingBasket.entities.city_master;
import com.akkidev.leadingBasket.entities.state_master;
import com.akkidev.leadingBasket.entities.user_master;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private EntityManager em;

	@Transactional
	@Override
	public void addUser(user_master user) {

		em.getTransaction().begin();
		em.persist(new city_master().getId());
		em.persist(new state_master().getId());
		em.persist(user);
		em.getTransaction().commit();
		System.out.println("Generated Employee ID = " + user.getId());
	}

	@Transactional
	@Override
	public List<user_master> getUser() {

		List<user_master> list = em.createQuery("from user_master").getResultList();
		return list;
	}

	@Transactional
	@Override
	public user_master findById(int id) {

		return em.find(user_master.class, id);
	}

	@Transactional
	@Override
	public user_master update(user_master user) {

		return em.merge(user);

	}

	@Transactional
	@Override
	public void delete(int id) {

		user_master user = findById(id);
		em.remove(user);
	}

	@Override
	public state_master getStateById(int id) {
		return em.find(state_master.class,id );
		
	}

	@Override
	public List<state_master> getState() {
		List<state_master> states = em.createQuery("from state_master").getResultList();
		return states;
	}

	@Override
	public city_master getCityById(int id) {
		
		return em.find(city_master.class, id);
	}

	@Override
	public List<city_master> getCities() {
		// TODO Auto-generated method stub
		return em.createQuery("from city_master").getResultList();
	}

}
