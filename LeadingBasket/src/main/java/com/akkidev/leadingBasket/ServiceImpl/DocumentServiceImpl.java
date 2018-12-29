package com.akkidev.leadingBasket.ServiceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akkidev.leadingBasket.Activity.DocumentActivity;
import com.akkidev.leadingBasket.Service.DocumentService;
import com.akkidev.leadingBasket.entities.document_master;

@Service
@Transactional
public class DocumentServiceImpl implements DocumentService {

	@Autowired
	DocumentActivity docActivity;
	
	@Override
	public List<document_master> getDocuments() {
		// TODO Auto-generated method stub
		return docActivity.getDocuments();
	}

	@Override
	public document_master getDocumentByCategory(int id) {
		// TODO Auto-generated method stub
		return docActivity.getDocumentByCategory(id);
	}

	@Override
	public void deleteDocument(int id) {
		docActivity.deleteDocument(id);
		
	}

	@Override
	public void addDocument(String docname) {
	docActivity.addDocument(docname);
		
	}

}
