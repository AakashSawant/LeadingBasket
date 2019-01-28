package com.akkidev.leadingBasket.entities;


import java.sql.Blob;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import javax.validation.constraints.NotNull;

@Entity
public class category_master {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@NotNull
	private String name;
	
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

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
