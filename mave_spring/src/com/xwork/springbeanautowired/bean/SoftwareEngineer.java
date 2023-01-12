package com.xwork.springbeanautowired.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoftwareEngineer {

	@Autowired
	@Qualifier("nameOfEngg")
	private String name;
	@Autowired
	@Qualifier("company")
	private String companyName;
	@Autowired
	@Qualifier("expOfEngineer")
	private int experience;
	@Autowired
	@Qualifier("salaryOfEngineer")
	private double salary;

	public SoftwareEngineer() {
		System.out.println("Creating Software engineer by spring...");
	}

	@Override
	public String toString() {
		return "SoftwareEngineer [name=" + name + ", companyName=" + companyName + ", experience=" + experience
				+ ", salary=" + salary + "]";
	}

}
