package com.akkidev.leadingBasket.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class bank_charge {

	@Id
	private int id;
	
	@ManyToOne(targetEntity= bank_master.class,cascade=CascadeType.ALL)
	@JoinColumn(name="bank_id")
	private bank_master bm;
	
	private int file_charge;
	
	@ManyToOne(targetEntity= loan_subcategory.class,cascade=CascadeType.ALL)
	@JoinColumn(name="loan_subcategory_id")
	private loan_subcategory ls;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFile_charge() {
		return file_charge;
	}

	public void setFile_charge(int file_charge) {
		this.file_charge = file_charge;
	}

	public loan_subcategory getLs() {
		return ls;
	}

	public void setLs(loan_subcategory ls) {
		this.ls = ls;
	}

	public bank_master getBm() {
		return bm;
	}

	public void setBm(bank_master bm) {
		this.bm = bm;
	}
	
	
}
