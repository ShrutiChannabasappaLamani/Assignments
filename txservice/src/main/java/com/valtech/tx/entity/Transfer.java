package com.valtech.tx.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ttx")
public class Transfer extends Tx {
	private long fromaccount;
	private long toaccount;
	
	
	public Transfer() {	}
	public Transfer(long fromaccount, long toaccount) {
		super();
		this.fromaccount = fromaccount;
		this.toaccount = toaccount;
	}
	
	public long getFromaccount() {
		return fromaccount;
	}
	public void setFromaccount(long fromaccount) {
		this.fromaccount = fromaccount;
	}
	public long getToaccount() {
		return toaccount;
	}
	public void setToaccount(long toaccount) {
		this.toaccount = toaccount;
	}
	@Override
	public String toString() {
		return "Transfer [fromaccount=" + fromaccount + ", toaccount=" + toaccount + "]";
	}
	
	

}
