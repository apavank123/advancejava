package com.xwork.springioc.bean;

import org.springframework.stereotype.Component;

@Component
public class Battery {
	private Capacity capacity;
	public Battery() {
		System.out.println("Created Battery by no-arg const....");
	}
	

}
