package com.akkidev.leadingBasket.DaoImpl;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.hibernate.Criteria;
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
	public user_master addUser(String fname, String lname, Long mobile, String email, Date dob, String address,
			int city_id, int state_id, String gender, String password) {
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
		return user;
	}

	@Transactional
	@Override
	public List<user_master> getUser() {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<user_master> query = builder.createQuery(user_master.class);
		Root<user_master> root = query.from(user_master.class);
		query.select(root);
		return em.createQuery(query).getResultList();

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
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<state_master> criteriaQuery = builder.createQuery(state_master.class);
		Root<state_master> from = criteriaQuery.from(state_master.class);
		criteriaQuery.select(from);
		return em.createQuery(criteriaQuery).getResultList();
	}

	@Override
	public city_master getCityById(int id) {

		return em.find(city_master.class, id);
	}

	@Override
	public List<city_master> getCities() {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<city_master> criteriaQuery = builder.createQuery(city_master.class);
		Root<city_master> from = criteriaQuery.from(city_master.class);
		criteriaQuery.select(from);
		return em.createQuery(criteriaQuery).getResultList();
		
	}

	@Override
	public long getUserCount() {
		CriteriaBuilder qb = em.getCriteriaBuilder();
		CriteriaQuery<Long> cq = qb.createQuery(Long.class);
		cq.select(qb.count(cq.from(user_master.class)));
		return em.createQuery(cq).getSingleResult();
	}

	@Transactional
	@Override
	public user_master findUserByEmailAndPassword(String email, String pass) {
		user_master usm = new user_master();
		usm.setEmail(email);
		usm.setPassword(pass);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<user_master> query = cb.createQuery(user_master.class);
		Root<user_master> root = query.from(user_master.class);
		query.select(root).where(
				cb.equal(root.get("email"),email),
				cb.equal(root.get("password"),pass)
				);
		return em.createQuery(query).getSingleResult();
	}

}
