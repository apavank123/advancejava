package com.xwork.springbean.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Flower {

	@Value("Lotus")
	private String name;

	@Value("20")
	private double price;

	@Value("White")
	private String color;

	public Flower() {
		System.out.println("Created Flower by spring");
	}

	public String getName() {
		return name;

	}

	public double getPrice() {
		return price;

	}

	public String getColor() {
		return color;
	}

}
