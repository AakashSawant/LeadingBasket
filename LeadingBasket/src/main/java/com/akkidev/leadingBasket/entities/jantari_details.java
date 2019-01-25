package com.akkidev.leadingBasket.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class jantari_details {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private double rate;

	@ManyToOne(targetEntity = area_master.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "area_id")
	private area_master am;

	private int tpscheme;
	
	private String blockNo;

	private String valuezone;

	@ManyToOne(targetEntity = property_master.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "property_id")
	private property_master pm;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public area_master getAm() {
		return am;
	}

	public void setAm(area_master am) {
		this.am = am;
	}

	public property_master getPm() {
		return pm;
	}

	public void setPm(property_master pm) {
		this.pm = pm;
	}

	public int getTpscheme() {
		return tpscheme;
	}

	public void setTpscheme(int tpscheme) {
		this.tpscheme = tpscheme;
	}

	public String getBlockNo() {
		return blockNo;
	}

	public void setBlockNo(String blockNo) {
		this.blockNo = blockNo;
	}

	public String getValuezone() {
		return valuezone;
	}

	public void setValuezone(String valuezone) {
		this.valuezone = valuezone;
	}
}
