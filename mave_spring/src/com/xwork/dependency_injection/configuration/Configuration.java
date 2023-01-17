package com.xwork.dependency_injection.configuration;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.xwork.dependency_injection")
public class Configuration {

	public Configuration() {
		System.out.println("Cofnigration const created by no arguments....");
	}
}
