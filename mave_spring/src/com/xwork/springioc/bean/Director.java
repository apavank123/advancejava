package com.xwork.springioc.bean;

import org.springframework.stereotype.Component;

@Component

public class Director {
	private Experience experience;

	public Director() {
		System.out.println("Created Director by no-arg const....");
	}
}
