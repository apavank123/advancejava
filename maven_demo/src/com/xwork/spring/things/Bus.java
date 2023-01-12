package com.xwork.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Bus {

	public Bus() {
		System.out.println("Created Bus by Spring");
	}

	@Override
	public String toString() {
		return "Bus [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
