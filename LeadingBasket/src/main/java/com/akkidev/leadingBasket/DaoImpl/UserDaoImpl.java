package com.akkidev.leadingBasket.DaoImpl;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.akkidev.leadingBasket.Dao.UserDao;
import com.akkidev.leadingBasket.entities.city_master;
import com.akkidev.leadingBasket.entities.state_master;
import com.akkidev.leadingBasket.entities.user_master;

@Service
public class UserDaoImpl implements UserDao {

	@Autowired
	private EntityManager em;

	@Transactional
	@Override
	public void addUser(String fname, String lname, Long mobile, String email, Date dob, String address, int city_id,
			int state_id, String gender, String password) {

		user_master user = new user_master();
		city_master ct = em.find(city_master.class, city_id);
		state_master st = em.find(state_master.class, state_id);
		user.setFirst_name(fname);
		user.setLast_name(lname);
		user.setMobile(mobile);
		user.setEmail(email);
		user.setAdderss(address);
		city_id = ct.getId();
		user.setCt(ct);
		state_id = st.getId();
		user.setSt(st);
		user.setGender(gender);
		user.setPassword(password);
		user.setCreate_on(new GregorianCalendar().getTime());
		user.setCreate_by(fname);
		em.persist(user);
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
		return em.find(state_master.class, id);

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

	@Override
	public long getUserCount() {
		Query query = em.createQuery("SELECT count(*) FROM user_master");
		long count = (long) query.getSingleResult();
		return count;
	}

}
