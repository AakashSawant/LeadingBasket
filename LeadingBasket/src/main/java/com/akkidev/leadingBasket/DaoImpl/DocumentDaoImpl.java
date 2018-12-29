package com.akkidev.leadingBasket.DaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
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
		// TODO Auto-generated method stub
		return em.createQuery("from document_master").getResultList();
	}

	@Override
	public document_master getDocumentByCategory(int id) {
		// TODO Auto-generated method stub
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
