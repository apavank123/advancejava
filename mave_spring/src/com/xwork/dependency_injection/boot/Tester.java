package com.xwork.dependency_injection.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xwork.dependency_injection.bean.Shell;
import com.xwork.dependency_injection.configuration.Configuration;

public class Tester {

	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(Configuration.class);
		String[] ref = spring.getBeanDefinitionNames();
		System.out.println(Arrays.toString(ref));

		Shell sell = spring.getBean(Shell.class);
		System.out.println(sell);
	}

}
