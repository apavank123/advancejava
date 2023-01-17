package com.xwork.dependency_injection.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Diesel implements Fuel {

	@Autowired
	private Fuel fuel;

	@Override
	public void consume() {
		// TODO Auto-generated method stub
		System.out.println("Diesel implements to fuel");

	}

}
