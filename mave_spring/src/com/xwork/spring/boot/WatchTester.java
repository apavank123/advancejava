package com.xwork.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xwork.spring.configuration.Config;
import com.xwork.spring.things.WatchBean;

public class WatchTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext spring = new AnnotationConfigApplicationContext(Config.class);
		WatchBean ref = spring.getBean(WatchBean.class);
		System.out.println(ref);
		
	}

}
