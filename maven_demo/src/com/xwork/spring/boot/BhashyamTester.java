package com.xwork.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xwork.spring.configration.SpringConfiguration;
import com.xwork.spring.things.BhashyamCircle;

public class BhashyamTester {

	public static void main(String[] args) {

//		SpringConfiguration configuration = new SpringConfiguration();

		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);

		BhashyamCircle ref = spring.getBean(BhashyamCircle.class);
		System.out.println(ref);
	}

}
