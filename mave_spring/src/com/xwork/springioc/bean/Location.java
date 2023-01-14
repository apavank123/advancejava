package com.xwork.springioc.bean;

import org.springframework.stereotype.Component;

@Component
public class Location {
	
	private Area area;
	
	public Location() {
		System.out.println("Created Location by no-arg const........");
	}

}
