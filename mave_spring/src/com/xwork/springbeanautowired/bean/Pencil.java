package com.xwork.springbeanautowired.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pencil {

	@Autowired
	@Qualifier("nameOfPencil")
	private String name;
	@Autowired
	@Qualifier("typeOfPencil")
	private String typee;
	@Autowired
	@Qualifier("priceOfPencil")
	private double price;
	@Autowired
	@Qualifier("color")
	private String color;
	@Autowired
	@Qualifier("sharp")
	private boolean sharp;
	@Autowired
	@Qualifier("stolen")
	private boolean stolen;

	public Pencil() {
		System.out.println("Created Pencil by spring..");

	}

	@Override
	public String toString() {
		return "Pencil [name=" + name + ", type=" + typee + ", price=" + price + ", color=" + color + ", sharp=" + sharp
				+ ", stolen=" + stolen + "]";
	}

}
