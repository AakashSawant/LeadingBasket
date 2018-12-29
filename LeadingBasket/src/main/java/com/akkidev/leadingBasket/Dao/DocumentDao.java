package com.akkidev.leadingBasket.Dao;

import java.util.List;


import com.akkidev.leadingBasket.entities.document_master;

public interface DocumentDao {

	public List<document_master> getDocuments();
	public document_master getDocumentByCategory(int id);
	public void deleteDocument(int id);
	public void addDocument(String docname);
}
