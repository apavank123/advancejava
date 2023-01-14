package com.xwork.springioc.bean;

import org.springframework.stereotype.Component;

@Component
public class Company {
	
	private Location location;
	
	public Company() {
		System.out.println("Created Company by no-arg const........");
	}

}
