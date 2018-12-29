package com.akkidev.leadingBasket.ActivityImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akkidev.leadingBasket.Activity.DocumentActivity;
import com.akkidev.leadingBasket.entities.document_master;
import com.akkidev.leadingBasket.repository.DocumentRepository;

@Service
@Transactional
public class DocumentActivityImpl implements DocumentActivity {

	@Autowired
	DocumentRepository docRepo;
	
	@Override
	public List<document_master> getDocuments() {
		// TODO Auto-generated method stub
		return docRepo.getDocuments();
	}

	@Override
	public document_master getDocumentByCategory(int id) {
		// TODO Auto-generated method stub
		return docRepo.getDocumentByCategory(id);
	}

	@Override
	public void deleteDocument(int id) {
		docRepo.deleteDocument(id);
		
	}

	@Override
	public void addDocument(String docname) {
		docRepo.addDocument(docname);
		
		
	}

}
