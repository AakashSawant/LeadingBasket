package com.akkidev.leadingBasket.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class subcribe {

	@Id
	int id;
	
	String mail_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMail_id() {
		return mail_id;
	}

	public void setMail_id(String mail_id) {
		this.mail_id = mail_id;
	}
	
	
}
