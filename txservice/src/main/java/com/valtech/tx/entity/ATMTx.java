package com.valtech.tx.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("atx")
public class ATMTx extends Tx {
	private int atmno;
	private String location;
	
	public ATMTx(){}
	
	public ATMTx(int atmno, String location) {
		super();
		this.atmno = atmno;
		this.location = location;
	}
	public int getAtmno() {
		return atmno;
	}
	public void setAtmno(int atmno) {
		this.atmno = atmno;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "ATMTx [atmno=" + atmno + ", location=" + location + "]";
	}
	
	

}
