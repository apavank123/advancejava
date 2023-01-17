package com.xwork.dependency_injection.bean;

import org.springframework.stereotype.Component;

@Component
public class FireFox implements Browser {

	@Override
	public void browse() {
		// TODO Auto-generated method stub
		System.out.println("Running FireFox");
	}

}
