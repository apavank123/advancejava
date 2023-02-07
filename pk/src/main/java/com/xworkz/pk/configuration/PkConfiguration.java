package com.xworkz.pk.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.pk")
public class PkConfiguration {

	public PkConfiguration() {
		System.out.println("Created...... " + this.getClass().getSimpleName());
	}
}
