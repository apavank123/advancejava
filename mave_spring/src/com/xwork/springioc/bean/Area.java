package com.xwork.springioc.bean;

import org.springframework.stereotype.Component;

@Component
public class Area {
	public Area() {
		System.out.println("calling no-arg const area");
	}

}
