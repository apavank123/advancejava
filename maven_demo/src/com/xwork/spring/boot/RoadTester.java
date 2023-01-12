package com.xwork.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xwork.spring.configration.SpringConfiguration;
import com.xwork.spring.things.Road;

public class RoadTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		Road ref = spring.getBean(Road.class);
		System.out.println(ref);
	}

}
