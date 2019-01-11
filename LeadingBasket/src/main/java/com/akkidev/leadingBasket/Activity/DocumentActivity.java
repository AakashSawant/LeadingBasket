package com.akkidev.leadingBasket.Activity;

import java.util.List;

import com.akkidev.leadingBasket.entities.document_master;
import com.akkidev.leadingBasket.entities.user_subscription_doc;

public interface DocumentActivity {

	public List<document_master> getDocuments();
	public document_master getDocumentByCategory(int id);
	public void deleteDocument(int id);
	public void addDocument(String docname);
}
