package com.akkidev.leadingBasket.repositoryImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.akkidev.leadingBasket.Dao.DocumentDao;
import com.akkidev.leadingBasket.entities.document_master;
import com.akkidev.leadingBasket.repository.DocumentRepository;

@Repository
public class DocumentRepositoryImpl implements DocumentRepository {

	@Autowired
	DocumentDao docDao;
	
	@Override
	public List<document_master> getDocuments() {
		// TODO Auto-generated method stub
		return docDao.getDocuments();
	}

	@Override
	public document_master getDocumentByCategory(int id) {
		// TODO Auto-generated method stub
		return docDao.getDocumentByCategory(id);
	}

	@Override
	public void deleteDocument(int id) {
		docDao.deleteDocument(id);
		
	}

	@Override
	public void addDocument(String docname) {
		docDao.addDocument(docname);
		
	}

}
