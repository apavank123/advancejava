package com.xwork.dependency_injection.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Shell implements PetrolBunk {

	@Autowired
	private PetrolBunk petrolbunk;
	
	@Override
	public void purchase() {
		System.out.println("Shell will purchase the fuel");
	}

	

	

}
