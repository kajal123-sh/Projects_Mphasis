package com.simplilearn.model;

import java.util.Date;

public class EProduct {
	private long id;
	private String name;
	private Date price;

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getPrice() {
		return price;
	}

	public void setPrice(Date price) {
		this.price = price;

	}

}
