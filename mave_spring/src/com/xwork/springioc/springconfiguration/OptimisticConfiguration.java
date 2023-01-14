package com.xwork.springioc.springconfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.xwork.springioc.bean.Company;

@Configuration
@ComponentScan(basePackages="com.xwork.springioc",
excludeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, 
value=Company.class)} )
public class OptimisticConfiguration {
	public OptimisticConfiguration() {
		System.out.println("Created OptimisticConfiguration using no-arg const.........");
	}

	
}
