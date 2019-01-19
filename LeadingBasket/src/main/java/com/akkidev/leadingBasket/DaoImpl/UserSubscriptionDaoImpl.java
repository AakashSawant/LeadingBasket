package com.akkidev.leadingBasket.DaoImpl;

import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akkidev.leadingBasket.Dao.UserSubscriptionDao;
import com.akkidev.leadingBasket.entities.bank_master;
import com.akkidev.leadingBasket.entities.category_master;
import com.akkidev.leadingBasket.entities.loan_subcategory;
import com.akkidev.leadingBasket.entities.user_master;
import com.akkidev.leadingBasket.entities.user_subscription;

@Service
@Transactional
public class UserSubscriptionDaoImpl implements UserSubscriptionDao {

	@Autowired
	EntityManager em;

	@Override
	public List<user_subscription> getAllSubscription() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<user_subscription> criteriaQuery = cb.createQuery(user_subscription.class);
		Root<user_subscription> from = criteriaQuery.from(user_subscription.class);
		criteriaQuery.select(from);
		return em.createQuery(criteriaQuery).getResultList();
	}

	@Override
	public user_subscription findSubscriptionById(int id) {
		return em.find(user_subscription.class, id);		
	}

	@Override
	public user_subscription addUserSubscription(long amt) {
		user_subscription usb = new user_subscription();
		usb.setCm(em.find(category_master.class, 1));
		usb.setLs(em.find(loan_subcategory.class, 1));
		usb.setLoan_Amount(amt);
		usb.setCreate_on(new GregorianCalendar().getTime());
		em.persist(usb);
		return usb;
	}

}
