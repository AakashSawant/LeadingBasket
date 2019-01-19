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
import com.akkidev.leadingBasket.entities.user_subscription;
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
	public user_subscription_doc saveDocument(int usID,String pdf_name,String photo_name) {
			
			user_subscription_doc usDoc = new user_subscription_doc();
			usDoc.setUs(entityManager.find(user_subscription.class, usID));
			usDoc.setPhoto_name(photo_name);
			usDoc.setPdf_name(pdf_name);
			entityManager.persist(usDoc);
			return usDoc;
	}

	@Override
	public user_subscription_doc deleteById(int id) {
		
		return entityManager.find(user_subscription_doc.class, id) ;
	}

}
