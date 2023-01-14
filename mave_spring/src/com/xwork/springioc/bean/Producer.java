package com.xwork.springioc.bean;

import org.springframework.stereotype.Component;

@Component
public class Producer {

	private Company company;

	public Producer() {
		System.out.println("Created Producer by no-arg const......");
	}
}
