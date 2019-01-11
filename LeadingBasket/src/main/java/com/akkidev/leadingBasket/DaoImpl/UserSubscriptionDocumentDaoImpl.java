package com.akkidev.leadingBasket.DaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akkidev.leadingBasket.Dao.UserSubscriptionDocumentDao;
import com.akkidev.leadingBasket.entities.user_subscription_doc;

@Service
@Transactional
public class UserSubscriptionDocumentDaoImpl implements UserSubscriptionDocumentDao {

	@Autowired
	EntityManager entityManager; 
	
	
	@Override
	public user_subscription_doc findById(int id) {
		
		return entityManager.find(user_subscription_doc.class, id);
	}

	@Override
	public List<user_subscription_doc> findAll() {
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<user_subscription_doc> criteriaQuery = builder.createQuery(user_subscription_doc.class);
		Root<user_subscription_doc> root = criteriaQuery.from(user_subscription_doc.class);
		criteriaQuery.select(root);
		return entityManager.createQuery(criteriaQuery).getResultList();
	}

	@Override
	public List<user_subscription_doc> findAllByUserId(int id) {
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<user_subscription_doc> criteriaQuery = builder.createQuery(user_subscription_doc.class);
		Root<user_subscription_doc> root = criteriaQuery.from(user_subscription_doc.class);
		criteriaQuery.select(root).where(builder.equal(root.get("us"), id));
		return entityManager.createQuery(criteriaQuery).getResultList();
	}

	@Override
	public void saveDocument(user_subscription_doc document) {
		entityManager.persist(document);
		
	}

	@Override
	public void deleteById(int id) {
		entityManager.remove(findById(id));
		
	}

}
