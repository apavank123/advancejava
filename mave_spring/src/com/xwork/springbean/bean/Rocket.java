package com.xwork.springbean.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rocket {

	@Value("India")
	private String contry;
	@Value("ISLV")
	private String name;
	@Value("20000")
	private double budget;

	public Rocket() {
		System.out.println("Created Rocket by spring...");
	}

	public double getBudget() {
		return budget;
	}

	public String getName() {
		return name;
	}

	public String getContry() {
		return contry;
	}

}
