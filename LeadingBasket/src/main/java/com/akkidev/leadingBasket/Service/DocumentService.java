package com.akkidev.leadingBasket.Service;

import java.util.List;

import com.akkidev.leadingBasket.entities.document_master;

public interface DocumentService {

	public List<document_master> getDocuments();
	public document_master getDocumentByCategory(int id);
	public void deleteDocument(int id);
	public void addDocument(String docname);
}
