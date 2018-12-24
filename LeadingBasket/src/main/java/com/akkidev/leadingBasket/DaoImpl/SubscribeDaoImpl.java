package com.akkidev.leadingBasket.DaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akkidev.leadingBasket.Dao.SubscribeDao;
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

		return em.createQuery("from subcribe u").getResultList();
	}

	public long getSubCount() {
		Query query = em.createQuery("SELECT count(*) FROM subcribe");
		long count = (long) query.getSingleResult();
		return count;
	}

}
