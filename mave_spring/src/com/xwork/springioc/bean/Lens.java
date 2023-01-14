package com.xwork.springioc.bean;

import org.springframework.stereotype.Component;

@Component
public class Lens {

	public Lens() {
		System.out.println("Created Lens by no-arg const....");
	}
}
