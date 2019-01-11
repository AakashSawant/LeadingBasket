package com.akkidev.leadingBasket.DaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akkidev.leadingBasket.Dao.DocumentDao;
import com.akkidev.leadingBasket.entities.document_master;

@Service
@Transactional
public class DocumentDaoImpl implements DocumentDao {

	@Autowired
	EntityManager em;
	
	@Override
	public List<document_master> getDocuments() {
		
		//return em.createQuery("from document_master").getResultList();
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery< document_master> query = builder.createQuery(document_master.class);
		Root<document_master> root = query.from(document_master.class);
		query.select(root);
		return em.createQuery(query).getResultList();
	}

	@Override
	public document_master getDocumentByCategory(int id) {
	
		return em.find(document_master.class, id);
	}

	@Override
	public void deleteDocument(int id) {
		em.remove(em.find(document_master.class, id));		
	}

	@Override
	public void addDocument(String docname) {
	
		
	}
	

}
