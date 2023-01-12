package com.xwork.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Road extends Object {

	public Road() {
		System.out.println("Created Road by Spring");
	}

	@Override
	public String toString() {
		return "Road [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
