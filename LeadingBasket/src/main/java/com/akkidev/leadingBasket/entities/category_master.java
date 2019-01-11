package com.akkidev.leadingBasket.entities;


import java.sql.Blob;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import javax.validation.constraints.NotNull;

@Entity
public class category_master {

	@Id
	private int id;
	
	@NotNull
	private String loan_sub_cat_name;
	
	private Long charge;
	
	@ManyToOne(targetEntity=product_master.class,cascade=CascadeType.ALL)
	@JoinColumn(name="product_id")
	product_master ms;
	
	@Column(name="productImage")
	@Lob
	private byte[] productImage;


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

	public Long getCharge() {
		return charge;
	}

	public void setCharge(Long charge) {
		this.charge = charge;
	}

	public product_master getMs() {
		return ms;
	}

	public void setMs(product_master ms) {
		this.ms = ms;
	}

	public byte[] getProductImage() {
		return productImage;
	}

	public void setProductImage(byte[] productImage) {
		this.productImage = productImage;
	}

	
	
}
