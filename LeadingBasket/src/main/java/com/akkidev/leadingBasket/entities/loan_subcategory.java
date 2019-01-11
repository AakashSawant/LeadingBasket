package com.akkidev.leadingBasket.entities;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.validation.constraints.NotNull;

@Entity
public class loan_subcategory {

	@Id
	private int id;
	
	@NotNull
	@Column(name="loan_sub_cat_name")
	private String loan_sub_cat_name;
	
	@ManyToOne(targetEntity=category_master.class,cascade=CascadeType.ALL)
	@JoinColumn(name="category_id")
	category_master cm;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getLoan_sub_cat_name() {
		return loan_sub_cat_name;
	}

	public void setLoan_sub_cat_name(String loan_sub_cat_name) {
		this.loan_sub_cat_name = loan_sub_cat_name;
	}

	public category_master getCm() {
		return cm;
	}

	public void setCm(category_master cm) {
		this.cm = cm;
	}
	
	
}
