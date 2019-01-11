package com.akkidev.leadingBasket.DaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akkidev.leadingBasket.Dao.SubscribeDao;
import com.akkidev.leadingBasket.entities.bank_master;
import com.akkidev.leadingBasket.entities.subcribe;

@Service
@Transactional
public class SubscribeDaoImpl implements SubscribeDao {

	@Autowired
	EntityManager em;

	@Override
	public int addSubscriber(String sb) {
		subcribe sbUser = new subcribe();
		sbUser.setMail_id(sb);
		try {
			em.persist(sbUser);
			System.out.println(sbUser.getMail_id());
			return 1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 0;
		}

	}

	@Override
	public List<subcribe> getListSub() {

		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<subcribe> query = cb.createQuery(subcribe.class);
		Root<subcribe> root = query.from(subcribe.class);
		query.select(root);
		return em.createQuery(query).getResultList();
	
	}

	public long getSubCount() {
	CriteriaBuilder builder = em.getCriteriaBuilder();
	CriteriaQuery<Long> query = builder.createQuery(Long.class);
	query.select(builder.count(query.from(subcribe.class)));
	return em.createQuery(query).getSingleResult();
	}

}
